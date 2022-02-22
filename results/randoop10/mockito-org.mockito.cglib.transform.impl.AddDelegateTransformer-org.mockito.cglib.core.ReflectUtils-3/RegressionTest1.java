import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter1.visitAnnotation("L276889264", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn((int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn((int) (byte) 0, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.util.List list17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list18 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass9, list17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str13, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(classInfo16);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setValue("[Ljava/beans/PropertyDescriptor;", (java.lang.Object) "org.mockito.asm.Type");
        boolean boolean11 = propertyDescriptor3.equals((java.lang.Object) 112);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        classEmitter10.setTarget(classVisitor11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        classEmitter10.setTarget(classVisitor13);
        classEmitter1.setTarget(classVisitor13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("L1900097269", "(IZ)Lhi!;", "(DZ)Z", 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 100 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("C", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, 100]");
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("(DZ)Lhi!;", "L243601416");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classEmitter10.visitField(126, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", "L243601416", "D", (java.lang.Object) type20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        boolean boolean11 = classInfo4.equals((java.lang.Object) classEmitter9);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean22 = classInfo20.equals((java.lang.Object) type21);
        java.lang.String str23 = type21.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        java.lang.String str30 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.declare_field((int) (byte) 10, "[Ljava/beans/PropertyDescriptor;", type21, (java.lang.Object) propertyDescriptorArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org/mockito/asm/Type" + "'", str30, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(propertyDescriptorArray32);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("(IZ)C", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 100, 1]");
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        java.util.Enumeration<java.lang.String> strEnumeration6 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setPreferred(false);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray21 = classInfo20.getInterfaces();
        java.lang.Class<?> wildcardClass22 = classInfo20.getClass();
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, true, false);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray27);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray28);
        boolean boolean30 = propertyDescriptor3.equals((java.lang.Object) methodArray29);
        org.junit.Assert.assertNotNull(strEnumeration6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(classInfo23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11 };
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = propertyDescriptorArray21.getClass();
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer24 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray14, (java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.beans.PropertyDescriptor;.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str23, "[Ljava/beans/PropertyDescriptor;");
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 3;
        label9.info = 130;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 3;
        label14.info = 130;
        java.lang.String str19 = label14.toString();
        java.lang.String str20 = label14.toString();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str26 = signature25.toString();
        label21.info = str26;
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        label28.info = 3;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = 3;
        label31.info = 130;
        java.lang.String str36 = label31.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        int int39 = type38.getSize();
        label31.info = int39;
        org.mockito.asm.Label label41 = new org.mockito.asm.Label();
        java.lang.Object obj42 = label41.info;
        java.lang.Class[] classArray43 = new java.lang.Class[] {};
        int int44 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray43);
        label41.info = classArray43;
        org.mockito.asm.Label label46 = new org.mockito.asm.Label();
        java.lang.Object obj47 = label46.info;
        org.mockito.cglib.core.Signature signature50 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str51 = signature50.toString();
        label46.info = str51;
        java.lang.String str53 = label46.toString();
        org.mockito.asm.Label[] labelArray54 = new org.mockito.asm.Label[] { label14, label21, label28, label31, label41, label46 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTableSwitchInsn(9, (int) (short) -1, label9, labelArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1845527987" + "'", str19, "L1845527987");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1845527987" + "'", str20, "L1845527987");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1062281554" + "'", str36, "L1062281554");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(classArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L1649805187" + "'", str53, "L1649805187");
        org.junit.Assert.assertNotNull(labelArray54);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn((int) (short) 100, "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        int int6 = classInfo5.getModifiers();
        int int7 = classInfo5.getModifiers();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        boolean boolean13 = classInfo5.equals((java.lang.Object) wildcardClass11);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSize();
        int int4 = type1.getOpcode(126);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 130 + "'", int4 == 130);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitInnerClass("hi!", "L930922338", "[Ljava/beans/PropertyDescriptor;", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 3;
        label6.info = 130;
        java.lang.String str11 = label6.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSize();
        label6.info = int14;
        int[] intArray19 = new int[] { (byte) 10, '4', (-1) };
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        label20.info = ' ';
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        label24.info = 3;
        label24.info = 130;
        java.lang.String str29 = label24.toString();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        label30.info = 3;
        label30.info = 130;
        java.lang.String str35 = label30.toString();
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        int int38 = type37.getSize();
        label30.info = int38;
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        label40.info = ' ';
        java.lang.Object obj44 = label40.info;
        org.mockito.asm.Label[] labelArray45 = new org.mockito.asm.Label[] { label20, label24, label30, label40 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLookupSwitchInsn(label6, intArray19, labelArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L73655100" + "'", str11, "L73655100");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 52, -1]");
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1844634373" + "'", str29, "L1844634373");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L1099753689" + "'", str35, "L1099753689");
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + ' ' + "'", obj44, ' ');
        org.junit.Assert.assertNotNull(labelArray45);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        int int10 = classInfo9.getModifiers();
        org.mockito.asm.Type type11 = classInfo9.getSuperType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        int int18 = classInfo17.getModifiers();
        int int19 = classInfo17.getModifiers();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        boolean boolean25 = classInfo17.equals((java.lang.Object) wildcardClass23);
        org.mockito.asm.Type[] typeArray26 = classInfo17.getInterfaces();
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray26);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(classInfo17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "()Ljava/lang/Object;" + "'", str27, "()Ljava/lang/Object;");
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        int int6 = classInfo5.getModifiers();
        int int7 = classInfo5.getModifiers();
        org.mockito.asm.Type[] typeArray8 = classInfo5.getInterfaces();
        org.mockito.asm.Type type9 = classInfo5.getSuperType();
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.util.List list11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list12 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass10, list11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter4.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 3;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        label10.info = classArray12;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 3;
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] { label10, label15 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) ' ', 0, label7, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(labelArray18);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = null;
        int[] intArray13 = new int[] { 130, (short) 1, 1, 154, ' ', (byte) 100 };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str19 = signature18.toString();
        label14.info = str19;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 3;
        label21.info = 130;
        label14.info = 130;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.Object obj28 = label27.info;
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str32 = signature31.toString();
        label27.info = str32;
        java.lang.Object obj34 = label27.info;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.Object obj36 = label35.info;
        java.lang.Class[] classArray37 = new java.lang.Class[] {};
        int int38 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray37);
        label35.info = classArray37;
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        java.lang.Object obj41 = label40.info;
        label40.info = ' ';
        java.lang.Object obj44 = label40.info;
        org.mockito.asm.Type type45 = org.mockito.asm.Type.BYTE_TYPE;
        int int46 = type45.getSort();
        label40.info = type45;
        org.mockito.asm.Label label48 = new org.mockito.asm.Label();
        label48.info = 3;
        label48.info = 130;
        java.lang.String str53 = label48.toString();
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        int int56 = type55.getSize();
        label48.info = int56;
        org.mockito.asm.Label[] labelArray58 = new org.mockito.asm.Label[] { label14, label27, label35, label40, label48 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label6, intArray13, labelArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[130, 1, 1, 154, 32, 100]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(classArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + ' ' + "'", obj44, ' ');
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L154594094" + "'", str53, "L154594094");
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(labelArray58);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.SHORT_TYPE;
        int int7 = type5.getOpcode(133);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 133 + "'", int7 == 133);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn(130, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(5);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type5.getOpcode(5);
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type5);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type3, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        java.lang.Class<?> wildcardClass18 = classInfo16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer20 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray11, (java.lang.Class) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ReflectUtils$4.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(DZ)Z" + "'", str10, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(classInfo19);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("()Lorg/mockito/asm/Type;", classLoader1);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("Z", "Lorg/mockito/cglib/core/Signature;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = classEmitter10.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray24 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray24);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter12.visit(107, 8, "(IZ)Lhi!;", "Lorg/mockito/cglib/core/Signature;", "D", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(methodArray25);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter3.visitAnnotation("Lorg/mockito/cglib/core/Signature;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str10 = signature9.toString();
        label5.info = str10;
        java.lang.String str12 = label5.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        label13.info = 3;
        label13.info = 130;
        java.lang.String str18 = label13.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSize();
        label13.info = int21;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label13, label23, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1686385548" + "'", str12, "L1686385548");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1273399991" + "'", str18, "L1273399991");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTypeInsn((int) (short) 1, "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray23 = new java.lang.Class[] {};
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        java.lang.String[] strArray25 = org.mockito.cglib.core.ReflectUtils.getNames(classArray23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type[] typeArray31 = classInfo30.getInterfaces();
        java.lang.Class<?> wildcardClass32 = classInfo30.getClass();
        org.mockito.cglib.core.ClassInfo classInfo33 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass32);
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass32);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray34, true, false);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray25, methodArray37);
        java.lang.reflect.Method[] methodArray39 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor40 = classEmitter12.visitMethod((-1), "hi!", "L9368052", "L1900097269", strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@557056ee");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classInfo30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(classInfo33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
        org.junit.Assert.assertNotNull(methodArray39);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter7.visitAnnotation("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("Z");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor13 = classEmitter3.visitField(154, "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V", "boolean", "(IZ)Lhi!;", (java.lang.Object) "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        java.lang.String[] strArray18 = org.mockito.cglib.core.ReflectUtils.getNames(classArray16);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(116, (int) (short) -1, (java.lang.Object[]) propertyDescriptorArray14, (int) (short) 10, (java.lang.Object[]) strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter4.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@342c98a7");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        java.lang.Class<?> wildcardClass7 = classInfo5.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean17 = classInfo14.equals((java.lang.Object) type16);
        int int18 = classInfo14.getModifiers();
        org.mockito.asm.Type type19 = classInfo14.getType();
        boolean boolean20 = classInfo8.equals((java.lang.Object) type19);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.Class<?> wildcardClass24 = type22.getClass();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean29 = classInfo26.equals((java.lang.Object) type28);
        org.mockito.asm.Type[] typeArray30 = classInfo26.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("()Ljava/lang/Object;", type19, typeArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Ljava/lang/Object;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(classInfo14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(classInfo26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitIntInsn(154, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(130, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.lang.Class[] classArray25 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray24);
        int int26 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray25);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor28 = classEmitter12.visitMethod(155, "java.beans.PropertyDescriptor[name=hi!]", "L9368052", "L276889264", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5cb47aaf");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(classInfo23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (byte) 0, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFieldInsn(154, "L930922338", "org.mockito.asm.Type", "[Ljava/beans/PropertyDescriptor;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("L1900097269", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.Object obj8 = propertyDescriptor3.getValue("L276889264");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        boolean boolean11 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setReadMethod(method12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean17 = type15.equals((java.lang.Object) ' ');
        boolean boolean18 = propertyDescriptor3.equals((java.lang.Object) type15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitInnerClass("L243601416", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", "(IZ)Lhi!;", 133);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        classEmitter10.setTarget(classVisitor11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        classEmitter10.setTarget(classVisitor13);
        classEmitter1.setTarget(classVisitor13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor21 = classEmitter1.visitAnnotation("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = classEmitter3.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type19.getOpcode(5);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int26 = type24.getOpcode(5);
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local((-1), type24);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type22, type24 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean40 = classInfo37.equals((java.lang.Object) type39);
        int int41 = classInfo37.getModifiers();
        org.mockito.asm.Type type42 = classInfo37.getType();
        org.mockito.asm.Type type43 = type42.getElementType();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("hi!");
        int int46 = type45.getSort();
        java.lang.Class<?> wildcardClass47 = type45.getClass();
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass47);
        org.mockito.cglib.core.ClassInfo classInfo49 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass47);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean52 = classInfo49.equals((java.lang.Object) type51);
        java.lang.Object obj53 = null;
        boolean boolean54 = type51.equals(obj53);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getObjectType("hi!");
        int int57 = type56.getSort();
        java.lang.Class<?> wildcardClass58 = type56.getClass();
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass58);
        org.mockito.cglib.core.ClassInfo classInfo60 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass58);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean63 = classInfo60.equals((java.lang.Object) type62);
        int int64 = classInfo60.getModifiers();
        org.mockito.asm.Type type65 = classInfo60.getType();
        org.mockito.asm.Type type66 = type65.getElementType();
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type30, type31, type43, type51, type66 };
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("", type19, typeArray67);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter69 = classEmitter10.begin_method((int) (byte) 0, signature17, typeArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@15eea833");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(DZ)Z" + "'", str29, "(DZ)Z");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(classInfo37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(classInfo49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(classInfo60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("L243601416hi!", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.CHAR_TYPE;
        int int4 = type2.getOpcode(10);
        java.lang.String str5 = type2.getClassName();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getInternalName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(0, type8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type14.getOpcode(5);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type12, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray19);
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L107191322", type1, typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "char" + "'", str5, "char");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(IZ)Lhi!;" + "'", str20, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(IZ)C" + "'", str21, "(IZ)C");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter12.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(157, (int) (short) 0, "(JLorg/mockito/asm/Type;)Lhi!;", "Z", "org/mockito/asm/Type", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn(0, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "org.mockito.asm.Type", "(DZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        propertyDescriptor8.setHidden(false);
        propertyDescriptor8.setDisplayName("boolean");
        boolean boolean13 = propertyDescriptor8.isHidden();
        java.lang.String str14 = propertyDescriptor8.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor8.attributeNames();
        java.lang.reflect.Method method16 = propertyDescriptor8.getReadMethod();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSort();
        int int22 = type18.getOpcode(104);
        java.lang.String str23 = type18.getDescriptor();
        propertyDescriptor8.setValue("(JLorg/mockito/asm/Type;)Lhi!;", (java.lang.Object) str23);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) "(JLorg/mockito/asm/Type;)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "boolean" + "'", str14, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "double" + "'", str19, "double");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 107 + "'", int22 == 107);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "D" + "'", str23, "D");
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter4.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(108, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit((int) (short) 100, (int) (byte) 1, "L107191322", "L1900097269", "L930922338", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("D", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "L527178774", 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(128, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean8 = classInfo5.equals((java.lang.Object) type7);
        int int9 = classInfo5.getModifiers();
        org.mockito.asm.Type type10 = classInfo5.getType();
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.Object obj14 = label13.info;
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        label13.info = classArray15;
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass11, "()Ljava/lang/Object;", classArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ()Ljava/lang/Object;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("()Ljava/lang/Object;", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Ljava/lang/Object;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        java.lang.Class[] classArray2 = new java.lang.Class[] {};
        int int3 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray2);
        label0.info = classArray2;
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        java.lang.Class<?> wildcardClass9 = classEmitter8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer10 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray2, (java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ClassEmitter.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(classArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(classInfo7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMaxs(4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("L1015173504", "L1217139539", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("Lorg/mockito/asm/Type;", "()Lorg/mockito/asm/Type;", "L243601416hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        boolean boolean6 = signature2.equals((java.lang.Object) 156);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter6.visitAnnotation("(DZ)Lhi!;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 3;
        label9.info = 130;
        java.lang.String str14 = label9.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 3;
        label15.info = 130;
        java.lang.String str20 = label15.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("[Ljava/beans/PropertyDescriptor;", "double", "L243601416hi!", label9, label15, 133);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 133");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L745146099" + "'", str14, "L745146099");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1260236926" + "'", str20, "L1260236926");
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = classEmitter7.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        label6.info = ' ';
        label6.info = 100.0d;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(153, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        classEmitter6.setTarget(classVisitor7);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        classEmitter6.setTarget(classVisitor9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = classEmitter6.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitInnerClass("Lorg/mockito/asm/Type;", "(IZ)C", "L243601416hi!", 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray32 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray32);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray32);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter15.visit(100, 112, "char", "()Ljava/lang/Object;", "", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(methodArray34);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitInnerClass("(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V", "(IZ)C", "double", 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method11 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "()Lorg/mockito/asm/Type;", classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ()Lorg/mockito/asm/Type;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(96, "L243601416", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        label7.info = ' ';
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str16 = signature15.toString();
        label11.info = str16;
        java.lang.String str18 = label11.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label6, label7, label11, "(IZ)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1441374415" + "'", str18, "L1441374415");
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        java.util.Enumeration<java.lang.String> strEnumeration6 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        java.lang.String str9 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(strEnumeration6);
        org.junit.Assert.assertNotNull(strEnumeration7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; constrained]" + "'", str9, "java.beans.PropertyDescriptor[name=hi!; constrained]");
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTypeInsn((int) '#', "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Lhi!;");
        java.lang.String str3 = type2.toString();
        int int4 = type2.getSize();
        org.mockito.asm.Type[] typeArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", type2, typeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Lhi!;" + "'", str3, "Lhi!;");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str6 = signature5.getName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        boolean boolean19 = signature5.equals((java.lang.Object) typeArray16);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(DZ)Z" + "'", str17, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(DZ)Z" + "'", str20, "(DZ)Z");
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 3;
        label4.info = 130;
        java.lang.String str9 = label4.toString();
        java.lang.Object obj10 = label4.info;
        int[] intArray11 = new int[] {};
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 3;
        label12.info = 130;
        java.lang.String str17 = label12.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSize();
        label12.info = int20;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str27 = signature26.toString();
        label22.info = str27;
        java.lang.String str29 = label22.toString();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        label30.info = 3;
        java.lang.String str33 = label30.toString();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int36 = type34.getOpcode(5);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int39 = type37.getOpcode(5);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type42.getOpcode(5);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((-1), type42);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type40, type42 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray46);
        label30.info = str48;
        org.mockito.asm.Label label50 = new org.mockito.asm.Label();
        label50.info = 3;
        label50.info = 130;
        java.lang.String str55 = label50.toString();
        java.lang.Object obj56 = label50.info;
        org.mockito.asm.Label[] labelArray57 = new org.mockito.asm.Label[] { label12, label22, label30, label50 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray11, labelArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1991315247" + "'", str9, "L1991315247");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 130 + "'", obj10, 130);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1340595849" + "'", str17, "L1340595849");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L306019861" + "'", str29, "L306019861");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L168714346" + "'", str33, "L168714346");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(DZ)Z" + "'", str47, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(DZ)Z" + "'", str48, "(DZ)Z");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L1949884019" + "'", str55, "L1949884019");
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + 130 + "'", obj56, 130);
        org.junit.Assert.assertNotNull(labelArray57);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L527178774", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.Class[] classArray14 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11 };
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer24 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray14, (java.lang.Class) wildcardClass21);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature5 = new org.mockito.cglib.core.Signature("L243601416", "hi!");
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        org.mockito.asm.Type type14 = classInfo11.getSuperType();
        org.mockito.asm.Type[] typeArray15 = classInfo11.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter16 = classEmitter1.begin_method(108, signature5, typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5ae58edb");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("Lorg/mockito/cglib/core/ReflectUtils$4;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter2.visitField(124, "L243601416", "char", "(DZ)Lhi!;", (java.lang.Object) "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        boolean boolean10 = propertyDescriptor3.isHidden();
        java.lang.String str11 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        propertyDescriptor15.setConstrained(true);
        boolean boolean18 = propertyDescriptor15.isHidden();
        java.lang.Object obj20 = propertyDescriptor15.getValue("L276889264");
        java.lang.reflect.Method method21 = null;
        propertyDescriptor15.setWriteMethod(method21);
        propertyDescriptor15.setPreferred(false);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type30 = classInfo29.getType();
        java.beans.PropertyEditor propertyEditor31 = propertyDescriptor15.createPropertyEditor((java.lang.Object) type30);
        boolean boolean32 = propertyDescriptor3.equals((java.lang.Object) propertyEditor31);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classInfo29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNull(propertyEditor31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("Lhi!;", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber((int) (byte) 0, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L9368052");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitOuterClass("Lorg/mockito/cglib/core/ReflectUtils$4;", "L930922338", "L107191322");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray22);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray22);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray24);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(108, (int) (short) 1, "L1900097269", "L107191322", "hi!", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
        org.junit.Assert.assertNotNull(methodArray25);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(DZ)Z");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str8 = signature7.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray14 = classInfo13.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter2.begin_method(9, signature7, typeArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6230603e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "L527178774");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        propertyDescriptor3.setPreferred(false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = null;
        java.beans.PropertyDescriptor propertyDescriptor13 = new java.beans.PropertyDescriptor("hi!", method11, method12);
        propertyDescriptor13.setHidden(false);
        propertyDescriptor13.setDisplayName("boolean");
        boolean boolean18 = propertyDescriptor13.isHidden();
        boolean boolean19 = propertyDescriptor13.isPreferred();
        boolean boolean20 = propertyDescriptor3.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter3.visitAnnotation("L9368052", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(158, "L1483665173", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = classEmitter5.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) 10, "L243601416", (org.mockito.asm.MethodVisitor) localVariablesSorter8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) (short) 10, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.beans.PropertyDescriptor[name=hi!; displayName=boolean]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 60");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter6.visitAnnotation("()Lorg/mockito/asm/Type;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        java.lang.Class<?> wildcardClass20 = classInfo18.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray25);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(133, 7, "L930922338", "char", "L107191322", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3, classArray12, (java.lang.Object[]) propertyDescriptorArray20);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, false, true);
        java.lang.Class[] classArray19 = new java.lang.Class[] {};
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        java.lang.String[] strArray21 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray19);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(7, 112, (java.lang.Object[]) propertyDescriptorArray14, 124, (java.lang.Object[]) strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter5.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = localVariablesSorter3.visitParameterAnnotation(0, "()Lorg/mockito/asm/Type;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyType();
        boolean boolean8 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        java.lang.String[] strArray4 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray8, methodArray13);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray15);
        java.lang.Class<?> wildcardClass17 = methodArray16.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] {};
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray18);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor22 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass17, classArray18);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.lang.reflect.Method;.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L1015173504");
        int int2 = type1.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        label7.info = ' ';
        java.lang.Object obj11 = label7.info;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BYTE_TYPE;
        int int13 = type12.getSort();
        label7.info = type12;
        java.lang.Object obj15 = label7.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str21 = signature20.toString();
        label16.info = str21;
        java.lang.String str23 = label16.toString();
        java.lang.String str24 = label16.toString();
        java.lang.String str25 = label16.toString();
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        java.lang.Object obj27 = label26.info;
        label26.info = ' ';
        java.lang.Object obj30 = label26.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label16, label26, "java.beans.PropertyDescriptor[name=hi!; constrained]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + ' ' + "'", obj11, ' ');
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "B");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L8410673" + "'", str23, "L8410673");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L8410673" + "'", str24, "L8410673");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L8410673" + "'", str25, "L8410673");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + ' ' + "'", obj30, ' ');
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("(IZ)Lhi!;", "Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("L527178774");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type10);
        int int14 = local13.getIndex();
        boolean boolean15 = propertyDescriptor3.equals((java.lang.Object) local13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 3;
        label4.info = 130;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        label9.info = classArray11;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        label14.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label9, label14, "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type15 = classEmitter12.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str14 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean25 = classInfo22.equals((java.lang.Object) type24);
        int int26 = classInfo22.getModifiers();
        org.mockito.asm.Type[] typeArray27 = classInfo22.getInterfaces();
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray27);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type30.getOpcode(5);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type33.getOpcode(5);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type38.getOpcode(5);
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((-1), type38);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type36, type38 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray42);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type30, typeArray42);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitFrame(0, 3, (java.lang.Object[]) typeArray27, 107, (java.lang.Object[]) typeArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(classInfo22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str28, "()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(DZ)Z" + "'", str43, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "(DZ)Z" + "'", str44, "(DZ)Z");
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getName();
        java.lang.String str5 = signature2.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.LONG_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field((int) (short) 0, "L1015173504", type8, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor7 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(158, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitVarInsn((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass14);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray16);
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor20 = classEmitter5.visitMethod((-1), "L1483665173", "L527178774", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@47032605");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 3;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(154, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        label9.info = ' ';
        java.lang.Object obj13 = label9.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L1068302868", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "L276889264", label7, label9, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + ' ' + "'", obj13, ' ');
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitOuterClass("char", "D", "L1015173504");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("", "L1015173504", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = classEmitter7.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(158, "(IZ)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 3;
        label6.info = 130;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(0, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(107, "(DZ)Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        int int11 = type9.getOpcode(10);
        java.lang.String str12 = type9.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        java.lang.String[] strArray31 = org.mockito.cglib.core.ReflectUtils.getNames(classArray29);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor32 = classEmitter4.visitMethod(10, "char", "", "L9368052", strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3896f58");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "char" + "'", str12, "char");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(IZ)Lhi!;" + "'", str27, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(IZ)C" + "'", str28, "(IZ)C");
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean10 = classInfo7.equals((java.lang.Object) type9);
        org.mockito.asm.Type type11 = classInfo7.getSuperType();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType("(IZ)Lhi!;");
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean25 = classInfo23.equals((java.lang.Object) type24);
        java.lang.String str26 = type24.toString();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type11, type13, type15, type16, type24 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(classInfo23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Z" + "'", str26, "Z");
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V" + "'", str28, "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V");
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str12 = signature11.toString();
        label7.info = str12;
        java.lang.String str14 = label7.toString();
        java.lang.String str15 = label7.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(124, label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1733399696" + "'", str14, "L1733399696");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1733399696" + "'", str15, "L1733399696");
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setReadMethod(method9);
        propertyDescriptor3.setShortDescription("(IZ)Lhi!;");
        java.lang.String str13 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]" + "'", str13, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        label8.info = 1.0d;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = 3;
        label12.info = 130;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        label17.info = ' ';
        java.lang.Object obj21 = label17.info;
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.Object obj23 = label22.info;
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str27 = signature26.toString();
        label22.info = str27;
        java.lang.String str29 = label22.toString();
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.Object obj31 = label30.info;
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str35 = signature34.toString();
        label30.info = str35;
        java.lang.String str37 = label30.toString();
        java.lang.String str38 = label30.toString();
        org.mockito.asm.Label[] labelArray39 = new org.mockito.asm.Label[] { label12, label17, label22, label30 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn((int) (byte) -1, 128, label8, labelArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + ' ' + "'", obj21, ' ');
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1712364146" + "'", str29, "L1712364146");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1152065634" + "'", str37, "L1152065634");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L1152065634" + "'", str38, "L1152065634");
        org.junit.Assert.assertNotNull(labelArray39);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(96, "Z", methodVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("[Ljava/beans/PropertyDescriptor;", "D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray22 = classInfo21.getInterfaces();
        org.mockito.asm.Type type23 = classInfo21.getType();
        org.mockito.asm.Type type24 = type23.getElementType();
        boolean boolean25 = type15.equals((java.lang.Object) type23);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getObjectType("hi!");
        int int28 = type27.getSort();
        java.lang.Class<?> wildcardClass29 = type27.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass29);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("hi!");
        int int35 = type34.getSort();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int38 = type36.getOpcode(5);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int41 = type39.getOpcode(5);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type44.getOpcode(5);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((-1), type44);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type42, type44 };
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray48);
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type36, typeArray48);
        java.lang.String str51 = org.mockito.asm.Type.getMethodDescriptor(type34, typeArray48);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray48);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.begin_class(126, (int) (byte) 0, "char", type15, typeArray48, "L243601416");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classInfo30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(DZ)Z" + "'", str49, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(DZ)Z" + "'", str50, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "(DZ)Lhi!;" + "'", str51, "(DZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(DZ)Lorg/mockito/asm/Type;" + "'", str52, "(DZ)Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(158, "L1217139539", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = classEmitter1.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.CHAR_TYPE;
        int int16 = type14.getOpcode(10);
        org.mockito.asm.Type[] typeArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.begin_class((int) 'a', (int) 'a', "C", type14, typeArray17, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        int[] intArray7 = null;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        label8.info = ' ';
        java.lang.Object obj12 = label8.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSort();
        label8.info = type13;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = 3;
        label16.info = 130;
        java.lang.String str21 = label16.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        int int24 = type23.getSort();
        java.lang.Class<?> wildcardClass25 = type23.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass25);
        int int28 = classInfo27.getModifiers();
        org.mockito.asm.Type type29 = classInfo27.getSuperType();
        label16.info = classInfo27;
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = 3;
        java.lang.String str34 = label31.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type35.getOpcode(5);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type38.getOpcode(5);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type43.getOpcode(5);
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((-1), type43);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type41, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray47);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray47);
        label31.info = str49;
        java.lang.String str51 = label31.toString();
        org.mockito.asm.Label label52 = new org.mockito.asm.Label();
        java.lang.Object obj53 = label52.info;
        java.lang.Class[] classArray54 = new java.lang.Class[] {};
        int int55 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray54);
        label52.info = classArray54;
        org.mockito.asm.Label[] labelArray57 = new org.mockito.asm.Label[] { label8, label16, label31, label52 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray7, labelArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L328602653" + "'", str21, "L328602653");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(classInfo27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(type29);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L607666312" + "'", str34, "L607666312");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(DZ)Z" + "'", str48, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(DZ)Z" + "'", str49, "(DZ)Z");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L607666312" + "'", str51, "L607666312");
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(classArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(labelArray57);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type[] typeArray12 = classInfo11.getInterfaces();
        java.lang.Class<?> wildcardClass13 = classInfo11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer14 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ReflectUtils$4.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitSource("(DZ)Lhi!;", "L1483665173");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter6.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitAnnotation("boolean", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(0, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.Object obj8 = propertyDescriptor3.getValue("L276889264");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        boolean boolean11 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method12 = null;
        propertyDescriptor3.setReadMethod(method12);
        java.lang.reflect.Method method14 = null;
        propertyDescriptor3.setWriteMethod(method14);
        java.lang.String str16 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; constrained]" + "'", str16, "java.beans.PropertyDescriptor[name=hi!; constrained]");
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->java.beans");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 3;
        java.lang.String str10 = label7.toString();
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 3;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str19 = signature18.toString();
        label14.info = str19;
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 3;
        label21.info = 130;
        label14.info = 130;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitTryCatchBlock(label7, label11, label14, "(DZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L974873734" + "'", str10, "L974873734");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean12 = classInfo9.equals((java.lang.Object) type11);
        org.mockito.asm.Type[] typeArray13 = classInfo9.getInterfaces();
        org.mockito.asm.Type type14 = classInfo9.getSuperType();
        java.lang.reflect.Method method16 = null;
        java.lang.reflect.Method method17 = null;
        java.beans.PropertyDescriptor propertyDescriptor18 = new java.beans.PropertyDescriptor("hi!", method16, method17);
        propertyDescriptor18.setHidden(false);
        propertyDescriptor18.setDisplayName("boolean");
        boolean boolean23 = propertyDescriptor18.isHidden();
        boolean boolean24 = propertyDescriptor18.isExpert();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(154, "boolean", type14, (java.lang.Object) boolean24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        boolean boolean15 = type1.equals((java.lang.Object) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray22);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor25 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass9, classArray23);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str13, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 3;
        java.lang.String str9 = label6.toString();
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        label10.info = classArray12;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        label15.info = 1.0d;
        java.lang.String str19 = label15.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTryCatchBlock(label6, label10, label15, "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L714324" + "'", str9, "L714324");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L732719408" + "'", str19, "L732719408");
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        classEmitter10.setTarget(classVisitor11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        classEmitter10.setTarget(classVisitor13);
        classEmitter1.setTarget(classVisitor13);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str23 = signature22.getDescriptor();
        org.mockito.asm.Type[] typeArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter25 = classEmitter1.begin_method((int) (byte) -1, signature22, typeArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@d7664a7");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("L1068302868", "()Ljava/lang/Object;", "L340719626");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter5.visitParameterAnnotation(158, "Lorg/mockito/asm/Type;(IZ)C", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIincInsn(116, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("org/mockito/asm/Type", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10 };
        java.lang.ClassLoader classLoader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class5 = org.mockito.cglib.core.ReflectUtils.defineClass("", byteArray3, classLoader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 10]");
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter4.visitAnnotation("L971073760", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, true, false);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray19, false, true);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(6, (int) '#', (java.lang.Object[]) propertyDescriptorArray12, 157, (java.lang.Object[]) propertyDescriptorArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertNotNull(methodArray25);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type[] typeArray28 = classInfo27.getInterfaces();
        java.lang.Class<?> wildcardClass29 = classInfo27.getClass();
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass29);
        java.beans.PropertyDescriptor[] propertyDescriptorArray31 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass29);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray31, true, false);
        java.lang.reflect.Method[] methodArray35 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray22, methodArray34);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor37 = classEmitter7.visitMethod(158, "Lorg/mockito/cglib/core/Signature;", "", "S", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@47f09f6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(classInfo27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(classInfo30);
        org.junit.Assert.assertNotNull(propertyDescriptorArray31);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(methodArray35);
        org.junit.Assert.assertNotNull(methodArray36);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = classInfo10.getType();
        org.mockito.asm.Type type12 = classInfo10.getType();
        org.mockito.asm.Type type13 = type12.getElementType();
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(100, "L107191322", type12, obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.util.List list2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list3 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass1, list2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter7.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4f916eb5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter7.visitAnnotation("Lorg/mockito/asm/Type;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean9 = classInfo6.equals((java.lang.Object) type8);
        int int10 = classInfo6.getModifiers();
        org.mockito.asm.Type type11 = classInfo6.getType();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        boolean boolean29 = type15.equals((java.lang.Object) 10L);
        int int30 = type15.getSort();
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local(9, type15);
        org.mockito.asm.Type type32 = local31.getType();
        boolean boolean33 = classInfo6.equals((java.lang.Object) local31);
        boolean boolean35 = classInfo6.equals((java.lang.Object) 100.0d);
        org.mockito.asm.Type type36 = classInfo6.getSuperType();
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("hi!");
        int int42 = type41.getSort();
        java.lang.String str43 = type41.getInternalName();
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local(0, type41);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type47 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int49 = type47.getOpcode(5);
        org.mockito.cglib.core.Local local50 = new org.mockito.cglib.core.Local((-1), type47);
        org.mockito.asm.Type type51 = local50.getType();
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type45, type51 };
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray52);
        boolean boolean55 = type41.equals((java.lang.Object) 10L);
        int int56 = type41.getSort();
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local(9, type41);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.getObjectType("hi!");
        int int60 = type59.getSort();
        java.lang.Class<?> wildcardClass61 = type59.getClass();
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass61);
        org.mockito.cglib.core.ClassInfo classInfo63 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass61);
        org.mockito.asm.Type type65 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean66 = classInfo63.equals((java.lang.Object) type65);
        int int67 = classInfo63.getModifiers();
        org.mockito.asm.Type[] typeArray68 = classInfo63.getInterfaces();
        org.mockito.cglib.core.Signature signature69 = new org.mockito.cglib.core.Signature("L243601416hi!", type41, typeArray68);
        org.mockito.asm.Type[] typeArray70 = signature69.getArgumentTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature71 = new org.mockito.cglib.core.Signature("(JLorg/mockito/asm/Type;)Lhi!;", type36, typeArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(JLorg/mockito/asm/Type;)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(IZ)Lhi!;" + "'", str27, "(IZ)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(IZ)Lhi!;" + "'", str53, "(IZ)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(wildcardClass61);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(classInfo63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray70);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("Lorg/mockito/cglib/core/ReflectUtils$4;", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "L1378241671");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.Object obj2 = label1.info;
        label1.info = ' ';
        java.lang.Object obj5 = label1.info;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BYTE_TYPE;
        int int7 = type6.getSort();
        label1.info = type6;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type15.getOpcode(5);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type15 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean31 = classInfo28.equals((java.lang.Object) type30);
        int int32 = classInfo28.getModifiers();
        org.mockito.asm.Type type33 = classInfo28.getType();
        org.mockito.asm.Type type34 = type33.getElementType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        int int37 = type36.getSort();
        java.lang.Class<?> wildcardClass38 = type36.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.cglib.core.ClassInfo classInfo40 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean43 = classInfo40.equals((java.lang.Object) type42);
        java.lang.Object obj44 = null;
        boolean boolean45 = type42.equals(obj44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        int int48 = type47.getSort();
        java.lang.Class<?> wildcardClass49 = type47.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean54 = classInfo51.equals((java.lang.Object) type53);
        int int55 = classInfo51.getModifiers();
        org.mockito.asm.Type type56 = classInfo51.getType();
        org.mockito.asm.Type type57 = type56.getElementType();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type21, type22, type34, type42, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type10, typeArray58);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature60 = new org.mockito.cglib.core.Signature("(DZ)Lhi!;", type6, typeArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DZ)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + ' ' + "'", obj5, ' ');
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(DZ)Z" + "'", str20, "(DZ)Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(classInfo28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(classInfo40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(classInfo51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.Class[] classArray13 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method14 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "Z", classArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Z");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(classArray13);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        int int20 = type18.getOpcode(10);
        java.lang.String str21 = type18.getClassName();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.String str26 = type24.getInternalName();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type30.getOpcode(5);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((-1), type30);
        org.mockito.asm.Type type34 = local33.getType();
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type28, type34 };
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray35);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray35);
        int int38 = type18.getSort();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("hi!");
        int int41 = type40.getSort();
        java.lang.Class<?> wildcardClass42 = type40.getClass();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        java.beans.PropertyDescriptor[] propertyDescriptorArray44 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass42);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("hi!");
        int int50 = type49.getSort();
        java.lang.Class<?> wildcardClass51 = type49.getClass();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean56 = classInfo53.equals((java.lang.Object) type55);
        int int57 = classInfo53.getModifiers();
        org.mockito.asm.Type[] typeArray58 = classInfo53.getInterfaces();
        java.lang.String str59 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray58);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.begin_class(10, 6, "java.beans.PropertyDescriptor[name=hi!; constrained]", type18, typeArray58, "D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "char" + "'", str21, "char");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(IZ)Lhi!;" + "'", str36, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(IZ)C" + "'", str37, "(IZ)C");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(propertyDescriptorArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org/mockito/asm/Type" + "'", str45, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(classInfo53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str59, "()Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str11 = signature10.getName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode(5);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type15, type17 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray21);
        boolean boolean24 = signature10.equals((java.lang.Object) typeArray21);
        java.lang.String str25 = signature10.toString();
        java.lang.String str26 = signature10.getDescriptor();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("org/mockito/asm/Type");
        org.mockito.asm.Type type30 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type32 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int34 = type32.getOpcode(5);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type35.getOpcode(5);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type40 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int42 = type40.getOpcode(5);
        org.mockito.cglib.core.Local local43 = new org.mockito.cglib.core.Local((-1), type40);
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type38, type40 };
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray44);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray44);
        java.lang.String str47 = type32.toString();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("hi!");
        int int50 = type49.getSort();
        org.mockito.asm.Type type51 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int53 = type51.getOpcode(5);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int56 = type54.getOpcode(5);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type59 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int61 = type59.getOpcode(5);
        org.mockito.cglib.core.Local local62 = new org.mockito.cglib.core.Local((-1), type59);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type57, type59 };
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type54, typeArray63);
        java.lang.String str65 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray63);
        java.lang.String str66 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray63);
        org.mockito.cglib.core.Signature signature67 = new org.mockito.cglib.core.Signature("C", type32, typeArray63);
        org.mockito.cglib.core.Signature signature68 = new org.mockito.cglib.core.Signature("double", type30, typeArray63);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str70 = type69.getClassName();
        int int71 = type69.getSort();
        int int73 = type69.getOpcode(130);
        java.lang.reflect.Method method75 = null;
        java.lang.reflect.Method method76 = null;
        java.beans.PropertyDescriptor propertyDescriptor77 = new java.beans.PropertyDescriptor("hi!", method75, method76);
        propertyDescriptor77.setHidden(false);
        java.lang.reflect.Method method80 = propertyDescriptor77.getReadMethod();
        java.lang.reflect.Method method81 = propertyDescriptor77.getReadMethod();
        java.lang.String str82 = propertyDescriptor77.getName();
        propertyDescriptor77.setShortDescription("Lhi!;");
        boolean boolean85 = type69.equals((java.lang.Object) propertyDescriptor77);
        org.mockito.asm.Type[] typeArray86 = new org.mockito.asm.Type[] { type28, type30, type69 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter87 = classEmitter5.begin_method((int) (short) 0, signature10, typeArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@14e5fcde");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(DZ)Z" + "'", str22, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(DZ)Z" + "'", str45, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(DZ)Z" + "'", str46, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Z" + "'", str47, "Z");
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(DZ)Z" + "'", str64, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "(DZ)Z" + "'", str65, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "(DZ)Lhi!;" + "'", str66, "(DZ)Lhi!;");
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "double" + "'", str70, "double");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 8 + "'", int71 == 8);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 133 + "'", int73 == 133);
        org.junit.Assert.assertNull(method80);
        org.junit.Assert.assertNull(method81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(typeArray86);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMethodInsn((int) (byte) 1, "double", "D", "org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Lava.beans.PropertyDescriptor[name=hi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(124, 133);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        classEmitter6.setTarget(classVisitor7);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter6.visitMethod(7, "L805361884", "L930922338", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1922d88");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visitSource("L9368052", "java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(1, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        int int8 = type6.getOpcode(10);
        java.lang.String str9 = type6.getClassName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.String str14 = type12.getInternalName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(0, type12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type18.getOpcode(5);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type22 = local21.getType();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type16, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray23);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray23);
        java.lang.Class[] classArray26 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray23);
        int int27 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray26);
        java.lang.String[] strArray28 = org.mockito.cglib.core.ReflectUtils.getNames(classArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor29 = classEmitter1.visitMethod(104, "Lorg/mockito/cglib/core/ReflectUtils$4;", "", "L107191322", strArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3db83e2e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "char" + "'", str9, "char");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(IZ)Lhi!;" + "'", str24, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(IZ)C" + "'", str25, "(IZ)C");
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str9 = signature8.getName();
        boolean boolean10 = classInfo4.equals((java.lang.Object) signature8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = signature8.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        classEmitter6.setTarget(classVisitor7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = classEmitter6.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter3.visitAnnotation("java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer16 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray7, (java.lang.Class) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(classInfo14);
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = null;
        java.beans.PropertyDescriptor propertyDescriptor15 = new java.beans.PropertyDescriptor("hi!", method13, method14);
        propertyDescriptor15.setHidden(false);
        propertyDescriptor15.setDisplayName("boolean");
        boolean boolean20 = propertyDescriptor15.isHidden();
        java.lang.String str21 = propertyDescriptor15.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration22 = propertyDescriptor15.attributeNames();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter5.visitField((int) (byte) 10, "L243601416hi!", "L1068302868", "org.mockito.asm.Type", (java.lang.Object) propertyDescriptor15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "boolean" + "'", str21, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration22);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("L1068302868", "C", "Lorg/mockito/asm/Type;(IZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray7 = classInfo6.getInterfaces();
        org.mockito.asm.Type type8 = classInfo6.getType();
        org.mockito.asm.Type type9 = type8.getElementType();
        boolean boolean10 = type0.equals((java.lang.Object) type8);
        java.lang.String str11 = type0.getClassName();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "char" + "'", str11, "char");
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn(0, "(IZ)C", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = 1.0d;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSort();
        java.lang.String str24 = type22.getInternalName();
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local(0, type22);
        org.mockito.asm.Type type26 = local25.getType();
        org.mockito.asm.Type type27 = local25.getType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.LONG_TYPE;
        int int29 = type28.getSort();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getObjectType("hi!");
        int int32 = type31.getSort();
        java.lang.Class<?> wildcardClass33 = type31.getClass();
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo35 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean38 = classInfo35.equals((java.lang.Object) type37);
        int int39 = classInfo35.getModifiers();
        org.mockito.asm.Type type40 = classInfo35.getType();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type28, type40 };
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray41);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFrame(0, 7, (java.lang.Object[]) propertyDescriptorArray18, 156, (java.lang.Object[]) typeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(classInfo35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(JLorg/mockito/asm/Type;)Lhi!;" + "'", str42, "(JLorg/mockito/asm/Type;)Lhi!;");
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray5);
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer16 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray6, (java.lang.Class) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        label8.info = 1.0d;
        java.lang.String str12 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn((int) (short) 1, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L394643901" + "'", str12, "L394643901");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass20);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFrame(112, 156, (java.lang.Object[]) propertyDescriptorArray15, (int) '4', (java.lang.Object[]) propertyDescriptorArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(classInfo14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        label7.info = 1.0d;
        java.lang.String str11 = label7.toString();
        label7.info = "org/mockito/asm/Type";
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str19 = signature18.toString();
        label14.info = str19;
        java.lang.String str21 = label14.toString();
        java.lang.String str22 = label14.toString();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        java.lang.Object obj24 = label23.info;
        label23.info = ' ';
        label23.info = 100.0d;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        label29.info = 3;
        label29.info = 130;
        java.lang.String str34 = label29.toString();
        java.lang.String str35 = label29.toString();
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.Object obj37 = label36.info;
        java.lang.Class[] classArray38 = new java.lang.Class[] {};
        int int39 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray38);
        label36.info = classArray38;
        org.mockito.asm.Label[] labelArray41 = new org.mockito.asm.Label[] { label14, label23, label29, label36 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) ' ', 1, label7, labelArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1106144415" + "'", str11, "L1106144415");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L779582599" + "'", str21, "L779582599");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L779582599" + "'", str22, "L779582599");
        org.junit.Assert.assertNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1791323776" + "'", str34, "L1791323776");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L1791323776" + "'", str35, "L1791323776");
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(classArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(labelArray41);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 3;
        label8.info = 130;
        java.lang.String str13 = label8.toString();
        java.lang.String str14 = label8.toString();
        org.mockito.asm.Label[] labelArray15 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitTableSwitchInsn((int) (byte) 1, 112, label8, labelArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L143742276" + "'", str13, "L143742276");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L143742276" + "'", str14, "L143742276");
        org.junit.Assert.assertNotNull(labelArray15);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitSource("", "S");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(108, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 3;
        label7.info = 130;
        java.lang.String str12 = label7.toString();
        java.lang.Object obj13 = label7.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L2096130780" + "'", str12, "L2096130780");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 130 + "'", obj13, 130);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter3.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter1.visitMethod((int) (byte) -1, "", "L1217139539", "Lorg/mockito/cglib/core/Signature;", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6b3a8be1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        java.lang.String[] strArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visit(0, 154, "(DZ)Z", "Lava.beans.PropertyDescriptor[name=hi!;", "Lorg/mockito/cglib/core/ReflectUtils$4;", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", "", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyType();
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; constrained]" + "'", str8, "java.beans.PropertyDescriptor[name=hi!; constrained]");
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method11 = propertyDescriptor3.getReadMethod();
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor21 = classEmitter16.visitAnnotation("L1068302868", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(propertyEditor18);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.CHAR_TYPE;
        int int12 = type10.getOpcode(10);
        java.lang.String str13 = type10.getClassName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.String str18 = type16.getInternalName();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(0, type16);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type22.getOpcode(5);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type type26 = local25.getType();
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type20, type26 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray27);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray27);
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.ReflectUtils.getNames(classArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor33 = classEmitter4.visitMethod(157, "Lava.beans.PropertyDescriptor[name=hi!;", "L243601416", "L1068302868", strArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1b8e80f3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo5);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "char" + "'", str13, "char");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(IZ)Lhi!;" + "'", str28, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(IZ)C" + "'", str29, "(IZ)C");
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L107191322");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str15 = signature14.toString();
        label10.info = str15;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str22 = signature21.toString();
        label17.info = str22;
        java.lang.String str24 = label17.toString();
        java.lang.String str25 = label17.toString();
        java.lang.String str26 = label17.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("java.beans.PropertyDescriptor[name=hi!]", "java.beans.PropertyDescriptor[name=hi!; constrained]", "L1015173504", label10, label17, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 155");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L784562535" + "'", str24, "L784562535");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L784562535" + "'", str25, "L784562535");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L784562535" + "'", str26, "L784562535");
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        label6.info = classArray8;
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor12 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(157, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type15.getOpcode(5);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type15 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean31 = classInfo28.equals((java.lang.Object) type30);
        int int32 = classInfo28.getModifiers();
        org.mockito.asm.Type type33 = classInfo28.getType();
        org.mockito.asm.Type type34 = type33.getElementType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        int int37 = type36.getSort();
        java.lang.Class<?> wildcardClass38 = type36.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.cglib.core.ClassInfo classInfo40 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean43 = classInfo40.equals((java.lang.Object) type42);
        java.lang.Object obj44 = null;
        boolean boolean45 = type42.equals(obj44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        int int48 = type47.getSort();
        java.lang.Class<?> wildcardClass49 = type47.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean54 = classInfo51.equals((java.lang.Object) type53);
        int int55 = classInfo51.getModifiers();
        org.mockito.asm.Type type56 = classInfo51.getType();
        org.mockito.asm.Type type57 = type56.getElementType();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type21, type22, type34, type42, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type10, typeArray58);
        org.mockito.asm.Type type62 = org.mockito.asm.Type.getObjectType("hi!");
        int int63 = type62.getSort();
        java.lang.Class<?> wildcardClass64 = type62.getClass();
        org.mockito.cglib.core.ClassInfo classInfo65 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass64);
        java.beans.PropertyDescriptor[] propertyDescriptorArray66 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass64);
        java.lang.Class[] classArray67 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray66);
        int int68 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray67);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(9, 133, (java.lang.Object[]) typeArray58, 0, (java.lang.Object[]) classArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(DZ)Z" + "'", str20, "(DZ)Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(classInfo28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(classInfo40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(classInfo51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(classInfo65);
        org.junit.Assert.assertNotNull(propertyDescriptorArray66);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = propertyDescriptorArray5.getClass();
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass6, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn(0, "L276889264", "(DZ)Z", "double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter4.visitAnnotation("char", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter7.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray20 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray19);
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visit(2, 124, "L527178774", "java.beans.PropertyDescriptor[name=hi!]", "L107191322", strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitOuterClass("L243601416hi!", "L1015173504", "L1015173504");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        int int20 = classInfo19.getModifiers();
        int int21 = classInfo19.getModifiers();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        int int24 = type23.getSort();
        java.lang.Class<?> wildcardClass25 = type23.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        boolean boolean27 = classInfo19.equals((java.lang.Object) wildcardClass25);
        org.mockito.asm.Type type28 = classInfo19.getSuperType();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((int) (short) -1, type28);
        org.mockito.asm.Type type30 = local29.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor31 = classEmitter5.visitField(2, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "Lorg/mockito/cglib/core/ReflectUtils$4;", "boolean", (java.lang.Object) type30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
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
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray14 = classInfo13.getInterfaces();
        java.lang.Class<?> wildcardClass15 = classInfo13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.declare_field(1, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]", type17, (java.lang.Object) "D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray15);
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", classArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/asm/Type" + "'", str8, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(classInfo14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        label8.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(107, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; constrained]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitMaxs((int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        java.lang.Class<?> wildcardClass20 = classInfo18.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor27 = classEmitter3.visitMethod(5, "Lorg/mockito/cglib/core/ReflectUtils$4;", "L9368052", "(DZ)Z", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@21c61ded");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.CHAR_TYPE;
        int int11 = type9.getOpcode(10);
        java.lang.String str12 = type9.getClassName();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type type25 = local24.getType();
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type19, type25 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray26);
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray26);
        java.lang.Class[] classArray29 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        int int30 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray29);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass35);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(100, 2, (java.lang.Object[]) classArray29, 8, (java.lang.Object[]) propertyDescriptorArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "char" + "'", str12, "char");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(IZ)Lhi!;" + "'", str27, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(IZ)C" + "'", str28, "(IZ)C");
        org.junit.Assert.assertNotNull(classArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(0, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.String str14 = type12.getInternalName();
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local(0, type12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type18.getOpcode(5);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type type22 = local21.getType();
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type16, type22 };
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type25.getOpcode(5);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type30.getOpcode(5);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((-1), type30);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type28, type30 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type12, typeArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3, classArray8, (java.lang.Object[]) typeArray34);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(IZ)Lhi!;" + "'", str24, "(IZ)Lhi!;");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(DZ)Z" + "'", str35, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "(DZ)Lhi!;" + "'", str36, "(DZ)Lhi!;");
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        int int25 = classInfo24.getModifiers();
        org.mockito.asm.Type type26 = classInfo24.getSuperType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass30);
        int int33 = classInfo32.getModifiers();
        int int34 = classInfo32.getModifiers();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        int int37 = type36.getSort();
        java.lang.Class<?> wildcardClass38 = type36.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        boolean boolean40 = classInfo32.equals((java.lang.Object) wildcardClass38);
        org.mockito.asm.Type[] typeArray41 = classInfo32.getInterfaces();
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type26, typeArray41);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(0, 3, (java.lang.Object[]) propertyDescriptorArray17, 0, (java.lang.Object[]) typeArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(classInfo24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(classInfo32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "()Ljava/lang/Object;" + "'", str42, "()Ljava/lang/Object;");
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        propertyDescriptor3.setPreferred(false);
        boolean boolean10 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter12.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 3;
        label8.info = 130;
        java.lang.String str13 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(1, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L378321717" + "'", str13, "L378321717");
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        label11.info = 3;
        java.lang.String str14 = label11.toString();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type15.getOpcode(5);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type18.getOpcode(5);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type21, type23 };
        java.lang.String str28 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray27);
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray27);
        label11.info = str29;
        java.lang.String str31 = label11.toString();
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.Object obj33 = label32.info;
        java.lang.Class[] classArray34 = new java.lang.Class[] {};
        int int35 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray34);
        label32.info = classArray34;
        java.lang.String str37 = label32.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLocalVariable("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", "[Ljava/beans/PropertyDescriptor;", "L1068302868", label11, label32, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 130");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1270393560" + "'", str14, "L1270393560");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(DZ)Z" + "'", str28, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(DZ)Z" + "'", str29, "(DZ)Z");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1270393560" + "'", str31, "L1270393560");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(classArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L438877068" + "'", str37, "L438877068");
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray21 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor23 = classEmitter11.visitMethod(6, "(DZ)Lhi!;", "", "L340719626", strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DZ)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        classEmitter10.setTarget(classVisitor11);
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        classEmitter10.setTarget(classVisitor13);
        classEmitter1.setTarget(classVisitor13);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type22.getSize();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass28);
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean33 = classInfo30.equals((java.lang.Object) type32);
        int int34 = classInfo30.getModifiers();
        org.mockito.asm.Type type35 = classInfo30.getType();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getObjectType("hi!");
        int int39 = type38.getSort();
        java.lang.String str40 = type38.getInternalName();
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local(0, type38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type44 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int46 = type44.getOpcode(5);
        org.mockito.cglib.core.Local local47 = new org.mockito.cglib.core.Local((-1), type44);
        org.mockito.asm.Type type48 = local47.getType();
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type42, type48 };
        java.lang.String str50 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray49);
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("C", type35, typeArray49);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.begin_class(112, (int) (byte) 0, "L276889264", type22, typeArray49, "(JLorg/mockito/asm/Type;)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(classInfo30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "(IZ)Lhi!;" + "'", str50, "(IZ)Lhi!;");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type[] typeArray10 = org.mockito.asm.Type.getArgumentTypes("(IZ)Lhi!;");
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame((int) (byte) -1, 107, (java.lang.Object[]) typeArray10, (int) (short) 10, (java.lang.Object[]) propertyDescriptorArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSort();
        int int9 = type5.getOpcode(104);
        boolean boolean10 = signature2.equals((java.lang.Object) 104);
        boolean boolean12 = signature2.equals((java.lang.Object) "Lhi!;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray13 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "double" + "'", str6, "double");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 107 + "'", int9 == 107);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("L1378241671");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("double", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor19 = classEmitter5.visitField(156, "Lhi!;", "L930922338", "hi!", (java.lang.Object) "L340719626");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray4);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray14, true, false);
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray17);
        java.lang.Class[] classArray19 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer30 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray19, (java.lang.Class) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(methodArray4);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str13, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classInfo24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertNotNull(classInfo26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str27, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classInfo28);
        org.junit.Assert.assertNotNull(type29);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setName("L527178774");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        java.lang.String str15 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass12);
        boolean boolean16 = propertyDescriptor3.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitMethodInsn(96, "java.beans.PropertyDescriptor[name=hi!; constrained]", "L1015173504", "L805361884");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = classEmitter12.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str10 = signature9.toString();
        label5.info = str10;
        java.lang.Object obj12 = label5.info;
        java.lang.String str13 = label5.toString();
        org.mockito.asm.Label label14 = null;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 3;
        label15.info = 130;
        java.lang.String str20 = label15.toString();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        int int23 = type22.getSize();
        label15.info = int23;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label5, label14, label15, "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1000238393" + "'", str13, "L1000238393");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1082003468" + "'", str20, "L1082003468");
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        label8.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn(100, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = 3;
        java.lang.String str10 = label7.toString();
        int[] intArray13 = new int[] { 157, (byte) 0 };
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        java.lang.Class[] classArray16 = new java.lang.Class[] {};
        int int17 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray16);
        label14.info = classArray16;
        java.lang.String str19 = label14.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        label20.info = ' ';
        label20.info = 100.0d;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        label26.info = 3;
        label26.info = 130;
        java.lang.String str31 = label26.toString();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getObjectType("hi!");
        int int34 = type33.getSort();
        java.lang.Class<?> wildcardClass35 = type33.getClass();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass35);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass35);
        int int38 = classInfo37.getModifiers();
        org.mockito.asm.Type type39 = classInfo37.getSuperType();
        label26.info = classInfo37;
        org.mockito.asm.Label label41 = new org.mockito.asm.Label();
        java.lang.Object obj42 = label41.info;
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str46 = signature45.toString();
        label41.info = str46;
        java.lang.String str48 = label41.toString();
        java.lang.Object obj49 = label41.info;
        org.mockito.asm.Label label50 = new org.mockito.asm.Label();
        java.lang.Object obj51 = label50.info;
        java.lang.Class[] classArray52 = new java.lang.Class[] {};
        int int53 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray52);
        label50.info = classArray52;
        java.lang.String str55 = label50.toString();
        org.mockito.asm.Label label56 = new org.mockito.asm.Label();
        java.lang.Object obj57 = label56.info;
        label56.info = ' ';
        java.lang.Object obj60 = label56.info;
        org.mockito.asm.Type type61 = org.mockito.asm.Type.BYTE_TYPE;
        int int62 = type61.getSort();
        label56.info = type61;
        java.lang.Object obj64 = label56.info;
        org.mockito.asm.Label[] labelArray65 = new org.mockito.asm.Label[] { label14, label20, label26, label41, label50, label56 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLookupSwitchInsn(label7, intArray13, labelArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L990695355" + "'", str10, "L990695355");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[157, 0]");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L761602193" + "'", str19, "L761602193");
        org.junit.Assert.assertNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1306421557" + "'", str31, "L1306421557");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(classInfo37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L147179988" + "'", str48, "L147179988");
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "hi!" + "'", obj49, "hi!");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L1432993376" + "'", str55, "L1432993376");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + ' ' + "'", obj60, ' ');
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "B");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "B");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "B");
        org.junit.Assert.assertNotNull(labelArray65);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(3, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setName("(JLorg/mockito/asm/Type;)Lhi!;");
        boolean boolean11 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter7.visitAnnotation("L1900097269", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = propertyDescriptorArray5.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type19.getSize();
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str24 = signature23.getName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type25.getOpcode(5);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type30 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int32 = type30.getOpcode(5);
        org.mockito.cglib.core.Local local33 = new org.mockito.cglib.core.Local((-1), type30);
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type28, type30 };
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray34);
        java.lang.Class[] classArray36 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray34);
        boolean boolean37 = signature23.equals((java.lang.Object) typeArray34);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass6, classArray18, (java.lang.Object[]) typeArray34);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->[Ljava.beans.PropertyDescriptor;.<init>(org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(DZ)Z" + "'", str17, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "(DZ)Z" + "'", str35, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(DZ)Z" + "'", str38, "(DZ)Z");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type4.getOpcode(5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode(5);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type7, type9 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray13);
        boolean boolean16 = signature2.equals((java.lang.Object) typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type17 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(DZ)Z" + "'", str14, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.String str13 = type11.getInternalName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode(5);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type21 = local20.getType();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type15, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray22);
        boolean boolean25 = type11.equals((java.lang.Object) 10L);
        propertyDescriptor3.setValue("Lhi!;", (java.lang.Object) type11);
        java.lang.String str27 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        java.lang.Object obj31 = propertyDescriptor3.getValue("L276889264");
        propertyDescriptor3.setShortDescription("L1378241671");
        java.lang.reflect.Method method34 = null;
        propertyDescriptor3.setWriteMethod(method34);
        java.lang.String str36 = propertyDescriptor3.toString();
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(IZ)Lhi!;" + "'", str23, "(IZ)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=L1378241671; values={Lhi!;=Lhi!;}]" + "'", str36, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=L1378241671; values={Lhi!;=Lhi!;}]");
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSize();
        label0.info = int8;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1923924316" + "'", str5, "L1923924316");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(14, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter15.getClassInfo();
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor21 = classEmitter15.visitAnnotation("Lorg/mockito/asm/Type;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn(4, "(DZ)Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) (short) 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter8 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter9 = new org.mockito.cglib.core.LocalVariablesSorter(112, "Lorg/mockito/asm/Type;(IZ)C", (org.mockito.asm.MethodVisitor) localVariablesSorter6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.visitOuterClass("java.beans.PropertyDescriptor[name=hi!]", "L1483665173", "java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean8 = classInfo5.equals((java.lang.Object) type7);
        int int9 = classInfo5.getModifiers();
        org.mockito.asm.Type[] typeArray10 = classInfo5.getInterfaces();
        java.lang.String str11 = classInfo5.toString();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        classEmitter22.setTarget(classVisitor23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        classEmitter22.setTarget(classVisitor25);
        classEmitter13.setTarget(classVisitor25);
        boolean boolean31 = classInfo5.equals((java.lang.Object) classEmitter13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter13.visitOuterClass("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]", "Lorg/mockito/asm/Type;", "(JLorg/mockito/asm/Type;)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.mockito.asm.Type" + "'", str11, "org.mockito.asm.Type");
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Attribute attribute14 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter10.visitAttribute(attribute14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray23);
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor27 = classEmitter10.visitMethod(156, "Z", "L527178774", "L930922338", strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@20024ca1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classInfo22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        int int17 = classInfo16.getModifiers();
        org.mockito.asm.Type type18 = classInfo16.getSuperType();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        int int25 = classInfo24.getModifiers();
        int int26 = classInfo24.getModifiers();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        boolean boolean32 = classInfo24.equals((java.lang.Object) wildcardClass30);
        org.mockito.asm.Type[] typeArray33 = classInfo24.getInterfaces();
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray33);
        java.lang.Class[] classArray35 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray33);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int39 = type37.getOpcode(5);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type42 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int44 = type42.getOpcode(5);
        org.mockito.cglib.core.Local local45 = new org.mockito.cglib.core.Local((-1), type42);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type40, type42 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type51 = org.mockito.asm.Type.getObjectType("hi!");
        int int52 = type51.getSort();
        java.lang.Class<?> wildcardClass53 = type51.getClass();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass53);
        org.mockito.cglib.core.ClassInfo classInfo55 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass53);
        org.mockito.asm.Type type57 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean58 = classInfo55.equals((java.lang.Object) type57);
        int int59 = classInfo55.getModifiers();
        org.mockito.asm.Type type60 = classInfo55.getType();
        org.mockito.asm.Type type61 = type60.getElementType();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getObjectType("hi!");
        int int64 = type63.getSort();
        java.lang.Class<?> wildcardClass65 = type63.getClass();
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass65);
        org.mockito.cglib.core.ClassInfo classInfo67 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass65);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean70 = classInfo67.equals((java.lang.Object) type69);
        java.lang.Object obj71 = null;
        boolean boolean72 = type69.equals(obj71);
        org.mockito.asm.Type type74 = org.mockito.asm.Type.getObjectType("hi!");
        int int75 = type74.getSort();
        java.lang.Class<?> wildcardClass76 = type74.getClass();
        org.mockito.asm.Type type77 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass76);
        org.mockito.cglib.core.ClassInfo classInfo78 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass76);
        org.mockito.asm.Type type80 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean81 = classInfo78.equals((java.lang.Object) type80);
        int int82 = classInfo78.getModifiers();
        org.mockito.asm.Type type83 = classInfo78.getType();
        org.mockito.asm.Type type84 = type83.getElementType();
        org.mockito.asm.Type[] typeArray85 = new org.mockito.asm.Type[] { type48, type49, type61, type69, type84 };
        org.mockito.cglib.core.Signature signature86 = new org.mockito.cglib.core.Signature("", type37, typeArray85);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj87 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3, classArray35, (java.lang.Object[]) typeArray85);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(classInfo24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "()Ljava/lang/Object;" + "'", str34, "()Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(classArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(DZ)Z" + "'", str47, "(DZ)Z");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(classInfo55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(classInfo67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(classInfo78);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1 + "'", int82 == 1);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(typeArray85);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        label8.info = ' ';
        java.lang.Object obj12 = label8.info;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BYTE_TYPE;
        int int14 = type13.getSort();
        label8.info = type13;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + ' ' + "'", obj12, ' ');
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type15 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("L1483665173", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("boolean", method1, method2);
        boolean boolean4 = propertyDescriptor3.isHidden();
        boolean boolean5 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.getName();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type6.getOpcode(5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type9, type11 };
        java.lang.String str16 = org.mockito.asm.Type.getMethodDescriptor(type6, typeArray15);
        java.lang.Class[] classArray17 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray15);
        boolean boolean18 = signature4.equals((java.lang.Object) typeArray15);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray15);
        java.lang.Class<?> wildcardClass20 = type0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(DZ)Z" + "'", str16, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(DZ)Z" + "'", str19, "(DZ)Z");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        label8.info = 1.0d;
        java.lang.String str12 = label8.toString();
        label8.info = "org/mockito/asm/Type";
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L2103450981" + "'", str12, "L2103450981");
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.lang.Class[] classArray15 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray14);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor17 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray15);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.CHAR_TYPE;
        int int13 = type11.getOpcode(10);
        java.lang.String str14 = type11.getClassName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.String str19 = type17.getInternalName();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(0, type17);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local((-1), type23);
        org.mockito.asm.Type type27 = local26.getType();
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type21, type27 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray28);
        java.lang.Class[] classArray31 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray28);
        int int32 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor34 = classEmitter3.visitMethod(112, "Lorg/mockito/cglib/core/Signature;", "Lorg/mockito/cglib/core/Signature;", "Lorg/mockito/cglib/core/Signature;", strArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4acb8376");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "char" + "'", str14, "char");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(IZ)Lhi!;" + "'", str29, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(IZ)C" + "'", str30, "(IZ)C");
        org.junit.Assert.assertNotNull(classArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 3;
        label8.info = 130;
        java.lang.String str13 = label8.toString();
        int[] intArray16 = new int[] { 2, 2 };
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLookupSwitchInsn(label8, intArray16, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1097239876" + "'", str13, "L1097239876");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[2, 2]");
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        java.lang.Class[] classArray12 = new java.lang.Class[] {};
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        label10.info = classArray12;
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray22 = new java.lang.Class[] {};
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.ReflectUtils.getNames(classArray22);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.Class<?> wildcardClass28 = type26.getClass();
        org.mockito.cglib.core.ClassInfo classInfo29 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass28);
        org.mockito.asm.Type[] typeArray30 = classInfo29.getInterfaces();
        java.lang.Class<?> wildcardClass31 = classInfo29.getClass();
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass31);
        java.lang.reflect.Method[] methodArray36 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray33, true, false);
        java.lang.reflect.Method[] methodArray37 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray36);
        java.lang.reflect.Method[] methodArray38 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray21, methodArray37);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(14, 3, (java.lang.Object[]) classArray12, 10, (java.lang.Object[]) methodArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(classInfo29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(classInfo32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertNotNull(methodArray36);
        org.junit.Assert.assertNotNull(methodArray37);
        org.junit.Assert.assertNotNull(methodArray38);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = method7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visit((int) (byte) 10, 112, "L1580073776", "L1580073776", "Lorg/mockito/asm/Type;", strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitSource("L243601416", "org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(96, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitIincInsn(158, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLdcInsn(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        label7.info = classArray9;
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method14 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "Lorg/mockito/cglib/core/Signature;", classArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Lorg/mockito/cglib/core/Signature;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean13 = classInfo11.equals((java.lang.Object) type12);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str16 = signature15.getName();
        java.lang.String str17 = signature15.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str19 = type18.getClassName();
        int int20 = type18.getSort();
        int int22 = type18.getOpcode(104);
        boolean boolean23 = signature15.equals((java.lang.Object) 104);
        boolean boolean25 = signature15.equals((java.lang.Object) "Lhi!;");
        java.lang.String str26 = signature15.toString();
        java.lang.String str27 = signature15.getDescriptor();
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str31 = signature30.toString();
        java.lang.String str32 = signature30.getName();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        int int36 = type35.getSort();
        java.lang.String str37 = type35.getInternalName();
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local(0, type35);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type41 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int43 = type41.getOpcode(5);
        org.mockito.cglib.core.Local local44 = new org.mockito.cglib.core.Local((-1), type41);
        org.mockito.asm.Type type45 = local44.getType();
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type39, type45 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray46);
        boolean boolean48 = signature30.equals((java.lang.Object) typeArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter49 = classEmitter10.begin_method((int) (byte) 1, signature15, typeArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@46e3a118");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "double" + "'", str19, "double");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 107 + "'", int22 == 107);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(IZ)Lhi!;" + "'", str47, "(IZ)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type[] typeArray23 = classInfo22.getInterfaces();
        java.lang.Class<?> wildcardClass24 = classInfo22.getClass();
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass24);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor28 = classEmitter10.visitField((int) (byte) 10, "L340719626", "L180128060", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", (java.lang.Object) wildcardClass24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(classInfo22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classInfo25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Lorg/mockito/cglib/core/ReflectUtils$4;" + "'", str27, "Lorg/mockito/cglib/core/ReflectUtils$4;");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Lorg/mockito/asm/Type;(IZ)C", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("L1015173504", "D");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        label6.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("D", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("C");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        org.mockito.asm.ClassVisitor classVisitor6 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter(classVisitor6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        boolean boolean11 = classInfo4.equals((java.lang.Object) classEmitter9);
        org.mockito.asm.MethodVisitor methodVisitor18 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter19 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor18);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter20 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter19);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter21 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter22 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor23 = classEmitter9.visitField(3, "(DZ)Lhi!;", "Lorg/mockito/cglib/core/Signature;", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=L1378241671; values={Lhi!;=Lhi!;}]", (java.lang.Object) localVariablesSorter22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.String str13 = type11.getInternalName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode(5);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type21 = local20.getType();
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type15, type21 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray22);
        boolean boolean25 = type11.equals((java.lang.Object) 10L);
        propertyDescriptor3.setValue("Lhi!;", (java.lang.Object) type11);
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setHidden(false);
        boolean boolean31 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(IZ)Lhi!;" + "'", str23, "(IZ)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray8 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray7, methodArray8);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass14);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray16, false, true);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray19);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method[] methodArray22 = new java.lang.reflect.Method[] { method21 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(methodArray8);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(methodArray22);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter3.visitMethod((int) (short) -1, "hi!", "(DZ)Z", "L1717639624", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@116b2957");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method5 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        org.mockito.asm.Type type13 = classInfo11.getSuperType();
        label0.info = classInfo11;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L138878902" + "'", str5, "L138878902");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(8, 133);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("L971073760");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str10 = signature9.toString();
        label5.info = str10;
        java.lang.String str12 = label5.toString();
        java.lang.Object obj13 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1771725193" + "'", str12, "L1771725193");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1217139539", "java.beans.PropertyDescriptor[name=hi!; constrained]");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method8 = propertyDescriptor3.getReadMethod();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("Lhi!;");
        boolean boolean11 = propertyDescriptor3.equals((java.lang.Object) type10);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter4.visitAnnotation("L1900097269", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        java.util.Enumeration<java.lang.String> strEnumeration10 = propertyDescriptor3.attributeNames();
        java.lang.reflect.Method method11 = propertyDescriptor3.getReadMethod();
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        org.mockito.asm.ClassVisitor classVisitor13 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter14 = new org.mockito.cglib.core.ClassEmitter(classVisitor13);
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter14.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter14);
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter16);
        java.beans.PropertyEditor propertyEditor18 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.visitOuterClass("java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "L1294565354", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertNotNull(strEnumeration10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(propertyEditor18);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = classEmitter5.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass8);
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray10, true, false);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method15 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "", classArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.ClassVisitor classVisitor1 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = classEmitter9.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 3;
        java.lang.String str12 = label9.toString();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type13.getOpcode(5);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode(5);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int23 = type21.getOpcode(5);
        org.mockito.cglib.core.Local local24 = new org.mockito.cglib.core.Local((-1), type21);
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type19, type21 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray25);
        label9.info = str27;
        java.lang.String str29 = label9.toString();
        java.lang.String str30 = label9.toString();
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = 3;
        java.lang.String str34 = label31.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type35.getOpcode(5);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type38.getOpcode(5);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int45 = type43.getOpcode(5);
        org.mockito.cglib.core.Local local46 = new org.mockito.cglib.core.Local((-1), type43);
        org.mockito.asm.Type[] typeArray47 = new org.mockito.asm.Type[] { type41, type43 };
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type38, typeArray47);
        java.lang.String str49 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray47);
        label31.info = str49;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLocalVariable("(DZ)Lhi!;", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=L1378241671; values={Lhi!;=Lhi!;}]", "S", label9, label31, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 155");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L743641546" + "'", str12, "L743641546");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(DZ)Z" + "'", str26, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(DZ)Z" + "'", str27, "(DZ)Z");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L743641546" + "'", str29, "L743641546");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L743641546" + "'", str30, "L743641546");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L2120616350" + "'", str34, "L2120616350");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(DZ)Z" + "'", str48, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "(DZ)Z" + "'", str49, "(DZ)Z");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("java.beans.PropertyDescriptor[name=hi!; constrained]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(126, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter11.visitAnnotation("L1378241671", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("hi!", 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        int int14 = classInfo13.getModifiers();
        org.mockito.asm.Type type15 = classInfo13.getSuperType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        int int22 = classInfo21.getModifiers();
        int int23 = classInfo21.getModifiers();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        boolean boolean29 = classInfo21.equals((java.lang.Object) wildcardClass27);
        org.mockito.asm.Type[] typeArray30 = classInfo21.getInterfaces();
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray30);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method34 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "org.mockito.asm.Type", classArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: org.mockito.asm.Type");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "()Ljava/lang/Object;" + "'", str31, "()Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type type16 = local15.getType();
        java.lang.String str17 = type16.toString();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.Class<?> wildcardClass22 = type20.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.lang.Class<?> wildcardClass25 = propertyDescriptorArray24.getClass();
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass25);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.cglib.core.ClassInfo classInfo31 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass30);
        java.beans.PropertyDescriptor[] propertyDescriptorArray32 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int37 = type35.getOpcode(5);
        org.mockito.cglib.core.Local local38 = new org.mockito.cglib.core.Local((-1), type35);
        org.mockito.asm.Type type39 = local38.getType();
        java.lang.String str40 = type39.toString();
        java.lang.Class<?> wildcardClass41 = type39.getClass();
        org.mockito.cglib.core.ClassInfo classInfo42 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        int int45 = type44.getSort();
        java.lang.Class<?> wildcardClass46 = type44.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray47 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass46);
        java.beans.PropertyDescriptor[] propertyDescriptorArray48 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass46);
        java.lang.Class[] classArray49 = new java.lang.Class[] { wildcardClass18, wildcardClass25, wildcardClass30, wildcardClass41, wildcardClass46 };
        java.lang.String[] strArray50 = org.mockito.cglib.core.ReflectUtils.getNames(classArray49);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor51 = classEmitter6.visitMethod(126, "double", "()Ljava/lang/Object;", "()Ljava/lang/Object;", strArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@119d3837");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z" + "'", str17, "Z");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[Ljava/beans/PropertyDescriptor;" + "'", str26, "[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(classInfo31);
        org.junit.Assert.assertNotNull(propertyDescriptorArray32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Z" + "'", str40, "Z");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(classInfo42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(propertyDescriptorArray47);
        org.junit.Assert.assertNotNull(propertyDescriptorArray48);
        org.junit.Assert.assertNotNull(classArray49);
        org.junit.Assert.assertNotNull(strArray50);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("L107191322", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", "L930922338");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitVarInsn(14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitFieldInsn(4, "L276889264", "org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L276889264");
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.getDescriptor();
        java.lang.String str6 = signature4.getName();
        java.lang.String str7 = signature4.getDescriptor();
        boolean boolean8 = type1.equals((java.lang.Object) signature4);
        java.lang.String str9 = signature4.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = signature4.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn(6, "L1217139539");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
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
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
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
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTypeInsn((-1), "L1217139539");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        propertyDescriptor14.setHidden(false);
        propertyDescriptor14.setDisplayName("boolean");
        propertyDescriptor14.setExpert(false);
        java.lang.String str21 = propertyDescriptor14.getName();
        java.lang.String str22 = propertyDescriptor14.getDisplayName();
        propertyDescriptor14.setPreferred(false);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor25 = classEmitter5.visitField((int) (byte) 100, "L1900097269", "L1294565354", "(DZ)Z", (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "boolean" + "'", str22, "boolean");
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        label8.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLineNumber(128, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = 3;
        label9.info = 130;
        java.lang.String str14 = label9.toString();
        java.lang.Object obj15 = label9.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        label16.info = 1.0d;
        java.lang.String str20 = label16.toString();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        label21.info = 3;
        java.lang.String str24 = label21.toString();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int27 = type25.getOpcode(5);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type33.getOpcode(5);
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local((-1), type33);
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type31, type33 };
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray37);
        java.lang.String str39 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray37);
        label21.info = str39;
        java.lang.String str41 = label21.toString();
        java.lang.String str42 = label21.toString();
        org.mockito.asm.Label[] labelArray43 = new org.mockito.asm.Label[] { label16, label21 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn(124, 4, label9, labelArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L830636468" + "'", str14, "L830636468");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 130 + "'", obj15, 130);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L624732873" + "'", str20, "L624732873");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L814095781" + "'", str24, "L814095781");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(DZ)Z" + "'", str38, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(DZ)Z" + "'", str39, "(DZ)Z");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L814095781" + "'", str41, "L814095781");
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L814095781" + "'", str42, "L814095781");
        org.junit.Assert.assertNotNull(labelArray43);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        java.lang.Class[] classArray24 = new java.lang.Class[] {};
        int int25 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray27 = org.mockito.cglib.core.ReflectUtils.getNames(classArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray32 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray31, methodArray32);
        java.lang.reflect.Method[] methodArray34 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        int int37 = type36.getSort();
        java.lang.Class<?> wildcardClass38 = type36.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray39 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass38);
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass38);
        java.lang.reflect.Method[] methodArray43 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray40, false, true);
        java.lang.reflect.Method[] methodArray44 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray43);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.visit(133, (int) (short) 100, "char", "()Ljava/lang/Object;", "L1463064543", strArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo17);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(methodArray32);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertNotNull(methodArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(propertyDescriptorArray39);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertNotNull(methodArray43);
        org.junit.Assert.assertNotNull(methodArray44);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitMaxs(8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean8 = classInfo5.equals((java.lang.Object) type7);
        int int9 = classInfo5.getModifiers();
        org.mockito.asm.Type[] typeArray10 = classInfo5.getInterfaces();
        java.lang.String str11 = classInfo5.toString();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        classEmitter22.setTarget(classVisitor23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        classEmitter22.setTarget(classVisitor25);
        classEmitter13.setTarget(classVisitor25);
        boolean boolean31 = classInfo5.equals((java.lang.Object) classEmitter13);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!", "org/mockito/asm/Type" };
        java.lang.Class[] classArray40 = new java.lang.Class[] {};
        int int41 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray40);
        java.lang.String[] strArray42 = org.mockito.cglib.core.ReflectUtils.getNames(classArray40);
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getObjectType("hi!");
        int int45 = type44.getSort();
        java.lang.Class<?> wildcardClass46 = type44.getClass();
        org.mockito.cglib.core.ClassInfo classInfo47 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type[] typeArray48 = classInfo47.getInterfaces();
        java.lang.Class<?> wildcardClass49 = classInfo47.getClass();
        org.mockito.cglib.core.ClassInfo classInfo50 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass49);
        java.lang.reflect.Method[] methodArray54 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray51, true, false);
        java.lang.reflect.Method[] methodArray55 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray42, methodArray54);
        java.lang.reflect.Method[] methodArray56 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray55);
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray61 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray60, methodArray61);
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getObjectType("hi!");
        int int65 = type64.getSort();
        java.lang.Class<?> wildcardClass66 = type64.getClass();
        org.mockito.cglib.core.ClassInfo classInfo67 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray68 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass66);
        org.mockito.cglib.core.ClassInfo classInfo69 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass66);
        java.lang.String str70 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass66);
        java.beans.PropertyDescriptor[] propertyDescriptorArray71 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass66);
        java.lang.reflect.Method[] methodArray74 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray71, true, false);
        java.lang.reflect.Method[] methodArray75 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray60, methodArray74);
        java.lang.Class[] classArray76 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray74);
        java.lang.reflect.Method[] methodArray77 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray39, methodArray74);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor78 = classEmitter13.visitMethod(156, "L1217139539", "org.mockito.asm.Type", "L9368052", strArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@b5ac5fd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.mockito.asm.Type" + "'", str11, "org.mockito.asm.Type");
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(classArray40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classInfo47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classInfo50);
        org.junit.Assert.assertNotNull(propertyDescriptorArray51);
        org.junit.Assert.assertNotNull(methodArray54);
        org.junit.Assert.assertNotNull(methodArray55);
        org.junit.Assert.assertNotNull(methodArray56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(methodArray61);
        org.junit.Assert.assertNotNull(methodArray62);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(classInfo67);
        org.junit.Assert.assertNotNull(propertyDescriptorArray68);
        org.junit.Assert.assertNotNull(classInfo69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str70, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray71);
        org.junit.Assert.assertNotNull(methodArray74);
        org.junit.Assert.assertNotNull(methodArray75);
        org.junit.Assert.assertNotNull(classArray76);
        org.junit.Assert.assertNotNull(methodArray77);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = 1.0d;
        java.lang.String str4 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L818432070" + "'", str4, "L818432070");
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 3;
        label4.info = 130;
        java.lang.String str9 = label4.toString();
        java.lang.Object obj10 = label4.info;
        int[] intArray15 = new int[] { 155, 100, 116, 'a' };
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 3;
        label18.info = 130;
        java.lang.String str23 = label18.toString();
        java.lang.Object obj24 = label18.info;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        label25.info = 3;
        label25.info = 130;
        java.lang.String str30 = label25.toString();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getObjectType("hi!");
        int int33 = type32.getSize();
        label25.info = int33;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        label35.info = 3;
        label35.info = 130;
        org.mockito.asm.Label label40 = new org.mockito.asm.Label();
        label40.info = 3;
        java.lang.String str43 = label40.toString();
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        java.lang.Object obj45 = label44.info;
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str49 = signature48.toString();
        label44.info = str49;
        org.mockito.asm.Label label51 = new org.mockito.asm.Label();
        label51.info = 3;
        label51.info = 130;
        label44.info = 130;
        java.lang.Object obj57 = label44.info;
        org.mockito.asm.Label[] labelArray58 = new org.mockito.asm.Label[] { label16, label18, label25, label35, label40, label44 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray15, labelArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1295121705" + "'", str9, "L1295121705");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 130 + "'", obj10, 130);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[155, 100, 116, 97]");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1736570010" + "'", str23, "L1736570010");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 130 + "'", obj24, 130);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1881487843" + "'", str30, "L1881487843");
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L527180758" + "'", str43, "L527180758");
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + obj57 + "' != '" + 130 + "'", obj57, 130);
        org.junit.Assert.assertNotNull(labelArray58);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str16 = signature15.toString();
        label11.info = str16;
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        label18.info = 3;
        label18.info = 130;
        label11.info = 130;
        java.lang.Object obj24 = label11.info;
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str30 = signature29.toString();
        label25.info = str30;
        java.lang.String str32 = label25.toString();
        java.lang.String str33 = label25.toString();
        java.lang.String str34 = label25.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L243601416hi!", "L180128060", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]", label11, label25, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 52");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 130 + "'", obj24, 130);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1184149952" + "'", str32, "L1184149952");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1184149952" + "'", str33, "L1184149952");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1184149952" + "'", str34, "L1184149952");
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitVarInsn(133, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1463064543");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.Object obj8 = propertyDescriptor3.getValue("L276889264");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        propertyDescriptor3.setPreferred(false);
        java.lang.Object obj14 = propertyDescriptor3.getValue("L1483665173");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor14 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray10);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.String str8 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org/mockito/asm/Type" + "'", str8, "org/mockito/asm/Type");
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(156, "L930922338", "Lorg/mockito/cglib/core/Signature;", "L527178774");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str13 = signature12.toString();
        label8.info = str13;
        java.lang.Object obj15 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber(108, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
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
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        int int14 = classInfo13.getModifiers();
        org.mockito.asm.Type type15 = classInfo13.getSuperType();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        int int22 = classInfo21.getModifiers();
        int int23 = classInfo21.getModifiers();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.Class<?> wildcardClass27 = type25.getClass();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass27);
        boolean boolean29 = classInfo21.equals((java.lang.Object) wildcardClass27);
        org.mockito.asm.Type[] typeArray30 = classInfo21.getInterfaces();
        java.lang.String str31 = org.mockito.asm.Type.getMethodDescriptor(type15, typeArray30);
        java.lang.Class[] classArray32 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray30);
        java.lang.String[] strArray33 = org.mockito.cglib.core.ReflectUtils.getNames(classArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method34 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "L1483665173", classArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: L1483665173");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "()Ljava/lang/Object;" + "'", str31, "()Ljava/lang/Object;");
        org.junit.Assert.assertNotNull(classArray32);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(107, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter5.visitAnnotation("L1900097269", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter5.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L243601416", "hi!");
        java.lang.String str3 = signature2.toString();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        propertyDescriptor7.setHidden(false);
        boolean boolean10 = propertyDescriptor7.isHidden();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor7.getPropertyType();
        boolean boolean12 = signature2.equals((java.lang.Object) propertyDescriptor7);
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str16 = signature15.getName();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode(5);
        org.mockito.asm.Type type20 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int24 = type22.getOpcode(5);
        org.mockito.cglib.core.Local local25 = new org.mockito.cglib.core.Local((-1), type22);
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type20, type22 };
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type17, typeArray26);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray26);
        boolean boolean29 = signature15.equals((java.lang.Object) typeArray26);
        java.lang.String str30 = signature15.toString();
        java.lang.String str31 = signature15.getDescriptor();
        boolean boolean32 = propertyDescriptor7.equals((java.lang.Object) signature15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L243601416hi!" + "'", str3, "L243601416hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(DZ)Z" + "'", str27, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 3;
        java.lang.String str9 = label6.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type13.getOpcode(5);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type18.getOpcode(5);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type16, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray22);
        label6.info = str24;
        java.lang.String str26 = label6.toString();
        java.lang.String str27 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter5.visitLabel(label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L591357621" + "'", str9, "L591357621");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(DZ)Z" + "'", str23, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(DZ)Z" + "'", str24, "(DZ)Z");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L591357621" + "'", str26, "L591357621");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L591357621" + "'", str27, "L591357621");
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn(104, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        classEmitter6.setTarget(classVisitor7);
        org.mockito.asm.ClassVisitor classVisitor9 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor9);
        classEmitter6.setTarget(classVisitor9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter14 = classEmitter6.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        java.lang.reflect.Method method8 = null;
        java.lang.reflect.Method method9 = null;
        java.beans.PropertyDescriptor propertyDescriptor10 = new java.beans.PropertyDescriptor("hi!", method8, method9);
        propertyDescriptor10.setConstrained(true);
        boolean boolean13 = propertyDescriptor10.isHidden();
        java.lang.Object obj15 = propertyDescriptor10.getValue("L276889264");
        propertyDescriptor10.setShortDescription("(DZ)Z");
        boolean boolean18 = propertyDescriptor10.isExpert();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) propertyDescriptor10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.toString();
        label0.info = str5;
        java.lang.String str7 = label0.toString();
        java.lang.String str8 = label0.toString();
        java.lang.String str9 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L293408962" + "'", str7, "L293408962");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L293408962" + "'", str8, "L293408962");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L293408962" + "'", str9, "L293408962");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("L755526513");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        org.mockito.cglib.core.Signature signature10 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str11 = signature10.toString();
        label6.info = str11;
        java.lang.Object obj13 = label6.info;
        java.lang.String str14 = label6.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str20 = signature19.toString();
        label15.info = str20;
        java.lang.String str22 = label15.toString();
        java.lang.String str23 = label15.toString();
        org.mockito.asm.Label label24 = new org.mockito.asm.Label();
        label24.info = 3;
        java.lang.String str27 = label24.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTryCatchBlock(label6, label15, label24, "()Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L2002517711" + "'", str14, "L2002517711");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1419378930" + "'", str22, "L1419378930");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1419378930" + "'", str23, "L1419378930");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L1720192633" + "'", str27, "L1720192633");
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("L107191322", "Lorg/mockito/cglib/core/Signature;", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        propertyDescriptor8.setHidden(false);
        propertyDescriptor8.setDisplayName("boolean");
        boolean boolean13 = propertyDescriptor8.isHidden();
        boolean boolean14 = propertyDescriptor8.isExpert();
        boolean boolean15 = propertyDescriptor8.isPreferred();
        propertyDescriptor8.setHidden(true);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) propertyDescriptor8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        java.util.Enumeration<java.lang.String> strEnumeration6 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration7 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setDisplayName("Lorg/mockito/cglib/core/ReflectUtils$4;");
        propertyDescriptor3.setName("()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(strEnumeration6);
        org.junit.Assert.assertNotNull(strEnumeration7);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray15 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray15);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass20);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass20);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray25, true, false);
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray14, methodArray28);
        java.lang.Class[] classArray30 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method31 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "C", classArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: C");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(classInfo23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str24, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(classArray30);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        java.lang.Class<?> wildcardClass7 = classInfo5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer9 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ReflectUtils$4.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        label5.info = ' ';
        label5.info = 100.0d;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        java.lang.reflect.Method method9 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setConstrained(true);
        java.lang.String str12 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]" + "'", str12, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]");
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(124);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitIntInsn(1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        label19.info = ' ';
        java.lang.Object obj23 = label19.info;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter12.visitField((int) (short) -1, "C", "Lhi!;", "L930922338", (java.lang.Object) label19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + ' ' + "'", obj23, ' ');
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L930922338");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        java.lang.String[] strArray4 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 3;
        label8.info = 130;
        java.lang.String str13 = label8.toString();
        java.lang.String str14 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(130, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1561011761" + "'", str13, "L1561011761");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1561011761" + "'", str14, "L1561011761");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs((int) (byte) -1, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("L1509490424", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type15.getOpcode(5);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type13, type15 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type22 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.Class<?> wildcardClass26 = type24.getClass();
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass26);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean31 = classInfo28.equals((java.lang.Object) type30);
        int int32 = classInfo28.getModifiers();
        org.mockito.asm.Type type33 = classInfo28.getType();
        org.mockito.asm.Type type34 = type33.getElementType();
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        int int37 = type36.getSort();
        java.lang.Class<?> wildcardClass38 = type36.getClass();
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass38);
        org.mockito.cglib.core.ClassInfo classInfo40 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean43 = classInfo40.equals((java.lang.Object) type42);
        java.lang.Object obj44 = null;
        boolean boolean45 = type42.equals(obj44);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        int int48 = type47.getSort();
        java.lang.Class<?> wildcardClass49 = type47.getClass();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass49);
        org.mockito.cglib.core.ClassInfo classInfo51 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean54 = classInfo51.equals((java.lang.Object) type53);
        int int55 = classInfo51.getModifiers();
        org.mockito.asm.Type type56 = classInfo51.getType();
        org.mockito.asm.Type type57 = type56.getElementType();
        org.mockito.asm.Type[] typeArray58 = new org.mockito.asm.Type[] { type21, type22, type34, type42, type57 };
        org.mockito.cglib.core.Signature signature59 = new org.mockito.cglib.core.Signature("", type10, typeArray58);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.getObjectType("hi!");
        int int62 = type61.getSort();
        java.lang.Class<?> wildcardClass63 = type61.getClass();
        org.mockito.asm.Type type64 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass63);
        org.mockito.cglib.core.ClassInfo classInfo65 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass63);
        org.mockito.asm.Type type67 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean68 = classInfo65.equals((java.lang.Object) type67);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.declare_field(0, "L1378241671", type10, (java.lang.Object) boolean68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(DZ)Z" + "'", str20, "(DZ)Z");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(classInfo28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(classInfo40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(classInfo51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(classInfo65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        label9.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLineNumber((int) (short) 100, label9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter6.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        java.lang.reflect.Method[] methodArray16 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray9, methodArray14);
        java.lang.reflect.Method[] methodArray17 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray5, methodArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
        org.junit.Assert.assertNotNull(methodArray16);
        org.junit.Assert.assertNotNull(methodArray17);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L1015173504", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn((int) (short) -1, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method13 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "L527178774", classArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: L527178774");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("()Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.reflect.Method method9 = null;
        java.lang.reflect.Method method10 = null;
        java.beans.PropertyDescriptor propertyDescriptor11 = new java.beans.PropertyDescriptor("hi!", method9, method10);
        propertyDescriptor11.setHidden(false);
        propertyDescriptor11.setDisplayName("boolean");
        propertyDescriptor11.setExpert(false);
        propertyDescriptor11.setHidden(true);
        java.lang.Class<?> wildcardClass20 = propertyDescriptor11.getPropertyEditorClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor21 = classEmitter1.visitField(128, "L755526513", "L1509490424", "Lhi!;", (java.lang.Object) wildcardClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        label5.info = 1.0d;
        java.lang.String str9 = label5.toString();
        java.lang.String str10 = label5.toString();
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        propertyDescriptor14.setConstrained(true);
        java.util.Enumeration<java.lang.String> strEnumeration17 = propertyDescriptor14.attributeNames();
        propertyDescriptor14.setPreferred(false);
        label5.info = propertyDescriptor14;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(107, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L269923073" + "'", str9, "L269923073");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L269923073" + "'", str10, "L269923073");
        org.junit.Assert.assertNotNull(strEnumeration17);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn((int) ' ', "L527178774");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        boolean boolean9 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setWriteMethod(method10);
        java.lang.Object obj13 = propertyDescriptor3.getValue("");
        java.lang.String str14 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]" + "'", str14, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter11.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        classEmitter5.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitSource("(DZ)Lhi!;", "L180128060");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("char", 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.Class[] classArray10 = new java.lang.Class[] {};
        int int11 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray10);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray18);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor21 = classEmitter3.visitMethod((int) (byte) 0, "L1217139539", "L930922338", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=L1378241671; values={Lhi!;=Lhi!;}]", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5a9e928e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(methodArray20);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter6.visitAnnotation("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter4.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("", "L340719626", "L1463064543");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean8 = classInfo5.equals((java.lang.Object) type7);
        int int9 = classInfo5.getModifiers();
        org.mockito.asm.Type[] typeArray10 = classInfo5.getInterfaces();
        java.lang.String str11 = classInfo5.toString();
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        org.mockito.cglib.core.ClassInfo classInfo14 = classEmitter13.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo15 = classEmitter13.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor16 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter17 = new org.mockito.cglib.core.ClassEmitter(classVisitor16);
        org.mockito.cglib.core.ClassInfo classInfo18 = classEmitter17.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter17);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.ClassVisitor classVisitor23 = null;
        classEmitter22.setTarget(classVisitor23);
        org.mockito.asm.ClassVisitor classVisitor25 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter(classVisitor25);
        classEmitter22.setTarget(classVisitor25);
        classEmitter13.setTarget(classVisitor25);
        boolean boolean31 = classInfo5.equals((java.lang.Object) classEmitter13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor34 = classEmitter13.visitAnnotation("L1580073776", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.mockito.asm.Type" + "'", str11, "org.mockito.asm.Type");
        org.junit.Assert.assertNull(classInfo14);
        org.junit.Assert.assertNull(classInfo15);
        org.junit.Assert.assertNull(classInfo18);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        label7.info = classArray9;
        java.lang.String str12 = label7.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitLabel(label7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L2069736512" + "'", str12, "L2069736512");
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(130, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.ReflectUtils.getNames(classArray1);
        int int4 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        java.lang.Class[] classArray5 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(classArray5);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str10 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        java.util.List list12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list13 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str7, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str10, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str11, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.String str12 = type10.getInternalName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode(5);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type type20 = local19.getType();
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type14, type20 };
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray21);
        java.lang.Class[] classArray23 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray21);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor25 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray23);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(IZ)Lhi!;" + "'", str22, "(IZ)Lhi!;");
        org.junit.Assert.assertNotNull(classArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("L1509490424", "hi!", "L1509490424");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        java.beans.PropertyDescriptor[] propertyDescriptorArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray3 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray0, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        int int12 = classInfo11.getModifiers();
        int int13 = classInfo11.getModifiers();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        boolean boolean19 = classInfo11.equals((java.lang.Object) wildcardClass17);
        org.mockito.asm.Type[] typeArray20 = classInfo11.getInterfaces();
        org.mockito.asm.Type type21 = classInfo11.getType();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType("Lhi!;");
        boolean boolean24 = type21.equals((java.lang.Object) "Lhi!;");
        int int26 = type21.getOpcode((int) (byte) 10);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = null;
        java.beans.PropertyDescriptor propertyDescriptor30 = new java.beans.PropertyDescriptor("hi!", method28, method29);
        propertyDescriptor30.setHidden(false);
        propertyDescriptor30.setDisplayName("boolean");
        propertyDescriptor30.setExpert(false);
        java.lang.String str37 = propertyDescriptor30.getName();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field((int) (byte) 100, "L9368052", type21, (java.lang.Object) propertyDescriptor30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 14 + "'", int26 == 14);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn((int) (byte) -1, "L1294565354");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int8 = type7.getSize();
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str12 = signature11.getName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type13.getOpcode(5);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type18.getOpcode(5);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type16, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray22);
        java.lang.Class[] classArray24 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray22);
        boolean boolean25 = signature11.equals((java.lang.Object) typeArray22);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray22);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type27.getSize();
        org.mockito.cglib.core.Signature signature31 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str32 = signature31.getName();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int35 = type33.getOpcode(5);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type38 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int40 = type38.getOpcode(5);
        org.mockito.cglib.core.Local local41 = new org.mockito.cglib.core.Local((-1), type38);
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type36, type38 };
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type33, typeArray42);
        java.lang.Class[] classArray44 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray42);
        boolean boolean45 = signature31.equals((java.lang.Object) typeArray42);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray42);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.begin_class(0, 14, "Lorg/mockito/asm/Type;", type7, typeArray42, "(DZ)Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(DZ)Z" + "'", str23, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(DZ)Z" + "'", str26, "(DZ)Z");
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "(DZ)Z" + "'", str43, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(DZ)Z" + "'", str46, "(DZ)Z");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("L1294565354");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getInternalName();
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local(0, type8);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int16 = type14.getOpcode(5);
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local((-1), type14);
        org.mockito.asm.Type type18 = local17.getType();
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type12, type18 };
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        int int24 = type23.getSort();
        java.lang.Class<?> wildcardClass25 = type23.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(108, 7, (java.lang.Object[]) typeArray19, 100, (java.lang.Object[]) propertyDescriptorArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(IZ)Lhi!;" + "'", str20, "(IZ)Lhi!;");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(propertyDescriptorArray27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitSource("char", "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L243601416", "hi!");
        java.lang.String str3 = signature2.toString();
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = null;
        java.beans.PropertyDescriptor propertyDescriptor7 = new java.beans.PropertyDescriptor("hi!", method5, method6);
        propertyDescriptor7.setHidden(false);
        boolean boolean10 = propertyDescriptor7.isHidden();
        java.lang.Class<?> wildcardClass11 = propertyDescriptor7.getPropertyType();
        boolean boolean12 = signature2.equals((java.lang.Object) propertyDescriptor7);
        java.lang.String str13 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray14 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L243601416hi!" + "'", str3, "L243601416hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L243601416hi!" + "'", str13, "L243601416hi!");
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitInsn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        boolean boolean8 = propertyDescriptor3.isPreferred();
        boolean boolean9 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitOuterClass("Lorg/mockito/asm/Type;(IZ)C", "Lorg/mockito/asm/Type;", "java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitInsn(5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        boolean boolean10 = propertyDescriptor3.isHidden();
        java.lang.String str11 = propertyDescriptor3.getDisplayName();
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setReadMethod(method13);
        propertyDescriptor3.setExpert(true);
        boolean boolean17 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1580073776");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(0, "double", "C", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        classEmitter6.setTarget(classVisitor7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitInnerClass("(IZ)Lhi!;", "", "Lorg/mockito/asm/Type;", 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@a1f72b6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray12 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray13 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray12);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.lang.String str21 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method[] methodArray25 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray22, true, false);
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray25);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor28 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray27);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(methodArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str21, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(classArray27);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str13 = signature12.toString();
        label8.info = str13;
        java.lang.String str15 = label8.toString();
        java.lang.String str16 = label8.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter6.visitJumpInsn((int) (byte) 100, label8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1839072167" + "'", str15, "L1839072167");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1839072167" + "'", str16, "L1839072167");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str12 = signature11.toString();
        label7.info = str12;
        java.lang.String str14 = label7.toString();
        java.lang.String str15 = label7.toString();
        int[] intArray20 = new int[] { 128, 155, 156, 100 };
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        label21.info = ' ';
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        java.lang.Object obj26 = label25.info;
        org.mockito.cglib.core.Signature signature29 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str30 = signature29.toString();
        label25.info = str30;
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        label32.info = 3;
        label32.info = 130;
        label25.info = 130;
        java.lang.Object obj38 = label25.info;
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        label39.info = 3;
        label39.info = 130;
        java.lang.String str44 = label39.toString();
        java.lang.Object obj45 = label39.info;
        org.mockito.asm.Label label46 = new org.mockito.asm.Label();
        label46.info = 3;
        java.lang.String str49 = label46.toString();
        org.mockito.asm.Type type50 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int52 = type50.getOpcode(5);
        org.mockito.asm.Type type53 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int55 = type53.getOpcode(5);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type58 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int60 = type58.getOpcode(5);
        org.mockito.cglib.core.Local local61 = new org.mockito.cglib.core.Local((-1), type58);
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type56, type58 };
        java.lang.String str63 = org.mockito.asm.Type.getMethodDescriptor(type53, typeArray62);
        java.lang.String str64 = org.mockito.asm.Type.getMethodDescriptor(type50, typeArray62);
        label46.info = str64;
        org.mockito.asm.Label[] labelArray66 = new org.mockito.asm.Label[] { label21, label25, label39, label46 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label7, intArray20, labelArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1474100435" + "'", str14, "L1474100435");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1474100435" + "'", str15, "L1474100435");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[128, 155, 156, 100]");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 130 + "'", obj38, 130);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "L1108610100" + "'", str44, "L1108610100");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 130 + "'", obj45, 130);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L2107491665" + "'", str49, "L2107491665");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "(DZ)Z" + "'", str63, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "(DZ)Z" + "'", str64, "(DZ)Z");
        org.junit.Assert.assertNotNull(labelArray66);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor7 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter(classVisitor7);
        org.mockito.cglib.core.ClassInfo classInfo9 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.ClassVisitor classVisitor11 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter(classVisitor11);
        classEmitter10.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.asm.ClassVisitor classVisitor15 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter(classVisitor15);
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter16.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter16.visitInnerClass("L9368052", "java.beans.PropertyDescriptor[name=hi!]", "L930922338", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type7.getOpcode(10);
        java.lang.String str10 = type7.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.String str15 = type13.getInternalName();
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local(0, type13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type19 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int21 = type19.getOpcode(5);
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((-1), type19);
        org.mockito.asm.Type type23 = local22.getType();
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type17, type23 };
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray24);
        java.lang.Class[] classArray27 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray24);
        int int28 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.ReflectUtils.getNames(classArray27);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor30 = classEmitter2.visitMethod((int) ' ', "L1137985648", "()Ljava/lang/Object;", "Lorg/mockito/asm/Type;", strArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@708ab1b9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "char" + "'", str10, "char");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "(IZ)Lhi!;" + "'", str25, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(IZ)C" + "'", str26, "(IZ)C");
        org.junit.Assert.assertNotNull(classArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.ClassVisitor classVisitor5 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter(classVisitor5);
        org.mockito.cglib.core.ClassInfo classInfo7 = classEmitter6.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = classEmitter4.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo7);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.visitSource("L180128060", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1580073776");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter11.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter11.visitOuterClass("L1717639624", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]", "L147808947");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo12);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitSource("L276889264", "(JLorg/mockito/asm/Type;)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter10.visitAnnotation("L527178774", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.toString();
        label0.info = str5;
        java.lang.Object obj7 = label0.info;
        java.lang.String str8 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1788602099" + "'", str8, "L1788602099");
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray13);
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter7.visitLdcInsn((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}
