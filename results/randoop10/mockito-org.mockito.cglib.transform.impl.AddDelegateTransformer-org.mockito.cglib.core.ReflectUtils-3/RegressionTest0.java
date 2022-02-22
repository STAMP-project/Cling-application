import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getInternalName(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("", method1, method2);
            org.junit.Assert.fail("Expected exception of type java.beans.IntrospectionException; message: bad property name");
        } catch (java.beans.IntrospectionException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.ReflectUtils.getSignature(member0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.mockito.cglib.core.ReflectUtils.newInstance(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.beans.PropertyDescriptor propertyDescriptor0 = null;
        java.beans.PropertyDescriptor[] propertyDescriptorArray1 = new java.beans.PropertyDescriptor[] { propertyDescriptor0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method[] methodArray4 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray1, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(propertyDescriptorArray1);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Block block1 = new org.mockito.cglib.core.Block(codeEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.ClassInfo classInfo1 = org.mockito.cglib.core.ReflectUtils.getClassInfo(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(2, "", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = classEmitter1.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.beans.PropertyDescriptor[] propertyDescriptorArray1 = org.mockito.cglib.core.ReflectUtils.getBeanProperties(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] {};
        int int2 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo1 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L243601416");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L243601416");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getDescriptor(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("L243601416", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.beans.PropertyDescriptor[] propertyDescriptorArray1 = org.mockito.cglib.core.ReflectUtils.getBeanGetters(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        java.lang.String[] strArray10 = new java.lang.String[] { "L243601416", "L243601416", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod(100, "", "L243601416", "hi!", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5e7f4667");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor7 = classEmitter1.visitField(124, "", "hi!", "hi!", (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type type6 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getInternalName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.String str14 = type12.getInternalName();
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type6, type8, type12 };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.begin_class(7, 0, "", type5, typeArray15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "L243601416", "L243601416", "", "L243601416" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(1, 0, "L243601416", "hi!", "", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "", "L243601416", "" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit((int) (short) 10, 5, "L243601416", "", "L243601416", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("", "", "", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str8 = signature7.toString();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.String str17 = type15.getInternalName();
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local(0, type15);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type10, type12, type15 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter20 = classEmitter1.begin_method((int) 'a', signature7, typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@50cc81bc");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(typeArray19);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("L243601416");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass7);
        java.lang.Class[] classArray9 = new java.lang.Class[] { wildcardClass7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor10 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray9);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter1.visitField((int) (byte) 10, "hi!", "hi!", "L243601416", (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3, classArray5, (java.lang.Object[]) methodArray12);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L243601416", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer6 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.INT_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.declare_field(124, "(DZ)Z", type6, (java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("", "L243601416", "L243601416");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter1 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("(DZ)Z", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getMethodDescriptor(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6669925e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("L243601416", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int0 = org.mockito.cglib.core.CodeEmitter.EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 153 + "'", int0 == 153);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.lang.reflect.Constructor constructor0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.asm.Type.getConstructorDescriptor(constructor0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = classEmitter2.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("L243601416", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.ReflectUtils.getExceptionTypes(member0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get exception types of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
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
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "double", classArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: double");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit((-1), 112, "hi!", "(IZ)Lhi!;", "hi!", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@11c3f0ee");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("", "", "L243601416", 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        byte[] byteArray1 = new byte[] {};
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class3 = org.mockito.cglib.core.ReflectUtils.defineClass("L243601416", byteArray1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitSource("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        int int5 = type4.getSort();
        java.lang.Class<?> wildcardClass6 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer8 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("", "double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2113f9b2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit((int) (short) -1, 155, "(IZ)Lhi!;", "L243601416", "(IZ)Lhi!;", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (byte) -1, "L243601416", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter1.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(methodArray6);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("(IZ)Lhi!;", "(IZ)Lhi!;", "(IZ)Lhi!;", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = propertyDescriptorArray5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.beans.PropertyDescriptor; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
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
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Z");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("double");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(DZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit((int) (byte) 1, 0, "(DZ)Z", "Z", "(DZ)Z", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = propertyDescriptorArray5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class [Ljava.beans.PropertyDescriptor; is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(7, "", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.reflect.Method method0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType(method0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.CHAR_TYPE;
        int int9 = type7.getOpcode(10);
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
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.begin_class(154, 10, "double", type7, typeArray22, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
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
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass3, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("Z", "(IZ)Lhi!;", "", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.util.List list5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list6 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray10 = new java.lang.String[] { "double", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod((int) (byte) 10, "double", "", "Z", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@18397f5d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor9 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray5);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
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
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.lang.Class class0 = null;
        java.util.List list1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list2 = org.mockito.cglib.core.ReflectUtils.addAllMethods(class0, list1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("", "L243601416", "double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter6.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@524fd244");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("double", "L276889264");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
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
        java.util.List list14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list15 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass11, list14);
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
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.Class[] classArray19 = new java.lang.Class[] { wildcardClass8, wildcardClass12, wildcardClass16 };
        int int20 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor21 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray19);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(classArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.mockito.cglib.core.CodeEmitter codeEmitter0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter1 = new org.mockito.cglib.core.CodeEmitter(codeEmitter0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitSource("(IZ)Lhi!;", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str12 = type11.getClassName();
        int int13 = type11.getSort();
        int int15 = type11.getOpcode(104);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int19 = type17.getOpcode(5);
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local((-1), type17);
        org.mockito.asm.Type type21 = local20.getType();
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        int int25 = type24.getSort();
        java.lang.String str26 = type24.getInternalName();
        org.mockito.cglib.core.Local local27 = new org.mockito.cglib.core.Local(0, type24);
        org.mockito.asm.Type type28 = local27.getType();
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type11, type21, type28 };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.begin_class(1, 7, "org.mockito.asm.Type", type10, typeArray29, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "double" + "'", str12, "double");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 107 + "'", int15 == 107);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
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
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("(DZ)Z", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
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
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor9 = classEmitter1.visitMethod(112, "double", "(DZ)Z", "Z", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@53824883");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("double");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray11 = new java.lang.String[] { "L276889264" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter5.visitMethod((int) (short) 0, "", "Lhi!;", "org.mockito.asm.Type", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4c8eded4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str7 = type6.getClassName();
        int int8 = type6.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.declare_field(7, "(DZ)Z", type6, (java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "double" + "'", str7, "double");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "Lhi!;", classArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Lhi!;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitSource("org/mockito/asm/Type", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter5.visitField(96, "double", "", "L243601416", (java.lang.Object) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("hi!");
        int int16 = type15.getSort();
        java.lang.Class<?> wildcardClass17 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        java.lang.Class[] classArray20 = new java.lang.Class[] { wildcardClass9, wildcardClass13, wildcardClass17 };
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor22 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray20);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(org.mockito.asm.Type, org.mockito.asm.Type, org.mockito.asm.Type)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("char");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(10, "Lhi!;", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("", "L243601416", "(IZ)C", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
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
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(4, (int) (byte) 100, "(IZ)C", "", "L243601416", strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("char");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute9 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter1.visitMethod(108, "hi!", "double", "L243601416", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@201c2a1e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
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
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.declare_field(100, "L243601416", type9, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit((int) ' ', (int) (byte) 1, "double", "char", "org/mockito/asm/Type", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.ClassVisitor classVisitor2 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor2);
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter3.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.Class[] classArray14 = new java.lang.Class[] {};
        int int15 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray14);
        java.lang.String[] strArray16 = org.mockito.cglib.core.ReflectUtils.getNames(classArray14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visit((int) ' ', 0, "L276889264", "Z", "", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
        org.junit.Assert.assertNotNull(classArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor8 = classEmitter1.visitField(9, "Lhi!;", "org.mockito.asm.Type", "(IZ)C", (java.lang.Object) 157);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L276889264");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("double", "", "Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        java.lang.String str3 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L14909359" + "'", str3, "L14909359");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("L276889264", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class<?> wildcardClass6 = propertyDescriptorArray5.getClass();
        java.lang.Class[] classArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method9 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass6, "org/mockito/asm/Type", classArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: org/mockito/asm/Type");
        } catch (java.lang.NoSuchMethodException e) {
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
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("org.mockito.asm.Type", "char", "L243601416", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(IZ)Lhi!;", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(IZ)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
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
            classEmitter5.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("char");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
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
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(10);
        java.lang.String str4 = type1.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getInternalName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type13.getOpcode(5);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type11, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "char" + "'", str4, "char");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(IZ)Lhi!;" + "'", str19, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(IZ)C" + "'", str20, "(IZ)C");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str7 = signature6.getName();
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter23 = classEmitter1.begin_method((int) (byte) 0, signature6, typeArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1b0845cd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(IZ)Lhi!;" + "'", str22, "(IZ)Lhi!;");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("Lhi!;", "", "Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor8 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter(classVisitor8);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter9.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter9);
        org.mockito.asm.ClassVisitor classVisitor12 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter(classVisitor12);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter1.visitField(0, "(DZ)Z", "L243601416", "hi!", (java.lang.Object) classEmitter11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.util.List list4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list5 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod(2, "", "L243601416", "(IZ)C", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@26ae209b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("org/mockito/asm/Type", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("(IZ)C", "L243601416", "Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod(158, "org.mockito.asm.Type", "L276889264", "L276889264", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@62908e82");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = classEmitter1.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter5.visitAnnotation("Lhi!;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str8 = type7.getClassName();
        int int9 = type7.getSort();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type15 = local14.getType();
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getObjectType("hi!");
        int int21 = type20.getSort();
        java.lang.String str22 = type20.getInternalName();
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local(0, type20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type26 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int28 = type26.getOpcode(5);
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local((-1), type26);
        org.mockito.asm.Type type30 = local29.getType();
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type24, type30 };
        java.lang.String str32 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray31);
        boolean boolean34 = type20.equals((java.lang.Object) 10L);
        int int35 = type20.getSort();
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(9, type20);
        org.mockito.asm.Type type37 = local36.getType();
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type15, type37 };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.begin_class((int) (byte) 100, (int) (short) 0, "(DZ)Z", type7, typeArray38, "char");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "double" + "'", str8, "double");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Z" + "'", str16, "Z");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(IZ)Lhi!;" + "'", str32, "(IZ)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.Class[] classArray5 = new java.lang.Class[] {};
        int int6 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray5);
        java.lang.String[] strArray7 = org.mockito.cglib.core.ReflectUtils.getNames(classArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor8 = classEmitter0.visitMethod(3, "org.mockito.asm.Type", "boolean", "hi!", strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1b22df6f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.String str7 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str7, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
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
            classEmitter1.visitOuterClass("(IZ)C", "Lorg/mockito/asm/Type;", "(IZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("L243601416", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type[] typeArray7 = classInfo6.getInterfaces();
        java.lang.Class<?> wildcardClass8 = classInfo6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer9 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ReflectUtils$4.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass6 = classInfo4.getClass();
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass6, classArray7, (java.lang.Object[]) propertyDescriptorArray16);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.cglib.core.ReflectUtils$4.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
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
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(IZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitSource("(IZ)C", "org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter3.visitAnnotation("Lorg/mockito/asm/Type;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = classEmitter3.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        java.lang.String[] strArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter5.visitMethod(116, "(IZ)C", "(IZ)Lhi!;", "Z", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(IZ)C' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter6.visitAnnotation("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3);
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
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitOuterClass("Lorg/mockito/asm/Type;", "", "char");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("L276889264", "java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("java.beans.PropertyDescriptor[name=hi!]", "hi!", "Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter3.visitAnnotation("org/mockito/asm/Type", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("L276889264");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit(158, 124, "L930922338", "org/mockito/asm/Type", "char", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(methodArray13);
        org.junit.Assert.assertNotNull(methodArray14);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(DZ)Z", "(DZ)Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DZ)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L930922338", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
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
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str5 = signature4.toString();
        label0.info = str5;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
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
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        int int12 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(1, 4, "org.mockito.asm.Type", "Lorg/mockito/asm/Type;", "(DZ)Z", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.mockito.asm.Type type1 = null;
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type3.getOpcode(5);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode(5);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type6, type8 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean24 = classInfo21.equals((java.lang.Object) type23);
        int int25 = classInfo21.getModifiers();
        org.mockito.asm.Type type26 = classInfo21.getType();
        org.mockito.asm.Type type27 = type26.getElementType();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.getObjectType("hi!");
        int int30 = type29.getSort();
        java.lang.Class<?> wildcardClass31 = type29.getClass();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass31);
        org.mockito.cglib.core.ClassInfo classInfo33 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean36 = classInfo33.equals((java.lang.Object) type35);
        java.lang.Object obj37 = null;
        boolean boolean38 = type35.equals(obj37);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getObjectType("hi!");
        int int41 = type40.getSort();
        java.lang.Class<?> wildcardClass42 = type40.getClass();
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass42);
        org.mockito.cglib.core.ClassInfo classInfo44 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass42);
        org.mockito.asm.Type type46 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean47 = classInfo44.equals((java.lang.Object) type46);
        int int48 = classInfo44.getModifiers();
        org.mockito.asm.Type type49 = classInfo44.getType();
        org.mockito.asm.Type type50 = type49.getElementType();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type14, type15, type27, type35, type50 };
        org.mockito.cglib.core.Signature signature52 = new org.mockito.cglib.core.Signature("", type3, typeArray51);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("Lhi!;", type1, typeArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(DZ)Z" + "'", str13, "(DZ)Z");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(classInfo33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(classInfo44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(typeArray51);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.String str10 = type8.getInternalName();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.begin_class(2, 156, "Z", type8, typeArray16, "(IZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter1.visitField(158, "L276889264", "double", "", (java.lang.Object) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
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
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.Object obj8 = propertyDescriptor3.getValue("L276889264");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        boolean boolean11 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("Lhi!;", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitSource("L243601416", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "boolean", "Lhi!;" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter5.visitMethod(112, "Z", "L527178774", "double", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@37fb9777");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitSource("java.beans.PropertyDescriptor[name=hi!]", "java.beans.PropertyDescriptor[name=hi!]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(156, "Lorg/mockito/asm/Type;", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
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
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visitInnerClass("(DZ)Z", "L243601416", "(DZ)Z", (int) (byte) 10);
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
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L243601416");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("(IZ)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("Lorg/mockito/asm/Type;", "", "Lorg/mockito/asm/Type;", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitSource("", "L243601416hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(false);
        boolean boolean6 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
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
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray20 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor22 = classEmitter9.visitMethod((int) (short) 0, "L243601416", "L243601416hi!", "(DZ)Z", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@38f606fa");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(methodArray21);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.Object obj8 = propertyDescriptor3.getValue("L276889264");
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setWriteMethod(method9);
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; constrained]" + "'", str11, "java.beans.PropertyDescriptor[name=hi!; constrained]");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.beans.PropertyDescriptor[] propertyDescriptorArray1 = org.mockito.cglib.core.ReflectUtils.getBeanSetters(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass8);
        java.lang.Class[] classArray11 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray10);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        org.mockito.asm.Type[] typeArray20 = classInfo18.getInterfaces();
        org.mockito.asm.Label label21 = new org.mockito.asm.Label();
        java.lang.Object obj22 = label21.info;
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str26 = signature25.toString();
        label21.info = str26;
        java.lang.Object[] objArray28 = new java.lang.Object[] { 126, typeArray20, str26 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3, classArray11, objArray28);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[126, [], hi!]");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor13 = classEmitter3.visitMethod(130, "L243601416hi!", "java.beans.PropertyDescriptor[name=hi!]", "L527178774", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3bdf5f4c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.String[] strArray10 = new java.lang.String[] { "org.mockito.asm.Type" };
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit(126, 155, "double", "(IZ)Lhi!;", "L527178774", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type12 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int14 = type12.getOpcode(5);
        org.mockito.cglib.core.Local local15 = new org.mockito.cglib.core.Local((-1), type12);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type10, type12 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray16);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "", classArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: ");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(DZ)Z" + "'", str17, "(DZ)Z");
        org.junit.Assert.assertNotNull(classArray18);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        boolean boolean9 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setWriteMethod(method10);
        boolean boolean12 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter9.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@6e4581dd");
        } catch (java.lang.IllegalStateException e) {
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
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
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
            classEmitter5.visitInnerClass("L243601416hi!", "Z", "L243601416hi!", 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray6);
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.mockito.cglib.core.ReflectUtils.newInstance((java.lang.Class) wildcardClass3, classArray6, (java.lang.Object[]) propertyDescriptorArray15);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        java.lang.ClassLoader classLoader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class7 = org.mockito.cglib.core.ReflectUtils.defineClass("L276889264", byteArray5, classLoader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, 10]");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
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
            classEmitter7.visitOuterClass("Lorg/mockito/asm/Type;", "char", "(IZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.util.List list8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list9 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.String str7 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str7, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
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
            classEmitter7.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean18 = classInfo15.equals((java.lang.Object) type17);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.declare_field(14, "(IZ)Lhi!;", type17, (java.lang.Object) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L243601416", "hi!");
        java.lang.String str3 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L243601416hi!" + "'", str3, "L243601416hi!");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("L930922338", "Lhi!;", "", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        java.lang.ClassLoader classLoader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class4 = org.mockito.cglib.core.ReflectUtils.defineClass("(IZ)Lhi!;", byteArray2, classLoader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100]");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
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
        // The following exception was thrown during execution in test generation
        try {
            classEmitter9.visitEnd();
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
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = classInfo4.getType();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str9 = signature8.getName();
        boolean boolean10 = classInfo4.equals((java.lang.Object) signature8);
        java.lang.String str11 = classInfo4.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.mockito.asm.Type" + "'", str11, "org.mockito.asm.Type");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("", "Z", "L527178774", 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(6, "java.beans.PropertyDescriptor[name=hi!]", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) methodArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(DZ)Z", "Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DZ)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("boolean", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter5.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@231fd97e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        int int5 = type4.getSort();
        java.lang.Class<?> wildcardClass6 = type4.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer10 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.lang.reflect.Member member0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.MethodInfo methodInfo2 = org.mockito.cglib.core.ReflectUtils.getMethodInfo(member0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot get signature of a field");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.String str8 = type7.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor10 = classEmitter4.visitField(1, "C", "Z", "L243601416hi!", (java.lang.Object) 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass6 = classInfo4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.mockito.cglib.core.ReflectUtils.findNewInstance((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.ReflectUtils$4 is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(100, (int) (short) 10, "L243601416hi!", "", "L243601416hi!", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitOuterClass("java.beans.PropertyDescriptor[name=hi!]", "L930922338", "org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = classEmitter4.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
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
        java.lang.Class[] classArray15 = new java.lang.Class[] {};
        int int16 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.ReflectUtils.getNames(classArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass11, "(IZ)Lhi!;", classArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: (IZ)Lhi!;");
        } catch (java.lang.NoSuchMethodException e) {
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
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean12 = classInfo9.equals((java.lang.Object) type11);
        org.mockito.asm.Type type13 = classInfo9.getSuperType();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type13);
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
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("(DZ)Z", "(IZ)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DZ)Z' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
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
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("(IZ)Lhi!;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("double", "org/mockito/asm/Type", "double");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        label4.info = classArray6;
        int[] intArray9 = null;
        org.mockito.asm.Label label10 = new org.mockito.asm.Label();
        java.lang.Object obj11 = label10.info;
        label10.info = ' ';
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        java.lang.Object obj15 = label14.info;
        label14.info = ' ';
        org.mockito.asm.Label[] labelArray18 = new org.mockito.asm.Label[] { label10, label14 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray9, labelArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(labelArray18);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        int int5 = type4.getSort();
        java.lang.Class<?> wildcardClass6 = type4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer8 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int9 = type7.getOpcode(5);
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local((-1), type7);
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type5, type7 };
        java.lang.String str12 = org.mockito.asm.Type.getMethodDescriptor(type2, typeArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean23 = classInfo20.equals((java.lang.Object) type22);
        int int24 = classInfo20.getModifiers();
        org.mockito.asm.Type type25 = classInfo20.getType();
        org.mockito.asm.Type type26 = type25.getElementType();
        org.mockito.asm.Type type28 = org.mockito.asm.Type.getObjectType("hi!");
        int int29 = type28.getSort();
        java.lang.Class<?> wildcardClass30 = type28.getClass();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass30);
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass30);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean35 = classInfo32.equals((java.lang.Object) type34);
        java.lang.Object obj36 = null;
        boolean boolean37 = type34.equals(obj36);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getObjectType("hi!");
        int int40 = type39.getSort();
        java.lang.Class<?> wildcardClass41 = type39.getClass();
        org.mockito.asm.Type type42 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass41);
        org.mockito.cglib.core.ClassInfo classInfo43 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass41);
        org.mockito.asm.Type type45 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean46 = classInfo43.equals((java.lang.Object) type45);
        int int47 = classInfo43.getModifiers();
        org.mockito.asm.Type type48 = classInfo43.getType();
        org.mockito.asm.Type type49 = type48.getElementType();
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type13, type14, type26, type34, type49 };
        org.mockito.cglib.core.Signature signature51 = new org.mockito.cglib.core.Signature("", type2, typeArray50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) typeArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(DZ)Z" + "'", str12, "(DZ)Z");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(classInfo32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(classInfo43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(typeArray50);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.Class<?> wildcardClass9 = type7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo18 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray19 = classInfo18.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(2, 9, (java.lang.Object[]) propertyDescriptorArray11, 14, (java.lang.Object[]) typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(classInfo18);
        org.junit.Assert.assertNotNull(typeArray19);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = classEmitter2.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(0, 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 3;
        label6.info = 130;
        org.mockito.asm.Label[] labelArray11 = new org.mockito.asm.Label[] {};
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) (byte) -1, 124, label6, labelArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(labelArray11);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(0, "[Ljava/beans/PropertyDescriptor;", "char", "(IZ)Lhi!;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) classEmitter7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(100, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
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
            classEmitter6.visitInnerClass("org/mockito/asm/Type", "L243601416", "boolean", 156);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitInnerClass("L243601416hi!", "org.mockito.asm.Type", "[Ljava/beans/PropertyDescriptor;", 108);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("C");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        label5.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) '#', label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor11 = classEmitter5.visitField(104, "Z", "L243601416hi!", "L527178774", (java.lang.Object) 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitOuterClass("double", "org/mockito/asm/Type", "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L276889264");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor5 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str8, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Z", "L527178774");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray14 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray15 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray13, methodArray14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visit(107, 116, "(DZ)Z", "L930922338", "Z", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(methodArray14);
        org.junit.Assert.assertNotNull(methodArray15);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.String str9 = propertyDescriptor3.getShortDescription();
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean11 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        int int10 = type8.getOpcode(10);
        java.lang.String str11 = type8.getClassName();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.String str16 = type14.getInternalName();
        org.mockito.cglib.core.Local local17 = new org.mockito.cglib.core.Local(0, type14);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode(5);
        org.mockito.cglib.core.Local local23 = new org.mockito.cglib.core.Local((-1), type20);
        org.mockito.asm.Type type24 = local23.getType();
        org.mockito.asm.Type[] typeArray25 = new org.mockito.asm.Type[] { type18, type24 };
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type14, typeArray25);
        java.lang.String str27 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray25);
        java.lang.Class[] classArray28 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method29 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "C", classArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: C");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "char" + "'", str11, "char");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(IZ)Lhi!;" + "'", str26, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(IZ)C" + "'", str27, "(IZ)C");
        org.junit.Assert.assertNotNull(classArray28);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setDisplayName("boolean");
        boolean boolean8 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method9 = null;
        propertyDescriptor3.setReadMethod(method9);
        java.lang.String str11 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]" + "'", str11, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str12 = signature11.toString();
        label7.info = str12;
        org.mockito.asm.Label label14 = new org.mockito.asm.Label();
        label14.info = 3;
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        java.lang.Object obj18 = label17.info;
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        org.mockito.asm.Label[] labelArray22 = new org.mockito.asm.Label[] { label14, label17, label19, label20 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTableSwitchInsn((int) '#', (int) 'a', label7, labelArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(labelArray22);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        propertyDescriptor12.setHidden(false);
        java.lang.reflect.Method method15 = propertyDescriptor12.getReadMethod();
        java.lang.reflect.Method method16 = null;
        propertyDescriptor12.setWriteMethod(method16);
        // The following exception was thrown during execution in test generation
        try {
            propertyDescriptor3.setValue("(IZ)C", (java.lang.Object) method16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.CHAR_TYPE;
        int int10 = type8.getOpcode(10);
        java.lang.String str11 = type8.getClassName();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray18 = classInfo17.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.begin_class((int) (short) 1, 10, "Lorg/mockito/asm/Type;", type8, typeArray18, "L527178774");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "char" + "'", str11, "char");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(classInfo17);
        org.junit.Assert.assertNotNull(typeArray18);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getObjectType("hi!");
        int int4 = type3.getSort();
        java.lang.String str5 = type3.getInternalName();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local(0, type3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode(5);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type type13 = local12.getType();
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type7, type13 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray14);
        boolean boolean17 = type3.equals((java.lang.Object) 10L);
        int int18 = type3.getSort();
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local(9, type3);
        org.mockito.asm.Type type20 = local19.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type21 = type20.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(IZ)Lhi!;" + "'", str15, "(IZ)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) ' ', 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        int int7 = type5.getOpcode(10);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLdcInsn((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter3.visitAnnotation("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass5, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        boolean boolean6 = propertyDescriptor3.isHidden();
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
        boolean boolean24 = type10.equals((java.lang.Object) 10L);
        int int25 = type10.getSort();
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(9, type10);
        org.mockito.asm.Type type27 = local26.getType();
        int int28 = local26.getIndex();
        boolean boolean29 = propertyDescriptor3.equals((java.lang.Object) int28);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(IZ)Lhi!;" + "'", str22, "(IZ)Lhi!;");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("L527178774", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray14 = classInfo13.getInterfaces();
        org.mockito.asm.Type[] typeArray15 = classInfo13.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter16 = classEmitter1.begin_method((int) (short) 100, signature7, typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@34ca4fd1");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(classInfo7);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class[] classArray1 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("L930922338", 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter5.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo6);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter3.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.Class[] classArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(128, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(108, "org.mockito.asm.Type", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        java.lang.Object obj9 = label8.info;
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str13 = signature12.toString();
        label8.info = str13;
        java.lang.String str15 = label8.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLocalVariable("L276889264", "boolean", "java.beans.PropertyDescriptor[name=hi!]", label8, label16, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 128");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L14850351" + "'", str15, "L14850351");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn(116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type4.getOpcode(5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode(5);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type7, type9 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean25 = classInfo22.equals((java.lang.Object) type24);
        int int26 = classInfo22.getModifiers();
        org.mockito.asm.Type type27 = classInfo22.getType();
        org.mockito.asm.Type type28 = type27.getElementType();
        org.mockito.asm.Type type30 = org.mockito.asm.Type.getObjectType("hi!");
        int int31 = type30.getSort();
        java.lang.Class<?> wildcardClass32 = type30.getClass();
        org.mockito.asm.Type type33 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.cglib.core.ClassInfo classInfo34 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean37 = classInfo34.equals((java.lang.Object) type36);
        java.lang.Object obj38 = null;
        boolean boolean39 = type36.equals(obj38);
        org.mockito.asm.Type type41 = org.mockito.asm.Type.getObjectType("hi!");
        int int42 = type41.getSort();
        java.lang.Class<?> wildcardClass43 = type41.getClass();
        org.mockito.asm.Type type44 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass43);
        org.mockito.cglib.core.ClassInfo classInfo45 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass43);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean48 = classInfo45.equals((java.lang.Object) type47);
        int int49 = classInfo45.getModifiers();
        org.mockito.asm.Type type50 = classInfo45.getType();
        org.mockito.asm.Type type51 = type50.getElementType();
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type15, type16, type28, type36, type51 };
        org.mockito.cglib.core.Signature signature53 = new org.mockito.cglib.core.Signature("", type4, typeArray52);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        int int56 = type55.getSort();
        java.lang.Class<?> wildcardClass57 = type55.getClass();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        org.mockito.cglib.core.ClassInfo classInfo59 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass57);
        org.mockito.asm.Type[] typeArray60 = classInfo59.getInterfaces();
        org.mockito.asm.Type[] typeArray61 = classInfo59.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter62 = classEmitter1.begin_method(133, signature53, typeArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@30629085");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(DZ)Z" + "'", str14, "(DZ)Z");
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
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(classInfo34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(classInfo45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(classInfo59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray61);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
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
        org.mockito.cglib.core.Signature signature15 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str16 = signature15.getName();
        java.lang.String str17 = signature15.getName();
        java.lang.String str18 = signature15.getName();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.CHAR_TYPE;
        int int21 = type19.getOpcode(10);
        java.lang.String str22 = type19.getClassName();
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getObjectType("hi!");
        int int26 = type25.getSort();
        java.lang.String str27 = type25.getInternalName();
        org.mockito.cglib.core.Local local28 = new org.mockito.cglib.core.Local(0, type25);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type31 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int33 = type31.getOpcode(5);
        org.mockito.cglib.core.Local local34 = new org.mockito.cglib.core.Local((-1), type31);
        org.mockito.asm.Type type35 = local34.getType();
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type29, type35 };
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type25, typeArray36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter39 = classEmitter9.begin_method((int) '4', signature15, typeArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4568f481");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "char" + "'", str22, "char");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "(IZ)Lhi!;" + "'", str37, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(IZ)C" + "'", str38, "(IZ)C");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 3;
        label5.info = 130;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(6, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        java.lang.Class[] classArray6 = new java.lang.Class[] {};
        int int7 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray6);
        label4.info = classArray6;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("hi!", method12, method13);
        propertyDescriptor14.setHidden(false);
        java.lang.reflect.Method method17 = propertyDescriptor14.getReadMethod();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter6.visitField(0, "(IZ)Lhi!;", "(IZ)C", "(IZ)Lhi!;", (java.lang.Object) propertyDescriptor14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter3.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7d1a0431");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        java.lang.Object obj10 = label9.info;
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str14 = signature13.toString();
        label9.info = str14;
        java.lang.Object obj16 = label9.info;
        org.mockito.asm.Label[] labelArray17 = new org.mockito.asm.Label[] { label8, label9 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) (byte) 100, (int) '#', label7, labelArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertNotNull(labelArray17);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str10 = signature9.toString();
        label5.info = str10;
        java.lang.Object obj12 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) ' ', label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Attribute attribute5 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitAttribute(attribute5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = classEmitter1.getSuperType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = classEmitter5.getClassType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
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
        boolean boolean15 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "boolean" + "'", str9, "boolean");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "boolean" + "'", str11, "boolean");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "boolean" + "'", str12, "boolean");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("L527178774");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(130, "(IZ)C", "double", "L1900097269");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("Z", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getName();
        java.lang.Class<?> wildcardClass5 = signature2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method6 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.cglib.core.Signature is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.lang.Class[] classArray0 = null;
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
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
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("C", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        java.lang.Object[] objArray7 = null;
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type[] typeArray17 = classInfo16.getInterfaces();
        java.lang.Class<?> wildcardClass18 = classInfo16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo19 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        java.lang.reflect.Method[] methodArray23 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray20, true, false);
        java.lang.reflect.Method[] methodArray24 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray11, methodArray23);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFrame(128, 133, objArray7, (int) (byte) 1, (java.lang.Object[]) methodArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(methodArray23);
        org.junit.Assert.assertNotNull(methodArray24);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getObjectType("hi!");
        int int13 = type12.getSort();
        java.lang.Class<?> wildcardClass14 = type12.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        int int17 = type16.getSort();
        java.lang.Class<?> wildcardClass18 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass18);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass18);
        java.lang.Class[] classArray21 = new java.lang.Class[] { wildcardClass10, wildcardClass14, wildcardClass18 };
        int int22 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method24 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "L527178774", classArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: L527178774");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIntInsn((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visit((int) (byte) 10, (int) (short) 10, "[Ljava/beans/PropertyDescriptor;", "C", "L243601416", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor8 = localVariablesSorter4.visitParameterAnnotation(108, "[Ljava/beans/PropertyDescriptor;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getObjectType("hi!");
        int int18 = type17.getSort();
        java.lang.Class<?> wildcardClass19 = type17.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        java.lang.Class[] classArray22 = new java.lang.Class[] { wildcardClass11, wildcardClass15, wildcardClass19 };
        int int23 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        int int24 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method25 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "Lorg/mockito/asm/Type;", classArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: Lorg/mockito/asm/Type;");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertNotNull(classArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitSource("C", "[Ljava/beans/PropertyDescriptor;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; displayName=boolean]");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        java.lang.reflect.Method method7 = propertyDescriptor3.getWriteMethod();
        boolean boolean8 = propertyDescriptor3.isBound();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getInternalName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(0, type2);
        org.mockito.asm.Type type6 = local5.getType();
        org.mockito.asm.Type type7 = local5.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = type7.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        label8.info = 3;
        label8.info = 130;
        java.lang.String str13 = label8.toString();
        java.lang.Object obj14 = label8.info;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.Object obj16 = label15.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("", "L1900097269", "(IZ)C", label8, label15, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1896486798" + "'", str13, "L1896486798");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 130 + "'", obj14, 130);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        java.lang.reflect.Method method6 = null;
        java.lang.reflect.Method method7 = null;
        java.beans.PropertyDescriptor propertyDescriptor8 = new java.beans.PropertyDescriptor("hi!", method6, method7);
        propertyDescriptor8.setHidden(false);
        propertyDescriptor8.setDisplayName("boolean");
        propertyDescriptor8.setExpert(false);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode(5);
        propertyDescriptor8.setValue("L276889264", (java.lang.Object) 5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) "L276889264");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("[Ljava/beans/PropertyDescriptor;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter1.getStaticHook();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.lang.reflect.Constructor constructor0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray5 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray6 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray4, methodArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(methodArray5);
        org.junit.Assert.assertNotNull(methodArray6);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitOuterClass("(DZ)Lhi!;", "C", "L243601416");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitVarInsn(153, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(1, "Z", "java.beans.PropertyDescriptor[name=hi!]", "(IZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMethodInsn(2, "java.beans.PropertyDescriptor[name=hi!]", "L243601416", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.asm.Attribute attribute3 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.visitAttribute(attribute3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = classEmitter6.visitAnnotation("(IZ)Lhi!;", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor2 = org.mockito.cglib.core.ReflectUtils.findConstructor("L930922338", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        org.mockito.cglib.core.Signature signature11 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str12 = signature11.toString();
        label7.info = str12;
        java.lang.String str14 = label7.toString();
        java.lang.String str15 = label7.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        label16.info = 1.0d;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        label20.info = 3;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        label23.info = 3;
        label23.info = 130;
        java.lang.String str28 = label23.toString();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.Object obj30 = label29.info;
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str34 = signature33.toString();
        label29.info = str34;
        java.lang.String str36 = label29.toString();
        java.lang.String str37 = label29.toString();
        org.mockito.asm.Label[] labelArray38 = new org.mockito.asm.Label[] { label16, label20, label23, label29 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn(2, 10, label7, labelArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1883365841" + "'", str14, "L1883365841");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1883365841" + "'", str15, "L1883365841");
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L715220414" + "'", str28, "L715220414");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1936836440" + "'", str36, "L1936836440");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1936836440" + "'", str37, "L1936836440");
        org.junit.Assert.assertNotNull(labelArray38);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.Class<?> wildcardClass13 = type11.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass13);
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass13);
        org.mockito.cglib.core.ClassInfo classInfo16 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.declare_field(107, "org.mockito.asm.Type", type9, (java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(classInfo16);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        label4.info = 3;
        java.lang.String str7 = label4.toString();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode(5);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type16 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int18 = type16.getOpcode(5);
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((-1), type16);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type14, type16 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type11, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray20);
        label4.info = str22;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L1800867751" + "'", str7, "L1800867751");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(DZ)Z" + "'", str21, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(DZ)Z" + "'", str22, "(DZ)Z");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("(IZ)Lhi!;", 133);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray11 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray10, methodArray11);
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
        org.mockito.asm.Type[] typeArray28 = classInfo19.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitFrame(130, 1, (java.lang.Object[]) methodArray11, (int) (byte) -1, (java.lang.Object[]) typeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(methodArray11);
        org.junit.Assert.assertNotNull(methodArray12);
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
        org.junit.Assert.assertNotNull(typeArray28);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method10 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "java.beans.PropertyDescriptor[name=hi!; constrained]", classArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=hi!; constrained]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        label7.info = 1.0d;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        java.lang.Class[] classArray13 = new java.lang.Class[] {};
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray13);
        label11.info = classArray13;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.Object obj17 = label16.info;
        label16.info = 1.0d;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str25 = signature24.toString();
        label20.info = str25;
        java.lang.Object obj27 = label20.info;
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.Object obj29 = label28.info;
        java.lang.Class[] classArray30 = new java.lang.Class[] {};
        int int31 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray30);
        label28.info = classArray30;
        org.mockito.asm.Label[] labelArray33 = new org.mockito.asm.Label[] { label11, label16, label20, label28 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTableSwitchInsn((int) (short) 1, 14, label7, labelArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(classArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(classArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(labelArray33);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setPreferred(false);
        boolean boolean8 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor4);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter7 = new org.mockito.cglib.core.LocalVariablesSorter(124, "Lorg/mockito/asm/Type;", (org.mockito.asm.MethodVisitor) localVariablesSorter5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getObjectType("hi!");
        int int7 = type6.getSort();
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass8);
        org.mockito.cglib.core.ClassInfo classInfo10 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass8);
        int int11 = classInfo10.getModifiers();
        int int12 = classInfo10.getModifiers();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("hi!");
        int int15 = type14.getSort();
        java.lang.Class<?> wildcardClass16 = type14.getClass();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        boolean boolean18 = classInfo10.equals((java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(classInfo10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.Class[] classArray8 = new java.lang.Class[] {};
        int int9 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray8);
        java.lang.String[] strArray10 = org.mockito.cglib.core.ReflectUtils.getNames(classArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor11 = classEmitter1.visitMethod(10, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "", "boolean", strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@349bfbd6");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setConstrained(true);
        boolean boolean6 = propertyDescriptor3.isHidden();
        java.lang.Object obj8 = propertyDescriptor3.getValue("L276889264");
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo14 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean17 = classInfo14.equals((java.lang.Object) type16);
        org.mockito.asm.Type type18 = classInfo14.getSuperType();
        int int19 = classInfo14.getModifiers();
        boolean boolean20 = propertyDescriptor3.equals((java.lang.Object) classInfo14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(classInfo14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.CHAR_TYPE;
        int int7 = type5.getOpcode(10);
        java.lang.String str8 = type5.getClassName();
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
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray22);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) typeArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "char" + "'", str8, "char");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(IZ)Lhi!;" + "'", str23, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(IZ)C" + "'", str24, "(IZ)C");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 3;
        int[] intArray10 = new int[] { (short) 100, (short) -1 };
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        label11.info = 1.0d;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = 3;
        label15.info = 130;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        java.lang.Object obj21 = label20.info;
        org.mockito.cglib.core.Signature signature24 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str25 = signature24.toString();
        label20.info = str25;
        org.mockito.asm.Label[] labelArray27 = new org.mockito.asm.Label[] { label11, label15, label20 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label5, intArray10, labelArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, -1]");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(labelArray27);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.Object obj5 = label4.info;
        label4.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.reflect.Method method6 = propertyDescriptor3.getReadMethod();
        java.lang.reflect.Method method7 = propertyDescriptor3.getReadMethod();
        java.lang.String str8 = propertyDescriptor3.getName();
        java.lang.String str9 = propertyDescriptor3.toString();
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.beans.PropertyDescriptor[name=hi!]" + "'", str9, "java.beans.PropertyDescriptor[name=hi!]");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
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
        java.lang.String str27 = propertyDescriptor3.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]" + "'", str27, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn(14, "(DZ)Lhi!;", "(IZ)Lhi!;", "org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMultiANewArrayInsn("Lhi!;", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.reflect.Constructor constructor0 = null;
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.Class<?> wildcardClass4 = type2.getClass();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.mockito.cglib.core.ReflectUtils.newInstance(constructor0, (java.lang.Object[]) propertyDescriptorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(5);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type3.getOpcode(5);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode(5);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type6, type8 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        java.lang.String str15 = type0.toString();
        org.mockito.asm.Type[] typeArray16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(DZ)Z" + "'", str13, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(DZ)Z" + "'", str14, "(DZ)Z");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Z" + "'", str15, "Z");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getObjectType("hi!");
        int int12 = type11.getSort();
        java.lang.String str13 = type11.getInternalName();
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local(0, type11);
        org.mockito.asm.Type type15 = local14.getType();
        java.lang.String str16 = type15.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        java.lang.Class<?> wildcardClass20 = type18.getClass();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo22 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean25 = classInfo22.equals((java.lang.Object) type24);
        int int26 = classInfo22.getModifiers();
        org.mockito.asm.Type[] typeArray27 = classInfo22.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter5.begin_class(157, (int) '4', "Lhi!;", type15, typeArray27, "(IZ)C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lhi!;" + "'", str16, "Lhi!;");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(classInfo22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(typeArray27);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIntInsn(0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.Object obj7 = label6.info;
        label6.info = ' ';
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn(156, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitIincInsn((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.String[] strArray16 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray17 = new java.lang.Class[] {};
        int int18 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.ReflectUtils.getNames(classArray17);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray25 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray26 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray24, methodArray25);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray20, methodArray25);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray27);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visit((-1), 10, "(DZ)Lhi!;", "(DZ)Lhi!;", "()Ljava/lang/Object;", strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(methodArray25);
        org.junit.Assert.assertNotNull(methodArray26);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(methodArray28);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        int int1 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("hi!");
        int int5 = type4.getSort();
        java.lang.Class<?> wildcardClass6 = type4.getClass();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass6);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.lang.String str9 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer10 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray0, (java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/asm/Type" + "'", str9, "org/mockito/asm/Type");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.lang.ClassLoader classLoader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method2 = org.mockito.cglib.core.ReflectUtils.findMethod("Lorg/mockito/asm/Type;", classLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("hi!");
        int int3 = type2.getSort();
        java.lang.String str4 = type2.getInternalName();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local(0, type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = type2.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitInsn(158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        java.lang.String str11 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.getObjectType("hi!");
        int int14 = type13.getSort();
        java.lang.Class<?> wildcardClass15 = type13.getClass();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("hi!");
        int int20 = type19.getSort();
        java.lang.Class<?> wildcardClass21 = type19.getClass();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass21);
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass10, wildcardClass15, wildcardClass21 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method27 = org.mockito.cglib.core.ReflectUtils.findDeclaredMethod((java.lang.Class) wildcardClass3, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", classArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NoSuchMethodException; message: java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]");
        } catch (java.lang.NoSuchMethodException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str11, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(classInfo17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/asm/Type" + "'", str24, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(classArray26);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("boolean");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        java.lang.Class[] classArray14 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor15 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass3, classArray14);
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
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertNotNull(classArray14);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        label6.info = 3;
        label6.info = 130;
        java.lang.String str11 = label6.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitJumpInsn((int) (byte) -1, label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L99127049" + "'", str11, "L99127049");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor9 = classEmitter3.visitField((int) (byte) 0, "", "Lorg/mockito/asm/Type;", "L243601416", (java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
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
        java.lang.String[] strArray19 = new java.lang.String[] { "Lorg/mockito/asm/Type;", "Lorg/mockito/asm/Type;", "(IZ)C", "char" };
        java.lang.Class[] classArray20 = new java.lang.Class[] {};
        int int21 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray23 = org.mockito.cglib.core.ReflectUtils.getNames(classArray20);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray28 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray29 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray27, methodArray28);
        java.lang.reflect.Method[] methodArray30 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray23, methodArray28);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray19, methodArray30);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visit(10, (int) '#', "", "C", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(classArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertNotNull(methodArray29);
        org.junit.Assert.assertNotNull(methodArray30);
        org.junit.Assert.assertNotNull(methodArray31);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setConstrained(false);
        boolean boolean8 = propertyDescriptor3.isBound();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("L930922338");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("(IZ)Lhi!;");
        org.mockito.asm.Type type3 = type2.getElementType();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.Class<?> wildcardClass7 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass7);
        org.mockito.cglib.core.ClassInfo classInfo9 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        int int10 = classInfo9.getModifiers();
        int int11 = classInfo9.getModifiers();
        org.mockito.asm.Type[] typeArray12 = classInfo9.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("()Lorg/mockito/asm/Type;", type3, typeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '()Lorg/mockito/asm/Type;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.ClassVisitor classVisitor4 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter(classVisitor4);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter3.visitInnerClass("java.beans.PropertyDescriptor[name=hi!; constrained]", "L930922338", "(DZ)Lhi!;", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        label5.info = 3;
        label5.info = 130;
        java.lang.String str10 = label5.toString();
        java.lang.String str11 = label5.toString();
        int[] intArray18 = new int[] { 10, 155, ' ', 157, 153, 4 };
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.Object obj20 = label19.info;
        label19.info = 1.0d;
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        label23.info = 3;
        java.lang.String str26 = label23.toString();
        org.mockito.asm.Label[] labelArray27 = new org.mockito.asm.Label[] { label19, label23 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLookupSwitchInsn(label5, intArray18, labelArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L393825811" + "'", str10, "L393825811");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L393825811" + "'", str11, "L393825811");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 155, 32, 157, 153, 4]");
        org.junit.Assert.assertNull(obj20);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1476890157" + "'", str26, "L1476890157");
        org.junit.Assert.assertNotNull(labelArray27);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("double");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor14 = classEmitter5.visitMethod((int) ' ', "hi!", "C", "(DZ)Z", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5e99f5e4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        java.util.List list7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list8 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass3, list7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2a6da55c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.Class class0 = null;
        org.mockito.asm.Type type1 = org.mockito.asm.Type.CHAR_TYPE;
        int int3 = type1.getOpcode(10);
        java.lang.String str4 = type1.getClassName();
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("hi!");
        int int8 = type7.getSort();
        java.lang.String str9 = type7.getInternalName();
        org.mockito.cglib.core.Local local10 = new org.mockito.cglib.core.Local(0, type7);
        org.mockito.asm.Type type11 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type13.getOpcode(5);
        org.mockito.cglib.core.Local local16 = new org.mockito.cglib.core.Local((-1), type13);
        org.mockito.asm.Type type17 = local16.getType();
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type11, type17 };
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type7, typeArray18);
        java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray18);
        java.lang.Class[] classArray21 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray18);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((-1), type28);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type26, type28 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type35 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getObjectType("hi!");
        int int38 = type37.getSort();
        java.lang.Class<?> wildcardClass39 = type37.getClass();
        org.mockito.asm.Type type40 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass39);
        org.mockito.cglib.core.ClassInfo classInfo41 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean44 = classInfo41.equals((java.lang.Object) type43);
        int int45 = classInfo41.getModifiers();
        org.mockito.asm.Type type46 = classInfo41.getType();
        org.mockito.asm.Type type47 = type46.getElementType();
        org.mockito.asm.Type type49 = org.mockito.asm.Type.getObjectType("hi!");
        int int50 = type49.getSort();
        java.lang.Class<?> wildcardClass51 = type49.getClass();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass51);
        org.mockito.cglib.core.ClassInfo classInfo53 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass51);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean56 = classInfo53.equals((java.lang.Object) type55);
        java.lang.Object obj57 = null;
        boolean boolean58 = type55.equals(obj57);
        org.mockito.asm.Type type60 = org.mockito.asm.Type.getObjectType("hi!");
        int int61 = type60.getSort();
        java.lang.Class<?> wildcardClass62 = type60.getClass();
        org.mockito.asm.Type type63 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass62);
        org.mockito.cglib.core.ClassInfo classInfo64 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass62);
        org.mockito.asm.Type type66 = org.mockito.asm.Type.getObjectType("hi!");
        boolean boolean67 = classInfo64.equals((java.lang.Object) type66);
        int int68 = classInfo64.getModifiers();
        org.mockito.asm.Type type69 = classInfo64.getType();
        org.mockito.asm.Type type70 = type69.getElementType();
        org.mockito.asm.Type[] typeArray71 = new org.mockito.asm.Type[] { type34, type35, type47, type55, type70 };
        org.mockito.cglib.core.Signature signature72 = new org.mockito.cglib.core.Signature("", type23, typeArray71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = org.mockito.cglib.core.ReflectUtils.newInstance(class0, classArray21, (java.lang.Object[]) typeArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "char" + "'", str4, "char");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(IZ)Lhi!;" + "'", str19, "(IZ)Lhi!;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(IZ)C" + "'", str20, "(IZ)C");
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "(DZ)Z" + "'", str33, "(DZ)Z");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(classInfo41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(classInfo53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(classInfo64);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(typeArray71);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("L527178774", method1, method2);
        boolean boolean4 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        propertyDescriptor3.setHidden(false);
        java.lang.String str6 = propertyDescriptor3.getName();
        propertyDescriptor3.setConstrained(false);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass12);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass12);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, false);
        java.beans.PropertyEditor propertyEditor21 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptorArray17);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("hi!");
        int int24 = type23.getSort();
        java.lang.Class<?> wildcardClass25 = type23.getClass();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass25);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass25);
        boolean boolean28 = propertyDescriptor3.equals((java.lang.Object) propertyDescriptorArray27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNull(propertyEditor21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(propertyDescriptorArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findNewInstance(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(100, 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = 3;
        label0.info = 130;
        java.lang.String str5 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1599522326" + "'", str5, "L1599522326");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str7 = signature6.getDescriptor();
        java.lang.String str8 = signature6.getDescriptor();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.Class<?> wildcardClass12 = type10.getClass();
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass12);
        org.mockito.asm.Type[] typeArray14 = classInfo13.getInterfaces();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter15 = classEmitter1.begin_method(124, signature6, typeArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4ece4ec5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.Object obj8 = label7.info;
        label7.info = 1.0d;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.Object obj12 = label11.info;
        label11.info = 1.0d;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L1900097269", "L243601416hi!", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", label7, label11, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 7");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method1 = org.mockito.cglib.core.ReflectUtils.findMethod("L1217139539");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.Object obj6 = label5.info;
        java.lang.Class[] classArray7 = new java.lang.Class[] {};
        int int8 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray7);
        label5.info = classArray7;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLabel(label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getDescriptor();
        java.lang.String str4 = signature2.getName();
        java.lang.Class<?> wildcardClass5 = signature2.getClass();
        java.util.List list6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list7 = org.mockito.cglib.core.ReflectUtils.addAllInterfaces((java.lang.Class) wildcardClass5, list6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter2.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor1 = org.mockito.cglib.core.ReflectUtils.findConstructor("()Ljava/lang/Object;");
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.ClassNotFoundException-->");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
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
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(classInfo5);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
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
            int int14 = classEmitter10.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(156, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitLineNumber((-1), label6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visitSource("Z", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        java.lang.Class[] classArray9 = new java.lang.Class[] {};
        int int10 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray9);
        java.lang.String[] strArray11 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray9);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray17 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray18 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray16, methodArray17);
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor20 = classEmitter4.visitMethod((-1), "(DZ)Lhi!;", "", "", strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(DZ)Lhi!;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNotNull(classArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(methodArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
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
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray18 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray19 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray18);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("hi!");
        int int22 = type21.getSort();
        java.lang.Class<?> wildcardClass23 = type21.getClass();
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass23);
        org.mockito.cglib.core.ClassInfo classInfo26 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass23);
        java.lang.String str27 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass23);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, true, false);
        java.lang.reflect.Method[] methodArray32 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray17, methodArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor33 = classEmitter7.visitMethod(14, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", "", "char", strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@3f64cc3d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(methodArray18);
        org.junit.Assert.assertNotNull(methodArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classInfo24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertNotNull(classInfo26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str27, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertNotNull(methodArray32);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L243601416", "hi!");
        java.lang.String str3 = signature2.toString();
        java.lang.String str4 = signature2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L243601416hi!" + "'", str3, "L243601416hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L243601416hi!" + "'", str4, "L243601416hi!");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 10 };
        java.lang.ClassLoader classLoader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class class6 = org.mockito.cglib.core.ReflectUtils.defineClass("L1217139539", byteArray4, classLoader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, 10]");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitMaxs(124, 153);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor9 = localVariablesSorter5.visitParameterAnnotation((int) (short) 100, "L243601416", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method17 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = classEmitter3.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(124, "(IZ)Lhi!;", methodVisitor2);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter4 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter3);
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter(localVariablesSorter4);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter4.visitTypeInsn((int) (short) 1, "C");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter6.visitInnerClass("L107191322", "L243601416hi!", "org.mockito.asm.Type", 126);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
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
            classEmitter5.visitInnerClass("char", "(IZ)Lhi!;", "boolean", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = classEmitter1.getAccess();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo2);
        org.junit.Assert.assertNull(classInfo3);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        java.lang.Class<?> wildcardClass6 = classInfo4.getClass();
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass6);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass6);
        java.util.List list9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list10 = org.mockito.cglib.core.ReflectUtils.addAllMethods((java.lang.Class) wildcardClass6, list9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.asm.ClassVisitor classVisitor0 = null;
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter(classVisitor0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter1.getClassInfo();
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
        org.junit.Assert.assertNull(classInfo4);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Attribute attribute1 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
