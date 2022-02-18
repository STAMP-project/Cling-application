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
        int int0 = org.mockito.cglib.core.CodeEmitter.ADD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 96 + "'", int0 == 96);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.mockito.asm.Type.INT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type6, type8, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type2, typeArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type17 = type2.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = org.mockito.asm.Type.BOOLEAN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        int int0 = org.mockito.asm.Type.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.Class class0 = null;
        java.lang.Class[] classArray1 = new java.lang.Class[] { class0 };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray1);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = org.mockito.cglib.core.CodeEmitter.DIV;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 108 + "'", int0 == 108);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = org.mockito.cglib.core.CodeEmitter.GE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 156 + "'", int0 == 156);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = org.mockito.cglib.core.CodeEmitter.LT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 155 + "'", int0 == 155);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = org.mockito.asm.Type.ARRAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.mockito.asm.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = org.mockito.asm.Type.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = org.mockito.cglib.core.CodeEmitter.NEG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 116 + "'", int0 == 116);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = org.mockito.asm.Type.DOUBLE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = org.mockito.asm.Type.CHAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = org.mockito.cglib.core.CodeEmitter.NE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 154 + "'", int0 == 154);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = org.mockito.asm.Type.VOID;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("C", type1, typeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int0 = org.mockito.cglib.core.CodeEmitter.OR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) 2);
        boolean boolean6 = signature2.equals((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray7 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) -1, "hi!", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = org.mockito.cglib.core.CodeEmitter.EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 153 + "'", int0 == 153);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("short");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "short" + "'", str1, "short");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        int int0 = org.mockito.asm.Type.FLOAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("C");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("C");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(153);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray3 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.mockito.cglib.core.MethodInfo methodInfo0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.mockito.cglib.core.TypeUtils.isConstructor(methodInfo0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("C");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter0.begin_method(0, signature3, typeArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@f92e938");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature3);
        org.junit.Assert.assertNotNull(typeArray5);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int0 = org.mockito.cglib.core.CodeEmitter.USHR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 124 + "'", int0 == 124);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
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
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
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
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        java.lang.String[] strArray11 = new java.lang.String[] { "L1818164453", "L1818164453", "F", "L614449524", "Lorg/mockito/cglib/core/Signature;", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor12 = classEmitter0.visitMethod(9, "C", "L614449524", "Lorg/mockito/cglib/core/Signature;", strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@112548b8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
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
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(124);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(108);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
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
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature2.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L217518997");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        int int0 = org.mockito.cglib.core.CodeEmitter.XOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 130 + "'", int0 == 130);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int int0 = org.mockito.cglib.core.CodeEmitter.GT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 157 + "'", int0 == 157);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(110);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int int0 = org.mockito.cglib.core.CodeEmitter.AND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 126 + "'", int0 == 126);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit(110, (int) (short) 10, "hi!", "C", "Hi!", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit(155, 9, "org/mockito/asm/Type", "L1917506878", "hi!", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        int int0 = org.mockito.asm.Type.BYTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type7);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = type7.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int0 = org.mockito.cglib.core.CodeEmitter.REM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 112 + "'", int0 == 112);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getComponentType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type S is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type7, type9, type11, type13, type15, type17 };
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", type5, typeArray18);
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter37 = classEmitter0.begin_method(156, signature19, typeArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7da9708d");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
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
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter1 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@68357a61");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.Signature signature4 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean6 = signature4.equals((java.lang.Object) 2);
        boolean boolean8 = signature4.equals((java.lang.Object) 'a');
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.asm.Type type14 = null;
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter18 = classEmitter0.begin_method(154, signature4, typeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5a8d828b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str7 = type6.getClassName();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.asm.Type type15 = null;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type15);
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class((int) (short) -1, (int) (byte) 100, "L1917506878", type6, typeArray14, "(L;L;L;L;L;L;)L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(155);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int int0 = org.mockito.cglib.core.CodeEmitter.MUL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 104 + "'", int0 == 104);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type I is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type4 = local3.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = type4.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.String[] strArray0 = null;
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray0);
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("F");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "F" + "'", str1, "F");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = type1.getClassName();
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = type3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L;" + "'", str4, "L;");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Attribute attribute2 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("F");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "F" + "'", str1, "F");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1917506878");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getComponentType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type I is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 126);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        int int0 = org.mockito.cglib.core.CodeEmitter.LE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 158 + "'", int0 == 158);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray17 = new org.mockito.asm.Type[] { type14, type16 };
        org.mockito.asm.Type type18 = null;
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray17, type18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(L;L;)L;" + "'", str11, "(L;L;)L;");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray19);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7a747aa");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type7, type9 };
        org.mockito.asm.Type type11 = null;
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter0.visitField((int) (byte) -1, "L1013796710", "L1127284051", "org/mockito/asm/Type", (java.lang.Object) strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(96);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str1, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter1.visit((int) '#', 0, "org/mockito/cglib/core/Signature", "(L;L;)L;", "<init>", strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("short");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lshort; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(130);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("L1013796710");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = "L;";
        java.lang.String str4 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L721808723" + "'", str1, "L721808723");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L721808723" + "'", str4, "L721808723");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("<init>(LL69280469;)V");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        int int0 = org.mockito.asm.Type.OBJECT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("S");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "S" + "'", str1, "S");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L614449524");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.asm.Type type15 = null;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type17);
        int int20 = type17.getOpcode(108);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("F");
        org.mockito.cglib.core.Signature signature23 = new org.mockito.cglib.core.Signature("C", type17, typeArray22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.declare_field(126, "L2059103137", type17, (java.lang.Object) type25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 110 + "'", int20 == 110);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type25);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L857838397" + "'", str1, "L857838397");
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
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L857838397" + "'", str21, "L857838397");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter1.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4b43510b");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor16 = classEmitter0.visitMethod(14, "org/mockito/cglib/core/Signature", "L1127284051", "Lorg/mockito/cglib/core/Signature;", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@662428de");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType("F");
        java.lang.Object obj13 = null;
        boolean boolean14 = type12.equals(obj13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.asm.Type type22 = null;
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type22);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type24);
        java.lang.String str26 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class((int) (short) -1, 130, "L2059103137", type12, typeArray21, "L1127284051");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(L;L;)L;" + "'", str26, "(L;L;)L;");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L47335203");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L47335203" + "'", str1, "L47335203");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        java.lang.String[] strArray13 = new java.lang.String[] { "L614449524" };
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor15 = classEmitter7.visitMethod((int) (byte) 0, "Lorg/mockito/asm/Type;", "int", "<init>", strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1f56e0bd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Lshort;");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray18);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor26 = classEmitter1.visitMethod(153, "(L;L;)L;", "Hi!", "int", strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;L;)L;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.Class[] classArray0 = null;
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.junit.Assert.assertNull(typeArray1);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L762630614" + "'", str1, "L762630614");
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
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<init>$28Ljava$2Flang$2FLorg$2Fmockito$2Fasm$2FType$3B$3B$29V" + "'", str1, "<init>$28Ljava$2Flang$2FLorg$2Fmockito$2Fasm$2FType$3B$3B$29V");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray2 = signature1.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L47335203");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = type1.getDescriptor();
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L;" + "'", str3, "L;");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2d13a138");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("(L;L;)L;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "$28L$3BL$3B$29L$3B" + "'", str1, "$28L$3BL$3B$29L$3B");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean10 = type7.equals((java.lang.Object) "hi!");
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        java.lang.String str12 = type7.getInternalName();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("C");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.asm.Type type20 = null;
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray14, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class(96, (int) 'a', "L1013796710", type7, typeArray22, "(L;L;)L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
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
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getComponentType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Z is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Label label6 = new org.mockito.asm.Label();
        java.lang.String str7 = label6.toString();
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.asm.Type type20 = null;
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type20);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray19);
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        label6.info = typeArray19;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class(9, (int) (byte) -1, "L294510483", type5, typeArray19, "short");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L683808837" + "'", str7, "L683808837");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean4 = type1.equals((java.lang.Object) "hi!");
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type[] typeArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 100, type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type8 };
        org.mockito.asm.Type type10 = null;
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type3, typeArray9);
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type14 = type3.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        java.lang.String[] strArray8 = new java.lang.String[] { "L614449524" };
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor10 = classEmitter0.visitMethod(157, "short", "", "L1934937399", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4e01198a");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(typeArray9);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type16, type18 };
        org.mockito.asm.Type type20 = null;
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type20);
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray22);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit((int) (byte) 10, 108, "C", "org/mockito/cglib/core/Signature", "<init>$28Ljava$2Flang$2FLorg$2Fmockito$2Fasm$2FType$3B$3B$29V", strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray23);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1407451363");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        int int0 = org.mockito.cglib.core.CodeEmitter.SUB;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 100 + "'", int0 == 100);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type9, type11, type13, type15, type17, type19 };
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("", type7, typeArray20);
        boolean boolean23 = signature21.equals((java.lang.Object) (byte) 0);
        boolean boolean25 = signature21.equals((java.lang.Object) 100);
        java.lang.String str26 = signature21.getDescriptor();
        java.lang.String str27 = signature21.toString();
        java.lang.String str28 = signature21.getName();
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("L614449524");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter31 = classEmitter1.begin_method((int) ' ', signature21, typeArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@12b49c69");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(L;L;L;L;L;L;)L;" + "'", str26, "(L;L;L;L;L;L;)L;");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "(L;L;L;L;L;L;)L;" + "'", str27, "(L;L;L;L;L;L;)L;");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(typeArray30);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L1818164453");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1818164453" + "'", str1, "L1818164453");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L1759649715");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1759649715" + "'", str1, "L1759649715");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 100, "<init>", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1013796710");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("int");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L374025797");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1917506878");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.mockito.asm" + "'", str1, "org.mockito.asm");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str1, "Lorg/mockito/cglib/core/Signature;");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L2059103137");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("short");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        int int4 = type2.getDimensions();
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray13);
        org.mockito.asm.Type type15 = null;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature17 = new org.mockito.cglib.core.Signature("L1127284051", type2, typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray16);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
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
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray25);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor33 = classEmitter0.visitMethod(1, "", "S", "<init>(Ljava/lang/Hi!;)V", strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@2e2252e4");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
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
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 154);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray26 = new org.mockito.asm.Type[] { type15, type17, type19, type21, type23, type25 };
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type13, typeArray26);
        boolean boolean29 = signature27.equals((java.lang.Object) (byte) 0);
        boolean boolean31 = signature27.equals((java.lang.Object) 100);
        java.lang.String str32 = signature27.getDescriptor();
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("C");
        int int35 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter36 = classEmitter7.begin_method(14, signature27, typeArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@28ceed38");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(L;L;L;L;L;L;)L;" + "'", str32, "(L;L;L;L;L;L;)L;");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(116);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L69280469");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = 1L;
        label0.info = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1892469093" + "'", str1, "L1892469093");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(156, "L1127284051", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.asm.Attribute attribute10 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(104);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) '4', "<init>(Ljava/lang/Hi!;)V", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L296646621");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L296646621" + "'", str1, "L296646621");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(112);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type4 = local3.getType();
        java.lang.String str5 = type4.getClassName();
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
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
        java.lang.String str17 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1323747719" + "'", str1, "L1323747719");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str15, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1323747719" + "'", str17, "L1323747719");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter19 = classEmitter8.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@ac8bd87");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.asm.Type type30 = null;
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type35 };
        org.mockito.asm.Type type37 = null;
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type37);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray36);
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visit(8, (int) (byte) 100, "(L;L;L;L;L;L;)L;", "L;", "$28L$3BL$3B$29L$3B", strArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L157443474");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
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
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Attribute attribute7 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter4.visitAttribute(attribute7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
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
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(126);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("D");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(112);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1081692398");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type37, type39 };
        org.mockito.asm.Type type41 = null;
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type43);
        java.lang.String str45 = org.mockito.asm.Type.getMethodDescriptor(type35, typeArray40);
        java.lang.Class<?> wildcardClass46 = type35.getClass();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor48 = classEmitter8.visitField(4, "L2059103137", "L1081692398", "org.mockito.asm.Type", (java.lang.Object) type47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "(L;L;)L;" + "'", str45, "(L;L;)L;");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(type47);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getComponentType(type35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(110);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L240234221");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L240234221" + "'", str1, "L240234221");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo1 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        java.lang.String[] strArray14 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray11);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit(124, 100, "hi!", "L69280469", "(L;L;)S", strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("<init>");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<init>" + "'", str1, "<init>");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getObjectType("<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type17, type19 };
        org.mockito.asm.Type type21 = null;
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.asm.Type type28 = null;
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        org.mockito.asm.Type type30 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray27);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.begin_class((int) (byte) 0, (-1), "L1818164453", type15, typeArray20, "(L;L;L;L;L;L;)L;");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L296646621");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray4 = new org.mockito.asm.Type[] { type1, type3 };
        org.mockito.asm.Type type5 = null;
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = type7.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("(L;L;)S");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1410472451");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = type3.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C" + "'", str2, "C");
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type17, type19 };
        org.mockito.asm.Type type21 = null;
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visit(0, 5, "<init>(Ljava/lang/(L;L;L;L;L;L;;)V", "F", "L1410472451", strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.asm.Attribute attribute20 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitAttribute(attribute20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean4 = type1.equals((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int5 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("", "hi!");
        boolean boolean4 = signature2.equals((java.lang.Object) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = signature2.getReturnType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 112);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L24797399");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L24797399" + "'", str1, "L24797399");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L614449524");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(108, "L1081692398", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST(0.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        boolean boolean8 = type2.equals((java.lang.Object) type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "C" + "'", str6, "C");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo19 = classEmitter8.getClassInfo();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.LONG_TYPE;
        int int25 = type23.getOpcode(100);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray30 = new org.mockito.asm.Type[] { type27, type29 };
        org.mockito.asm.Type type31 = null;
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type31);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.begin_class(5, 11, "int", type23, typeArray30, "L69280469");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo19);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 101 + "'", int25 == 101);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L1818164453");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1818164453" + "'", str1, "L1818164453");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1756082006" + "'", str1, "L1756082006");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str15, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(1, "L602401257", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(116);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type6, type8, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type2, typeArray15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = type2.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST(100.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
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
        java.lang.String[] strArray15 = new java.lang.String[] { "L69280469" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("C");
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.asm.Type type25 = null;
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type31, type33 };
        org.mockito.asm.Type type35 = null;
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray29, typeArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter39 = classEmitter0.begin_method(116, signature17, typeArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@81c45a3");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
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
        org.mockito.asm.Attribute attribute21 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter18.visitAttribute(attribute21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter7.getClassInfo();
        org.mockito.asm.Attribute attribute11 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1759649715");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        java.lang.String str2 = label1.toString();
        label1.info = "L;";
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        label1.info = type6;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.fromInternalName("Lorg/mockito/cglib/core/Signature;");
        boolean boolean11 = type6.equals((java.lang.Object) "Lorg/mockito/cglib/core/Signature;");
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("C");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray20);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("<init>(Ljava/lang/(L;L;L;L;L;L;;)V", type6, typeArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '<init>(Ljava/lang/(L;L;L;L;L;L;;)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1594685708" + "'", str2, "L1594685708");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("(L;L;L;L;L;L;)L;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.String str2 = type1.getInternalName();
        int int3 = type1.getSize();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.Signature signature13 = new org.mockito.cglib.core.Signature("short", "L;");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter31 = classEmitter0.begin_method(1, signature13, typeArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@72b88b26");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
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
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = type1.getInternalName();
        int int5 = type1.getOpcode(104);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 108 + "'", int5 == 108);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Org/mockito/asm/Type" + "'", str1, "Org/mockito/asm/Type");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(0, "L1845084035", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(155);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor17 = classEmitter0.visitField(10, "(Ljava/lang/Lorg/mockito/asm/Type;;)V", "int", "L1759649715", (java.lang.Object) "Org/mockito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type6, type8, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type2, typeArray15);
        int int17 = type2.getSort();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = type2.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type21);
        java.lang.String str23 = type21.getDescriptor();
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type26, type28 };
        org.mockito.asm.Type type30 = null;
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type30);
        org.mockito.asm.Type type32 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type32);
        int int35 = type32.getOpcode(108);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("F");
        org.mockito.cglib.core.Signature signature38 = new org.mockito.cglib.core.Signature("C", type32, typeArray37);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class((-1), (int) (short) 100, "org.mockito.asm.Type", type21, typeArray37, "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "F" + "'", str23, "F");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 110 + "'", int35 == 110);
        org.junit.Assert.assertNotNull(typeArray37);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1133572395");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type13, type15 };
        org.mockito.asm.Type type17 = null;
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray16, type17);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor22 = classEmitter7.visitMethod((int) (byte) 1, "<init>$28Ljava$2Flang$2FLorg$2Fmockito$2Fasm$2FType$3B$3B$29V", "L1759649715", "(L;L;)S", strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7a9ccfaa");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L721082287");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L721082287" + "'", str1, "L721082287");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = 1L;
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        java.lang.Object obj6 = null;
        label0.info = obj6;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1263491156" + "'", str1, "L1263491156");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1L + "'", obj4, 1L);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1L + "'", obj5, 1L);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(116);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type35, type37 };
        org.mockito.asm.Type type39 = null;
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray38, type39);
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor42 = classEmitter8.visitMethod(0, "(L;L;)L;", "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V", "L69280469", strArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;L;)L;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo27);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java.lang.Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.Hi!" + "'", str1, "Java.lang.Hi!");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type6, type8, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type2, typeArray15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(type18);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
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
        java.lang.String str17 = label0.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        label0.info = type19;
        java.lang.Object obj23 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L419589103" + "'", str1, "L419589103");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str15, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L419589103" + "'", str17, "L419589103");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "C" + "'", str20, "C");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "LC;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "LC;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "LC;");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("short");
        int int2 = type1.getDimensions();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lshort; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("C");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(124);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str4 = type1.getInternalName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.Hi!" + "'", str3, "java.lang.Hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java/lang/Hi!" + "'", str4, "java/lang/Hi!");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter17 = classEmitter15.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@69ea0983");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(124);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L1934937399");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L602401257");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = "L;";
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        label0.info = type5;
        java.lang.Object obj8 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L225056966" + "'", str1, "L225056966");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "L;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "L;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "L;");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getObjectType("short");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        int int6 = type4.getDimensions();
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type11, type13 };
        org.mockito.asm.Type type15 = null;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type17);
        java.lang.String str19 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("(L;L;)Lorg/mockito/asm/Type;", type4, typeArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(L;L;)Lorg/mockito/asm/Type;' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(L;L;)L;" + "'", str19, "(L;L;)L;");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("org.mockito.asm");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("L1759649715", "(Ljava/lang/Hi!;)V");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.asm.Type type28 = null;
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        java.lang.String str35 = type33.getInternalName();
        int int37 = type33.getOpcode(104);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type33);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter39 = classEmitter8.begin_method((int) '4', signature22, typeArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@69fa7f09");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 108 + "'", int37 == 108);
        org.junit.Assert.assertNotNull(typeArray38);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getObjectType("short");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        int int4 = type2.getDimensions();
        int int5 = type2.getDimensions();
        int int7 = type2.getOpcode((int) (byte) 1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type18, type20 };
        org.mockito.asm.Type type22 = null;
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray16, typeArray21);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("(Ljava/lang/Hi!;)V", type2, typeArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Name '(Ljava/lang/Hi!;)V' is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1407451363");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(108);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = type1.getClassName();
        java.lang.String str3 = type1.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L;" + "'", str3, "L;");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(155);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int4 = type1.getSort();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("org.mockito.asm.Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.asm.Type type28 = null;
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] { type31, type33 };
        org.mockito.asm.Type type35 = null;
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type35);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray34);
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray34);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor41 = classEmitter8.visitMethod((int) (byte) 10, "L1410472451", "L24797399", "F", strArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@57e33dfd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(112);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
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
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        label0.info = classEmitter21;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter21.end_class();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L347330640" + "'", str1, "L347330640");
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
        org.junit.Assert.assertNull(classInfo29);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter0.getClassInfo();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@5491f3a5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type0);
        java.lang.String str2 = type1.getClassName();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "short" + "'", str2, "short");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(130);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
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
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lshort;");
        org.mockito.asm.Type[] typeArray30 = org.mockito.asm.Type.getArgumentTypes("(L;L;)L;");
        org.mockito.asm.Type type31 = null;
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter33 = classEmitter18.begin_method((int) (byte) 10, signature28, typeArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4c8df773");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
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
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local22 = new org.mockito.cglib.core.Local((int) (short) 100, type21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.asm.Type type28 = null;
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        org.mockito.cglib.core.Signature signature30 = new org.mockito.cglib.core.Signature("", type21, typeArray27);
        java.lang.String str31 = signature30.getName();
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type33, type35 };
        org.mockito.asm.Type type37 = null;
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter41 = classEmitter15.begin_method((int) (short) 100, signature30, typeArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7b2e01e9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(96);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
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
        org.mockito.cglib.core.Signature signature26 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str27 = signature26.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter29);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter31.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter32);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter37 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter37);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter40 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter39.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        classEmitter36.setTarget((org.mockito.asm.ClassVisitor) classEmitter40);
        org.mockito.cglib.core.ClassEmitter classEmitter43 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter28.setTarget((org.mockito.asm.ClassVisitor) classEmitter43);
        boolean boolean45 = signature26.equals((java.lang.Object) classEmitter43);
        boolean boolean46 = signature20.equals((java.lang.Object) classEmitter43);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type50, type52 };
        org.mockito.asm.Type type54 = null;
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type54);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type56);
        java.lang.String str58 = org.mockito.asm.Type.getMethodDescriptor(type48, typeArray53);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type60, type62 };
        org.mockito.asm.Type type64 = null;
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type64);
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray70 = new org.mockito.asm.Type[] { type67, type69 };
        org.mockito.asm.Type type71 = null;
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray70, type71);
        org.mockito.asm.Type type73 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray70, type73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray63, typeArray70);
        org.mockito.asm.Type[] typeArray76 = org.mockito.cglib.core.TypeUtils.add(typeArray53, typeArray63);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter77 = classEmitter0.begin_method(157, signature20, typeArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@b95122f");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(signature26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "<init>" + "'", str27, "<init>");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(L;L;)L;" + "'", str58, "(L;L;)L;");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(typeArray76);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L64466569");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter13 = classEmitter0.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@1f462ac9");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L217518997");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.Object obj2 = null;
        boolean boolean3 = signature1.equals(obj2);
        java.lang.String str4 = signature1.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray5 = signature1.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<init>" + "'", str4, "<init>");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
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
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo34 = classEmitter33.getClassInfo();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        java.lang.String[] strArray42 = new java.lang.String[] { "L614449524" };
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray42);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor44 = classEmitter22.visitMethod(4, "L1081692398", "Lshort;", "LC;", strArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7292e379");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNull(classInfo34);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray43);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str1 = type0.toString();
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "C" + "'", str1, "C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "char" + "'", str2, "char");
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Lorg/mockito/asm/Type;");
        int int3 = type1.getOpcode((int) (short) 100);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104 + "'", int3 == 104);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("L1081692398", "L1107949503");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("<init>$28Ljava$2Flang$2FLorg$2Fmockito$2Fasm$2FType$3B$3B$29V", "<init>(Ljava/lang/Hi!;)V");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray15 = new org.mockito.asm.Type[] { type4, type6, type8, type10, type12, type14 };
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("", type2, typeArray15);
        boolean boolean18 = signature16.equals((java.lang.Object) (byte) 0);
        boolean boolean20 = signature16.equals((java.lang.Object) 100);
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str23 = signature22.getName();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter33 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter33);
        org.mockito.cglib.core.ClassEmitter classEmitter35 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter35.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        classEmitter32.setTarget((org.mockito.asm.ClassVisitor) classEmitter36);
        org.mockito.cglib.core.ClassEmitter classEmitter39 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter32);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter39);
        boolean boolean41 = signature22.equals((java.lang.Object) classEmitter39);
        boolean boolean42 = signature16.equals((java.lang.Object) classEmitter39);
        org.mockito.asm.Type type47 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local48 = new org.mockito.cglib.core.Local((int) (short) 100, type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type50, type52 };
        org.mockito.asm.Type type54 = null;
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type54);
        org.mockito.cglib.core.Signature signature56 = new org.mockito.cglib.core.Signature("", type47, typeArray53);
        java.lang.String str57 = signature56.toString();
        java.lang.String str58 = signature56.getDescriptor();
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type60, type62 };
        org.mockito.asm.Type type64 = null;
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type64);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter66 = classEmitter39.begin_method(96, signature56, typeArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@4c7e6bdd");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "<init>" + "'", str23, "<init>");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(L;L;)L;" + "'", str57, "(L;L;)L;");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(L;L;)L;" + "'", str58, "(L;L;)L;");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(typeArray65);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lorg/mockito/asm/Type;");
        java.lang.String str2 = signature1.getName();
        java.lang.String str3 = signature1.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray4 = signature1.getArgumentTypes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(Ljava/lang/Lorg/mockito/asm/Type;;)V" + "'", str3, "(Ljava/lang/Lorg/mockito/asm/Type;;)V");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type5);
        boolean boolean8 = type2.equals((java.lang.Object) type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "C" + "'", str6, "C");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L64466569");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L24797399");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
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
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray40 = new org.mockito.asm.Type[] { type29, type31, type33, type35, type37, type39 };
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type27, typeArray40);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type46, type48, type50, type52, type54, type56 };
        org.mockito.cglib.core.Signature signature58 = new org.mockito.cglib.core.Signature("", type44, typeArray57);
        boolean boolean59 = org.mockito.cglib.core.TypeUtils.isPrimitive(type44);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type44);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type60);
        java.lang.String[] strArray62 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray40);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor63 = classEmitter18.visitMethod((int) (short) -1, "L1863556899", "L1201611683", "", strArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@540623f5");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(strArray62);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type38, type40 };
        org.mockito.asm.Type type42 = null;
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter27.visit((int) (short) 10, 0, "L1407451363", "L1863556899", "<init>(LL69280469;)V", strArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L1133572395");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1133572395" + "'", str1, "L1133572395");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray6 = new org.mockito.asm.Type[] { type3, type5 };
        org.mockito.asm.Type type7 = null;
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        java.lang.String str11 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray6);
        int int12 = type1.getSort();
        int int13 = type1.getSort();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(L;L;)L;" + "'", str11, "(L;L;)L;");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("(LL69280469;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(104);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("L1917506878");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 100, type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type8 };
        org.mockito.asm.Type type10 = null;
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type3, typeArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("short");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L1127284051");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
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
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.Signature signature16 = new org.mockito.cglib.core.Signature("org.mockito.asm.Type", "<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V");
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type20, type22 };
        org.mockito.asm.Type type24 = null;
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray25);
        org.mockito.asm.Type type27 = null;
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        org.mockito.asm.Type type31 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local32 = new org.mockito.cglib.core.Local((int) (short) 100, type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type31);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter34 = classEmitter8.begin_method(5, signature16, typeArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@7c298c1e");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNull(classInfo12);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(typeArray33);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V" + "'", str1, "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local((int) (short) 100, type2);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        java.lang.String str7 = type5.getClassName();
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = type5.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(130);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(157);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.mockito.asm.Type[] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("L1793154212");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
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
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        label0.info = classEmitter21;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor34 = classEmitter21.visitAnnotation("org.mockito.asm", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1299739859" + "'", str1, "L1299739859");
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
        org.junit.Assert.assertNull(classInfo29);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter0.getClassInfo();
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type16, type18, type20, type22, type24, type26 };
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("", type14, typeArray27);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray44 = new org.mockito.asm.Type[] { type33, type35, type37, type39, type41, type43 };
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type31, typeArray44);
        boolean boolean46 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type31);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type47);
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray48);
        java.lang.String[] strArray52 = new java.lang.String[] { "L614449524" };
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter54 = classEmitter0.begin_method(124, signature50, typeArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@40505032");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo8);
        org.junit.Assert.assertNull(classInfo10);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(signature50);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(typeArray53);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
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
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter18 = classEmitter15.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@74fa2f66");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter(14, "L69280469", methodVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type24, type26 };
        org.mockito.asm.Type type28 = null;
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type28);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor33 = classEmitter7.visitMethod((int) (short) 100, "L1793154212", "L69280469", "L296646621", strArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@57326374");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(124);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((int) (short) 100, type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type6, type8 };
        org.mockito.asm.Type type10 = null;
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type10);
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("", type3, typeArray9);
        boolean boolean13 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        java.lang.String str18 = type16.getInternalName();
        java.lang.String str19 = type16.toString();
        org.mockito.cglib.core.Local local20 = new org.mockito.cglib.core.Local(157, type16);
        boolean boolean21 = type3.equals((java.lang.Object) 157);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type22 = type3.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L;" + "'", str19, "L;");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
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
        java.lang.String[] strArray26 = new java.lang.String[] { "L69280469" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor29 = classEmitter18.visitField(9, "(Ljava/lang/Hi!;)V", "L69280469", "(LL69280469;)V", (java.lang.Object) typeArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(96);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1917506878");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L1407451363");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(L;L;)Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(130);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(128);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter22.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter23);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo27 = classEmitter26.getClassInfo();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter26);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        org.mockito.asm.Attribute attribute30 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter8.visitAttribute(attribute30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo27);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("LC;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LC$3B" + "'", str1, "LC$3B");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1934937399");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        label5.info = 1L;
        java.lang.Object obj9 = label5.info;
        java.lang.Object obj10 = label5.info;
        java.lang.String str11 = label5.toString();
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getType("org/mockito/asm/Type");
        label5.info = "org/mockito/asm/Type";
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) '4', label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1974391573" + "'", str6, "L1974391573");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1974391573" + "'", str11, "L1974391573");
        org.junit.Assert.assertNotNull(type13);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor4 = localVariablesSorter3.visitAnnotationDefault();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
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
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter18);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type34 };
        org.mockito.asm.Type type36 = null;
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type36);
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.MethodVisitor methodVisitor40 = classEmitter18.visitMethod((int) 'a', "LC$3B", "<init>(Lshort;L;SL;L;)V", "<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V", strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@595fc71c");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>" + "'", str2, "<init>");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(classInfo24);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(typeArray39);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        label5.info = 1L;
        java.lang.Object obj9 = label5.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn((int) (byte) 10, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L925087729" + "'", str6, "L925087729");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitEnd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        label4.info = "L;";
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        java.lang.Class<?> wildcardClass18 = type15.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        label4.info = str19;
        java.lang.String str21 = label4.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        label4.info = type23;
        java.lang.Object obj27 = label4.info;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1537234979" + "'", str5, "L1537234979");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str19, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1537234979" + "'", str21, "L1537234979");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "C" + "'", str24, "C");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "LC;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "LC;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "LC;");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.INT_TYPE;
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.getPackageName(type35);
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass40 = signature39.getClass();
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type45, type47 };
        org.mockito.asm.Type type49 = null;
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray48, type49);
        org.mockito.asm.Type type51 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray48, type51);
        java.lang.String str53 = org.mockito.asm.Type.getMethodDescriptor(type43, typeArray48);
        java.lang.Class<?> wildcardClass54 = type43.getClass();
        java.lang.String str55 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass54);
        java.lang.Class[] classArray56 = new java.lang.Class[] { wildcardClass40, wildcardClass54 };
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.getTypes(classArray56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.getTypes(classArray56);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter27.declare_field(124, "Lorg/mockito/cglib/core/Signature;", type35, (java.lang.Object) classArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str41, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "(L;L;)L;" + "'", str53, "(L;L;)L;");
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str55, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray58);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("L1781555696");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        label4.info = "L;";
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        java.lang.Class<?> wildcardClass18 = type15.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        label4.info = str19;
        java.lang.Object obj21 = label4.info;
        int[] intArray26 = new int[] { 11, 110, 2, (byte) 100 };
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.String str28 = label27.toString();
        label27.info = 1L;
        java.lang.Object obj31 = label27.info;
        java.lang.Object obj32 = label27.info;
        java.lang.String str33 = label27.toString();
        java.lang.String str34 = label27.toString();
        org.mockito.asm.Label[] labelArray35 = new org.mockito.asm.Label[] { label27 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray26, labelArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L579982923" + "'", str5, "L579982923");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str19, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "Lorg/mockito/asm/Type;" + "'", obj21, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[11, 110, 2, 100]");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1748320681" + "'", str28, "L1748320681");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1L + "'", obj31, 1L);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1L + "'", obj32, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1748320681" + "'", str33, "L1748320681");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1748320681" + "'", str34, "L1748320681");
        org.junit.Assert.assertNotNull(labelArray35);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
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
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor("Lshort;");
        java.lang.String str15 = signature14.toString();
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.fromInternalName("L217518997");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type17);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type18);
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = signature22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        java.lang.String str26 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray33 = new org.mockito.asm.Type[] { type30, type32 };
        org.mockito.asm.Type type34 = null;
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type34);
        org.mockito.asm.Type type36 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type36);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type28, typeArray33);
        java.lang.Class<?> wildcardClass39 = type28.getClass();
        org.mockito.cglib.core.Signature signature42 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass43 = signature42.getClass();
        java.lang.String str44 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass43);
        java.lang.String str45 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass43);
        java.lang.Class[] classArray46 = new java.lang.Class[] { wildcardClass23, wildcardClass39, wildcardClass43 };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray48, type49);
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray48);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local57 = new org.mockito.cglib.core.Local((int) (short) 100, type56);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray62 = new org.mockito.asm.Type[] { type59, type61 };
        org.mockito.asm.Type type63 = null;
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray62, type63);
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("", type56, typeArray62);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.parseTypes("L1818164453");
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray62, typeArray67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray48, typeArray62);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter70 = classEmitter1.begin_method((int) (short) 100, signature14, typeArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@35b6d2b2");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<init>(Ljava/lang/Lshort;;)V" + "'", str15, "<init>(Ljava/lang/Lshort;;)V");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str24, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str25, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str26, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(L;L;)L;" + "'", str38, "(L;L;)L;");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str44, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str45, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;" + "'", str52, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;");
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 126);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = "L;";
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.Object obj7 = label0.info;
        java.lang.String str8 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L278856086" + "'", str1, "L278856086");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L278856086" + "'", str4, "L278856086");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L278856086" + "'", str5, "L278856086");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "L;" + "'", obj6, "L;");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "L;" + "'", obj7, "L;");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L278856086" + "'", str8, "L278856086");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        label5.info = "L;";
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.asm.Type type14 = null;
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type16);
        java.lang.Class<?> wildcardClass19 = type16.getClass();
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass19);
        label5.info = str20;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(0, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L663547396" + "'", str6, "L663547396");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str20, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type8, type10, type12, type14, type16, type18 };
        org.mockito.cglib.core.Signature signature20 = new org.mockito.cglib.core.Signature("", type6, typeArray19);
        java.lang.String str21 = type6.getDescriptor();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L;" + "'", str21, "L;");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitIincInsn(14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("(L;L;)L;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "(L;L;)L;" + "'", str1, "(L;L;)L;");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("L1407451363");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1407451363" + "'", str1, "L1407451363");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("L294510483");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray11 = new org.mockito.asm.Type[] { type8, type10 };
        org.mockito.asm.Type type12 = null;
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray11, type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type15, type17 };
        org.mockito.asm.Type type19 = null;
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type19);
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray18, type21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray11, typeArray18);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        label5.info = typeArray18;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(1, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1519623065" + "'", str6, "L1519623065");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.mockito.asm.MethodVisitor methodVisitor4 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter5 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter6 = new org.mockito.cglib.core.LocalVariablesSorter(3, "(Ljava/lang/Lorg/mockito/asm/Type;;)V", methodVisitor4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.INT_TYPE;
        int int11 = type10.getSize();
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        int int14 = type10.getOpcode((int) (short) 1);
        org.mockito.asm.Type[] typeArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.begin_class(126, 8, "L1113412744", type10, typeArray15, "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "int" + "'", str12, "int");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
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
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor7 = localVariablesSorter3.visitParameterAnnotation(101, "L69280469", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        label4.info = "L;";
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        java.lang.Class<?> wildcardClass18 = type15.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        label4.info = str19;
        java.lang.String str21 = label4.toString();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type23);
        label4.info = type23;
        int[] intArray27 = new int[] {};
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        java.lang.String str29 = label28.toString();
        label28.info = 1L;
        java.lang.Object obj32 = label28.info;
        java.lang.Object obj33 = label28.info;
        java.lang.String str34 = label28.toString();
        java.lang.String str35 = label28.toString();
        org.mockito.asm.Label label36 = new org.mockito.asm.Label();
        java.lang.String str37 = label36.toString();
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] { type39, type41 };
        org.mockito.asm.Type type43 = null;
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type46, type48 };
        org.mockito.asm.Type type50 = null;
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type50);
        org.mockito.asm.Type type52 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray49, type52);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray42, typeArray49);
        java.lang.String[] strArray55 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        label36.info = typeArray49;
        java.lang.String str57 = label36.toString();
        org.mockito.asm.Label[] labelArray58 = new org.mockito.asm.Label[] { label28, label36 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray27, labelArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L127312474" + "'", str5, "L127312474");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str19, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L127312474" + "'", str21, "L127312474");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "C" + "'", str24, "C");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L782691951" + "'", str29, "L782691951");
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1L + "'", obj32, 1L);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1L + "'", obj33, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L782691951" + "'", str34, "L782691951");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L782691951" + "'", str35, "L782691951");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L156547075" + "'", str37, "L156547075");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(strArray55);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "L156547075" + "'", str57, "L156547075");
        org.junit.Assert.assertNotNull(labelArray58);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        label5.info = 1L;
        java.lang.Object obj9 = label5.info;
        java.lang.Object obj10 = label5.info;
        java.lang.String str11 = label5.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitJumpInsn(6, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L32608384" + "'", str6, "L32608384");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 1L + "'", obj10, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L32608384" + "'", str11, "L32608384");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("shortL;", true);
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
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn((int) '#', 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("float", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass3 = signature2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.lang.String str6 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type10, type12 };
        org.mockito.asm.Type type14 = null;
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray13, type16);
        java.lang.String str18 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray13);
        java.lang.Class<?> wildcardClass19 = type8.getClass();
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = signature22.getClass();
        java.lang.String str24 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        java.lang.Class[] classArray26 = new java.lang.Class[] { wildcardClass3, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray26);
        org.mockito.asm.Type type29 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = type29.getInternalName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str4, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str5, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str6, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(L;L;)L;" + "'", str18, "(L;L;)L;");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str24, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str25, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(classArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = 1L;
        java.lang.Object obj4 = label0.info;
        java.lang.Object obj5 = label0.info;
        java.lang.Object obj6 = null;
        label0.info = obj6;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        java.lang.String str12 = type10.getInternalName();
        int int14 = type10.getOpcode(104);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getReturnType("(L;L;)L;");
        org.mockito.cglib.core.Local local19 = new org.mockito.cglib.core.Local((int) (short) 100, type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.asm.Type type25 = null;
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("", type18, typeArray24);
        org.mockito.cglib.core.Signature signature28 = new org.mockito.cglib.core.Signature("L1201611683", type10, typeArray24);
        label0.info = type10;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = type10.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1478079482" + "'", str1, "L1478079482");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 1L + "'", obj4, 1L);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1L + "'", obj5, 1L);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 108 + "'", int14 == 108);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("L1362657685");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST(10.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        label7.info = 1L;
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        java.lang.Object obj13 = null;
        label7.info = obj13;
        java.lang.String str15 = label7.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        label16.info = "L;";
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type21, type23 };
        org.mockito.asm.Type type25 = null;
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type25);
        org.mockito.asm.Type type27 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type27);
        int int29 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        java.lang.Class<?> wildcardClass30 = type27.getClass();
        java.lang.String str31 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass30);
        label16.info = str31;
        java.lang.String str33 = label16.toString();
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type35);
        label16.info = type35;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("LC$3B", "L217518997", "C", label7, label16, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 15");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L872359549" + "'", str8, "L872359549");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L872359549" + "'", str15, "L872359549");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1892346716" + "'", str17, "L1892346716");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str31, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1892346716" + "'", str33, "L1892346716");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "C" + "'", str36, "C");
        org.junit.Assert.assertNotNull(type37);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
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
        org.mockito.asm.Attribute attribute13 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter0.visitAttribute(attribute13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo9);
        org.junit.Assert.assertNull(classInfo11);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        label5.info = "L;";
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        label5.info = type10;
        org.mockito.asm.Type type14 = org.mockito.asm.Type.getObjectType("short");
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type14);
        label5.info = boolean15;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber(14, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1589742166" + "'", str6, "L1589742166");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        label4.info = "L;";
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        java.lang.Class<?> wildcardClass18 = type15.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        label4.info = str19;
        java.lang.String str21 = label4.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.String str23 = label22.toString();
        label22.info = 1L;
        java.lang.Object obj26 = label22.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.String str28 = label27.toString();
        label27.info = 1L;
        java.lang.Object obj31 = label27.info;
        java.lang.Object obj32 = label27.info;
        label22.info = obj32;
        label4.info = obj32;
        org.mockito.asm.Label label35 = new org.mockito.asm.Label();
        java.lang.String str36 = label35.toString();
        org.mockito.asm.Label label37 = new org.mockito.asm.Label();
        java.lang.String str38 = label37.toString();
        label37.info = 1L;
        java.lang.Object obj41 = label37.info;
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass45 = signature44.getClass();
        label37.info = wildcardClass45;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label35, label37, "L1070021836");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L2066438305" + "'", str5, "L2066438305");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str19, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L2066438305" + "'", str21, "L2066438305");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L540192667" + "'", str23, "L540192667");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L975413468" + "'", str28, "L975413468");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1L + "'", obj31, 1L);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1L + "'", obj32, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1752955161" + "'", str36, "L1752955161");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "L1236556519" + "'", str38, "L1236556519");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 1L + "'", obj41, 1L);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(3, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = type1.getElementType();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(128);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(Ljava/lang/Lorg/mockito/asm/Type;;)V");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LLjava/lang/Lorg/mockito/asm/Type; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = type1.getDimensions();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C" + "'", str2, "C");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("C");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter6.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        org.mockito.cglib.core.ClassEmitter classEmitter10 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        boolean boolean11 = type1.equals((java.lang.Object) classEmitter10);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter10);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.FieldVisitor fieldVisitor18 = classEmitter10.visitField(6, "double", "L2059103137", "org.mockito.cglib.core.Signature", (java.lang.Object) "[Lorg/mockito/asm/Type;");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "C" + "'", str2, "C");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        label7.info = 1L;
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        java.lang.String str13 = label7.toString();
        java.lang.String str14 = label7.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        label15.info = type18;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L1201611683", "<init>(Ljava.lang.Hi!", "L602401257", label7, label15, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L747869586" + "'", str8, "L747869586");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L747869586" + "'", str13, "L747869586");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L747869586" + "'", str14, "L747869586");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1657627003" + "'", str16, "L1657627003");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
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
        org.mockito.cglib.core.ClassInfo classInfo17 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter18 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.CodeEmitter codeEmitter19 = classEmitter18.begin_static();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: classInfo is null! org.mockito.cglib.core.ClassEmitter@137bd173");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo17);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25, type27 };
        org.mockito.asm.Type type29 = null;
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray28, type29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray35 = new org.mockito.asm.Type[] { type32, type34 };
        org.mockito.asm.Type type36 = null;
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type36);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray35);
        java.lang.String[] strArray41 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visit(6, 158, "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V", "L157443474", "<init>(Ljava/lang/Hi!;)V", strArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
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
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo16 = classEmitter15.getClassInfo();
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter15);
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter19.setTarget((org.mockito.asm.ClassVisitor) classEmitter20);
        org.mockito.cglib.core.ClassInfo classInfo22 = classEmitter20.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter26 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter26.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter8.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter32 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getBoxedType(type37);
        java.lang.String str39 = type37.getDescriptor();
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isPrimitive(type37);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray45 = new org.mockito.asm.Type[] { type42, type44 };
        org.mockito.asm.Type type46 = null;
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray52 = new org.mockito.asm.Type[] { type49, type51 };
        org.mockito.asm.Type type53 = null;
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray52, type53);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray52, type55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray45, typeArray52);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter27.begin_class((int) '#', 4, "org/mockito/cglib/core/Signature", type37, typeArray52, "L240234221");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo16);
        org.junit.Assert.assertNull(classInfo22);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "L;" + "'", str39, "L;");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray57);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray1 = org.mockito.asm.Type.getArgumentTypes("java.lang.Hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        label4.info = 1L;
        java.lang.Object obj8 = label4.info;
        java.lang.Object obj9 = label4.info;
        java.lang.String str10 = label4.toString();
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("org/mockito/asm/Type");
        label4.info = "org/mockito/asm/Type";
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLabel(label4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1351890626" + "'", str5, "L1351890626");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 1L + "'", obj8, 1L);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 1L + "'", obj9, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1351890626" + "'", str10, "L1351890626");
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("F");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        int int4 = type3.getSize();
        java.lang.String str5 = type3.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LF;" + "'", str5, "LF;");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitInsn((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("LC;");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L<init>(Ljava/lang/Lorg/mockito/asm/Type;;)V; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V" + "'", str2, "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitVarInsn(9, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
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
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter20 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter21);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        classEmitter20.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter20);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.cglib.core.ClassEmitter classEmitter29 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter27);
        classEmitter1.setTarget((org.mockito.asm.ClassVisitor) classEmitter27);
        org.mockito.asm.Type type35 = org.mockito.asm.Type.getReturnType("[Lorg/mockito/asm/Type;");
        org.mockito.cglib.core.Local local36 = new org.mockito.cglib.core.Local(126, type35);
        org.mockito.asm.Type type37 = local36.getType();
        int int38 = type37.getDimensions();
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.fromInternalName("L217518997");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.getBoxedType(type40);
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = signature45.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass46);
        java.lang.String str48 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass46);
        java.lang.String str49 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray56 = new org.mockito.asm.Type[] { type53, type55 };
        org.mockito.asm.Type type57 = null;
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type57);
        org.mockito.asm.Type type59 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type59);
        java.lang.String str61 = org.mockito.asm.Type.getMethodDescriptor(type51, typeArray56);
        java.lang.Class<?> wildcardClass62 = type51.getClass();
        org.mockito.cglib.core.Signature signature65 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass66 = signature65.getClass();
        java.lang.String str67 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass66);
        java.lang.String str68 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass66);
        java.lang.Class[] classArray69 = new java.lang.Class[] { wildcardClass46, wildcardClass62, wildcardClass66 };
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.getTypes(classArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.getTypes(classArray69);
        org.mockito.asm.Type type72 = org.mockito.asm.Type.SHORT_TYPE;
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type72);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray71, type72);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type41, typeArray71);
        // The following exception was thrown during execution in test generation
        try {
            classEmitter27.declare_field((int) '#', "L1070021836", type37, (java.lang.Object) str75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo3);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str47, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str48, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Lorg/mockito/cglib/core/Signature;" + "'", str49, "Lorg/mockito/cglib/core/Signature;");
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "(L;L;)L;" + "'", str61, "(L;L;)L;");
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str67, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "org/mockito/cglib/core/Signature" + "'", str68, "org/mockito/cglib/core/Signature");
        org.junit.Assert.assertNotNull(classArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;" + "'", str75, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("org.mockito.cglib.core.Signature");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(108);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
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
        org.mockito.cglib.core.ClassEmitter classEmitter21 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter22 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter22);
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter25 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter25);
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo29 = classEmitter28.getClassInfo();
        classEmitter21.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        label0.info = classEmitter21;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor34 = classEmitter21.visitAnnotation("L1845084035", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L2022987486" + "'", str1, "L2022987486");
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
        org.junit.Assert.assertNull(classInfo29);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        label5.info = 1L;
        label5.info = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLineNumber((int) (byte) 0, label5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1773398727" + "'", str6, "L1773398727");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        label7.info = 1L;
        java.lang.Object obj11 = label7.info;
        java.lang.Object obj12 = label7.info;
        java.lang.String str13 = label7.toString();
        java.lang.String str14 = label7.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        label15.info = 1L;
        java.lang.Object obj19 = label15.info;
        org.mockito.cglib.core.Signature signature22 = new org.mockito.cglib.core.Signature("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = signature22.getClass();
        label15.info = wildcardClass23;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("<init>(Ljava/lang/(L;L;L;L;L;L;;)V", "L721082287", "L1576218640", label7, label15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 10");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L1403217408" + "'", str8, "L1403217408");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1L + "'", obj11, 1L);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1L + "'", obj12, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1403217408" + "'", str13, "L1403217408");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1403217408" + "'", str14, "L1403217408");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1927074718" + "'", str16, "L1927074718");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 1L + "'", obj19, 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn(0, "org/mockito/asm/Type", "(Ljava/lang/Hi!;)V", "<init>$28Ljava$2Flang$2FLorg$2Fmockito$2Fasm$2FType$3B$3B$29V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(112);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMultiANewArrayInsn("L1782723141", 154);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitFieldInsn((int) '#', "L1410472451", "L217518997", "<init>(Ljava.lang.Lorg.mockito.asm.Type;;)V");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(155);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.AnnotationVisitor annotationVisitor6 = localVariablesSorter3.visitAnnotation("L1407451363", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMaxs(130, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        java.lang.String str6 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        java.lang.String str7 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) type8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org/mockito/asm/Type" + "'", str6, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter8 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter7.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter12 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter13 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter13);
        org.mockito.cglib.core.ClassEmitter classEmitter15 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter16 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter15.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter16);
        org.mockito.cglib.core.ClassEmitter classEmitter19 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassInfo classInfo20 = classEmitter19.getClassInfo();
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter19);
        classEmitter11.setTarget((org.mockito.asm.ClassVisitor) classEmitter12);
        org.mockito.cglib.core.ClassEmitter classEmitter23 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter24 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter23.setTarget((org.mockito.asm.ClassVisitor) classEmitter24);
        org.mockito.cglib.core.ClassInfo classInfo26 = classEmitter24.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter27 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter28 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter28);
        org.mockito.cglib.core.ClassEmitter classEmitter30 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter31 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter30.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter27.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter24.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        classEmitter12.setTarget((org.mockito.asm.ClassVisitor) classEmitter31);
        org.mockito.cglib.core.ClassEmitter classEmitter36 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter31);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLdcInsn((java.lang.Object) classEmitter36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(classInfo20);
        org.junit.Assert.assertNull(classInfo26);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("L69280469");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L69280469" + "'", str1, "L69280469");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        label4.info = "L;";
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type9, type11 };
        org.mockito.asm.Type type13 = null;
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type13);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type15);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        java.lang.Class<?> wildcardClass18 = type15.getClass();
        java.lang.String str19 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass18);
        label4.info = str19;
        java.lang.String str21 = label4.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        java.lang.String str23 = label22.toString();
        label22.info = 1L;
        java.lang.Object obj26 = label22.info;
        org.mockito.asm.Label label27 = new org.mockito.asm.Label();
        java.lang.String str28 = label27.toString();
        label27.info = 1L;
        java.lang.Object obj31 = label27.info;
        java.lang.Object obj32 = label27.info;
        label22.info = obj32;
        label4.info = obj32;
        int[] intArray41 = new int[] { (byte) 10, 156, (short) 100, (byte) 10, 126, 8 };
        org.mockito.asm.Label label42 = new org.mockito.asm.Label();
        java.lang.String str43 = label42.toString();
        label42.info = 1L;
        org.mockito.asm.Label label46 = new org.mockito.asm.Label();
        java.lang.String str47 = label46.toString();
        label46.info = 1L;
        java.lang.Object obj50 = label46.info;
        java.lang.Object obj51 = label46.info;
        java.lang.Object obj52 = null;
        label46.info = obj52;
        org.mockito.asm.Label[] labelArray54 = new org.mockito.asm.Label[] { label42, label46 };
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLookupSwitchInsn(label4, intArray41, labelArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L820417440" + "'", str5, "L820417440");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str19, "Lorg/mockito/asm/Type;");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L820417440" + "'", str21, "L820417440");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L2069505976" + "'", str23, "L2069505976");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 1L + "'", obj26, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1964829684" + "'", str28, "L1964829684");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 1L + "'", obj31, 1L);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 1L + "'", obj32, 1L);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[10, 156, 100, 10, 126, 8]");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L1187368756" + "'", str43, "L1187368756");
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L1111113695" + "'", str47, "L1111113695");
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 1L + "'", obj50, 1L);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 1L + "'", obj51, 1L);
        org.junit.Assert.assertNotNull(labelArray54);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("int");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        classEmitter0.setTarget((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Attribute attribute8 = null;
        // The following exception was thrown during execution in test generation
        try {
            classEmitter7.visitAttribute(attribute8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitMethodInsn((int) (short) 1, "int", "(L;L;L;L;L;L;)L;", "L1133572395");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        java.lang.String str5 = label4.toString();
        label4.info = "L;";
        java.lang.String str8 = label4.toString();
        java.lang.String str9 = label4.toString();
        java.lang.Object obj10 = label4.info;
        org.mockito.asm.Label label11 = new org.mockito.asm.Label();
        java.lang.String str12 = label11.toString();
        label11.info = 1L;
        java.lang.Object obj15 = label11.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        label16.info = 1L;
        java.lang.Object obj20 = label16.info;
        java.lang.Object obj21 = label16.info;
        label11.info = obj21;
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str25 = type24.getClassName();
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type24);
        java.lang.String str27 = type26.toString();
        java.lang.String str28 = type26.getInternalName();
        label11.info = type26;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        java.lang.String str31 = label30.toString();
        label30.info = "L;";
        java.lang.String str34 = label30.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitTryCatchBlock(label4, label11, label30, "L1845084035");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L719640604" + "'", str5, "L719640604");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L719640604" + "'", str8, "L719640604");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L719640604" + "'", str9, "L719640604");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "L;" + "'", obj10, "L;");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L831436153" + "'", str12, "L831436153");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 1L + "'", obj15, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L872616708" + "'", str17, "L872616708");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 1L + "'", obj20, 1L);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 1L + "'", obj21, 1L);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "L;" + "'", str27, "L;");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1208242701" + "'", str31, "L1208242701");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1208242701" + "'", str34, "L1208242701");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        java.lang.String str8 = label7.toString();
        label7.info = "L;";
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getType("");
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        label7.info = type12;
        java.lang.Object obj15 = label7.info;
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        java.lang.String str17 = label16.toString();
        label16.info = "L;";
        java.lang.String str20 = label16.toString();
        java.lang.String str21 = label16.toString();
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitLocalVariable("L694891632", "shortL;", "org.mockito.asm.Type", label7, label16, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unknown local variable 8");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L503312050" + "'", str8, "L503312050");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "L;");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "L;");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "L;");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1754209850" + "'", str17, "L1754209850");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1754209850" + "'", str20, "L1754209850");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1754209850" + "'", str21, "L1754209850");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.INT_TYPE;
        int int1 = type0.getSize();
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type0);
        int int4 = type0.getOpcode((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type I is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "int" + "'", str2, "int");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.mockito.asm.MethodVisitor methodVisitor2 = null;
        org.mockito.cglib.core.LocalVariablesSorter localVariablesSorter3 = new org.mockito.cglib.core.LocalVariablesSorter((int) (short) 1, "(Lorg/mockito/cglib/core/Signature;Lorg/mockito/asm/Type;Lorg/mockito/cglib/core/Signature;)LL217518997;", methodVisitor2);
        org.mockito.asm.Attribute attribute4 = null;
        // The following exception was thrown during execution in test generation
        try {
            localVariablesSorter3.visitAttribute(attribute4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
