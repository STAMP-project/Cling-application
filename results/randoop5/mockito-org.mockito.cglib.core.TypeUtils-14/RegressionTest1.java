import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$2Elang$2EJava$242Elang$242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java" + "'", str1, "java");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$242Elang$242EJava$24242Elang$24242Ehi!" + "'", str1, "java$242Elang$242EJava$24242Elang$24242Ehi!");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang$2Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/java$2Elang$2Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java.lang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang" + "'", str1, "Java$2Elang");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type17);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type19);
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(type24);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getBoxedType(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type50);
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type54);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type54);
        int int57 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type54);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isPrimitive(type59);
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        int int62 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type43, type48, type50, type54, type59 };
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type65);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type65);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type65);
        org.mockito.cglib.core.Signature signature70 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray69);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean74 = org.mockito.cglib.core.TypeUtils.isPrimitive(type73);
        int int75 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type73);
        java.lang.String str76 = org.mockito.cglib.core.TypeUtils.getClassName(type73);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type73);
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isArray(type77);
        boolean boolean79 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        java.lang.String str80 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        java.lang.String str81 = org.mockito.cglib.core.TypeUtils.getPackageName(type77);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray71, type77);
        boolean boolean83 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.hi!" + "'", str55, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(signature70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "java.lang.hi!" + "'", str76, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "java.lang.hi!" + "'", str80, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "java.lang" + "'", str81, "java.lang");
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST(100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$242424242Elang$242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray2);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(signature3);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        java.lang.Class<?> wildcardClass5 = type2.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242Elang$2424242Ehi!" + "'", str1, "Java$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang.hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.lang.hi!" + "'", str2, "Java.lang.hi!");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2EJava$242Elang$242Ehi!" + "'", str1, "Java$2Elang$2EJava$242Elang$242Ehi!");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242424242Elang$242424242Ehi!" + "'", str1, "Java$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getComponentType(type9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST(1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.String[] strArray14 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray18);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray18);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        java.lang.Class<?> wildcardClass27 = typeArray7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        java.lang.Class<?> wildcardClass10 = type7.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang" + "'", str1, "Java$242Elang");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        int int9 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getBoxedType(type12);
        int int16 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getComponentType(type15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray41);
        java.lang.Class<?> wildcardClass43 = typeArray41.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242424242Elang$24242424242Ehi!" + "'", str1, "Java$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isArray(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/Hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java.lang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java.lang.Java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.Java$2Elang$2Ehi!" + "'", str1, "Java.lang.Java$2Elang$2Ehi!");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST(1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isArray(type24);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type18, type21, type24 };
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type30, type33, type36 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray39);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean44 = org.mockito.cglib.core.TypeUtils.isPrimitive(type43);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray39, type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray39);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.getClassName(type48);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getBoxedType(type48);
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getPackageName(type50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type50);
        java.lang.Class<?> wildcardClass53 = type50.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang.hi!" + "'", str49, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang" + "'", str51, "java.lang");
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type18);
        int int23 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray22);
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray22);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray31);
        int int34 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray33);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 8 + "'", int34 == 8);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang.Java$2Elang$2Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java" + "'", str2, "Java");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.mockito.asm.Type type0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getComponentType(type0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getComponentType(type6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type25);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$24242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242Elang" + "'", str1, "Java$24242Elang");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java.lang.Java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang" + "'", str1, "java.lang");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type55);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str60 = org.mockito.cglib.core.TypeUtils.getClassName(type59);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type59);
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type61);
        org.mockito.asm.Type[] typeArray65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray64, typeArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(typeArray64);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type15, type18 };
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray24);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type29);
        org.mockito.cglib.core.Signature signature32 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(signature32);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray35);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        java.lang.String[] strArray24 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getBoxedType(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray38);
        int int40 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray20);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray31);
        java.lang.String[] strArray37 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getBoxedType(type49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type57);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type57);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getComponentType(type57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        java.lang.Class<?> wildcardClass5 = type2.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang$2Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2Elang$2Ehi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava$2Elang$2Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$24242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        int int20 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type1, type6, type8, type12, type17 };
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type27);
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 10L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type21);
        int int27 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type37);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getBoxedType(type37);
        java.lang.Class<?> wildcardClass40 = type37.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getBoxedType(type37);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type40);
        int int42 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getComponentType(type7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang" + "'", str1, "Java.lang");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java" + "'", str1, "Java");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        java.lang.Class<?> wildcardClass10 = type7.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242EJava$24242Elang$24242Ehi!" + "'", str1, "Java$242Elang$242EJava$24242Elang$24242Ehi!");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        java.lang.Class<?> wildcardClass17 = typeArray6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$24242Elang" + "'", str1, "java$24242Elang");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type53);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type53);
        int int61 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray60);
        java.lang.String[] strArray63 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray63);
        java.lang.Class<?> wildcardClass65 = strArray63.getClass();
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass68 = type67.getClass();
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass71 = type70.getClass();
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature74 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray73);
        java.lang.Class<?> wildcardClass75 = typeArray73.getClass();
        java.lang.String[] strArray77 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray77);
        java.lang.Class<?> wildcardClass79 = strArray77.getClass();
        java.lang.Class[] classArray80 = new java.lang.Class[] { wildcardClass65, wildcardClass68, wildcardClass71, wildcardClass75, wildcardClass79 };
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.getTypes(classArray80);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.getTypes(classArray80);
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int85 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type84);
        org.mockito.asm.Type type87 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str88 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type87);
        org.mockito.asm.Type type90 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str91 = org.mockito.cglib.core.TypeUtils.getClassName(type90);
        boolean boolean92 = org.mockito.cglib.core.TypeUtils.isArray(type90);
        org.mockito.asm.Type[] typeArray93 = new org.mockito.asm.Type[] { type84, type87, type90 };
        java.lang.String[] strArray94 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray93);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray82, typeArray93);
        org.mockito.asm.Type[] typeArray96 = org.mockito.cglib.core.TypeUtils.add(typeArray60, typeArray93);
        java.lang.String[] strArray97 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray93);
        java.lang.String[] strArray98 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray93);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(signature74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(type87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "java.lang.hi!" + "'", str88, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "java.lang.hi!" + "'", str91, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(typeArray93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertNotNull(typeArray96);
        org.junit.Assert.assertNotNull(strArray97);
        org.junit.Assert.assertNotNull(strArray98);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$2424242Elang$2424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        int int41 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray39);
        int int43 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        java.lang.Class<?> wildcardClass7 = type3.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java.lang.Java$2Elang$2Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.cglib.core.Signature signature27 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray26);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(signature27);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Java$242Elang" + "'", str3, "Java$242Elang");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type8);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        java.lang.String[] strArray41 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        java.lang.Class<?> wildcardClass43 = strArray41.getClass();
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray45);
        java.lang.Class<?> wildcardClass47 = typeArray45.getClass();
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray49);
        java.lang.Class<?> wildcardClass51 = typeArray49.getClass();
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature54 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray53);
        java.lang.Class<?> wildcardClass55 = typeArray53.getClass();
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature58 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray57);
        java.lang.Class<?> wildcardClass59 = typeArray57.getClass();
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature62 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray61);
        java.lang.Class<?> wildcardClass63 = typeArray61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass43, wildcardClass47, wildcardClass51, wildcardClass55, wildcardClass59, wildcardClass63 };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.getTypes(classArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray65);
        org.mockito.cglib.core.Signature signature67 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray65);
        java.lang.Class<?> wildcardClass68 = signature67.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(signature50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(signature54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(signature58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(signature62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(signature67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang$2Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.java$2Elang$2Ehi!" + "'", str5, "java.lang.java$2Elang$2Ehi!");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang" + "'", str7, "java.lang");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$2Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.Class<?> wildcardClass7 = type4.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242424242Elang$2424242424242Ehi!" + "'", str1, "Java$2424242424242Elang$2424242424242Ehi!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type11);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type11);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        java.lang.Class<?> wildcardClass15 = typeArray14.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$242Elang$242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java$242Elang$242Ehi!" + "'", str2, "Java$242Elang$242Ehi!");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java.lang.Java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2EJava$242Elang$242Ehi!" + "'", str1, "Java$2Elang$2EJava$242Elang$242Ehi!");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray16);
        java.lang.Class<?> wildcardClass21 = typeArray16.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242424242424242Elang$242424242424242Ehi!" + "'", str1, "Java$242424242424242Elang$242424242424242Ehi!");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java.lang.hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getClassName(type25);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type25);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type44, type47, type50 };
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type57);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray53, type57);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray53);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray60);
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray60);
        int int63 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(signature61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242424242Elang$242424242Ehi!" + "'", str1, "Java$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$2424242424242Elang$2424242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242424242Elang$2424242424242Ehi!" + "'", str1, "Java$2424242424242Elang$2424242424242Ehi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type18);
        java.lang.String[] strArray26 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray44);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray47);
        int int49 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        int int50 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray47);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(signature45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(signature52);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang$242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Java$242Elang$242Ehi!" + "'", str3, "Java$242Elang$242Ehi!");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$24242Elang$24242Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/Java$24242Elang$24242Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        int int40 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$24242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getPackageName(type8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getComponentType(type8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang" + "'", str9, "java.lang");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray33);
        java.lang.Class<?> wildcardClass36 = typeArray35.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type15, type18 };
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray24);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type29);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.getClassName(type41);
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type41);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.getBoxedType(type45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type48);
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.getClassName(type48);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type52);
        java.lang.String str54 = org.mockito.cglib.core.TypeUtils.getClassName(type52);
        int int55 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type52);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type57);
        int int59 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type57);
        int int60 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type57);
        org.mockito.asm.Type[] typeArray61 = new org.mockito.asm.Type[] { type41, type46, type48, type52, type57 };
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getBoxedType(type63);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type63);
        java.lang.String str66 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type63);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray36, type63);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray67, type69);
        java.lang.String[] strArray71 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray67);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray71);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray74);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "java.lang.hi!" + "'", str42, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang.hi!" + "'", str49, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java.lang.hi!" + "'", str50, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang.hi!" + "'", str53, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java.lang.hi!" + "'", str54, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray75);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        java.lang.Class[] classArray6 = new java.lang.Class[] { wildcardClass5 };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.getTypes(classArray6);
        org.mockito.asm.Type[] typeArray8 = null;
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang$242Ehi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray8, type11);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(classArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java.lang");
        org.mockito.asm.Type[] typeArray2 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type15, type18 };
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray24);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type30, type33, type36 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int43 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.getClassName(type48);
        boolean boolean50 = org.mockito.cglib.core.TypeUtils.isArray(type48);
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] { type42, type45, type48 };
        java.lang.String[] strArray52 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray51);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean57 = org.mockito.cglib.core.TypeUtils.isPrimitive(type56);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.getBoxedType(type56);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type58);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type58);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type62);
        java.lang.String str65 = org.mockito.cglib.core.TypeUtils.getClassName(type64);
        java.lang.String str66 = org.mockito.cglib.core.TypeUtils.getClassName(type64);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type64);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.getPackageName(type64);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type64);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang.hi!" + "'", str49, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(typeArray69);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type53);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type53);
        int int61 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray60);
        java.lang.String[] strArray63 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray63);
        java.lang.Class<?> wildcardClass65 = strArray63.getClass();
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass68 = type67.getClass();
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass71 = type70.getClass();
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature74 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray73);
        java.lang.Class<?> wildcardClass75 = typeArray73.getClass();
        java.lang.String[] strArray77 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray77);
        java.lang.Class<?> wildcardClass79 = strArray77.getClass();
        java.lang.Class[] classArray80 = new java.lang.Class[] { wildcardClass65, wildcardClass68, wildcardClass71, wildcardClass75, wildcardClass79 };
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.getTypes(classArray80);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.getTypes(classArray80);
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int85 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type84);
        org.mockito.asm.Type type87 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str88 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type87);
        org.mockito.asm.Type type90 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str91 = org.mockito.cglib.core.TypeUtils.getClassName(type90);
        boolean boolean92 = org.mockito.cglib.core.TypeUtils.isArray(type90);
        org.mockito.asm.Type[] typeArray93 = new org.mockito.asm.Type[] { type84, type87, type90 };
        java.lang.String[] strArray94 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray93);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray82, typeArray93);
        org.mockito.asm.Type[] typeArray96 = org.mockito.cglib.core.TypeUtils.add(typeArray60, typeArray93);
        org.mockito.cglib.core.Signature signature97 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray93);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(signature74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(type87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "java.lang.hi!" + "'", str88, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "java.lang.hi!" + "'", str91, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(typeArray93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertNotNull(typeArray96);
        org.junit.Assert.assertNotNull(signature97);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        org.mockito.cglib.core.Signature signature17 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type22);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        java.lang.String[] strArray27 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int30 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.getClassName(type35);
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isArray(type35);
        org.mockito.asm.Type[] typeArray38 = new org.mockito.asm.Type[] { type29, type32, type35 };
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type41, type44, type47 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray50);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isPrimitive(type54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type54);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray50);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray59);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray19);
        java.lang.Class<?> wildcardClass62 = typeArray61.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(signature17);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$24242Elang$24242EJava$2424242Elang$2424242Ehi!" + "'", str1, "java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray16);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(signature21);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava$242Elang; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type8);
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray38);
        java.lang.String[] strArray44 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray45, typeArray47);
        int int49 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.getBoxedType(type51);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type52);
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray47);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray54);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray55);
        int int57 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray56);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        int int13 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray17);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray20);
        java.lang.String[] strArray25 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray26, type33);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type33);
        java.lang.String str40 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$242424242Elang$242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang$2Ehi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.Java$2Elang$2Ehi!" + "'", str7, "java.lang.Java$2Elang$2Ehi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        java.lang.Class<?> wildcardClass9 = typeArray8.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        java.lang.Class<?> wildcardClass38 = strArray37.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(signature3);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242424242Elang$242424242Ehi!" + "'", str1, "Java$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        java.lang.String[] strArray24 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type30, type33, type36 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray42);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int49 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type48);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type51);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.getClassName(type54);
        boolean boolean56 = org.mockito.cglib.core.TypeUtils.isArray(type54);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type48, type51, type54 };
        java.lang.String[] strArray58 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type60);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type63);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.getClassName(type66);
        boolean boolean68 = org.mockito.cglib.core.TypeUtils.isArray(type66);
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type60, type63, type66 };
        java.lang.String[] strArray70 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray57, typeArray69);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray45, typeArray71);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isPrimitive(type74);
        org.mockito.asm.Type type76 = org.mockito.cglib.core.TypeUtils.getBoxedType(type74);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type76);
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type76);
        org.mockito.asm.Type type80 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str81 = org.mockito.cglib.core.TypeUtils.getClassName(type80);
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type80);
        java.lang.String str83 = org.mockito.cglib.core.TypeUtils.getClassName(type82);
        java.lang.String str84 = org.mockito.cglib.core.TypeUtils.getClassName(type82);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type82);
        boolean boolean86 = org.mockito.cglib.core.TypeUtils.isArray(type82);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type82);
        java.lang.Class<?> wildcardClass88 = typeArray87.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(signature43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.hi!" + "'", str55, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang.hi!" + "'", str64, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang.hi!" + "'", str67, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        java.lang.Class<?> wildcardClass20 = classArray18.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type13, type16, type19 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean27 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray22, type26);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.cglib.core.Signature signature30 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray28);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(signature30);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray19);
        java.lang.String[] strArray27 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type41, type44, type47 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray50);
        java.lang.String[] strArray53 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray50);
        java.lang.String[] strArray58 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray58);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray62 = org.mockito.cglib.core.TypeUtils.add(typeArray59, typeArray61);
        int int63 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type66);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type66);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type68);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray50);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray31);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str74 = org.mockito.cglib.core.TypeUtils.getClassName(type73);
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isArray(type73);
        java.lang.String str76 = org.mockito.cglib.core.TypeUtils.getClassName(type73);
        java.lang.String str77 = org.mockito.cglib.core.TypeUtils.getPackageName(type73);
        java.lang.String str78 = org.mockito.cglib.core.TypeUtils.getPackageName(type73);
        int int79 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type73);
        boolean boolean80 = org.mockito.cglib.core.TypeUtils.isArray(type73);
        int int81 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type73);
        java.lang.String str82 = org.mockito.cglib.core.TypeUtils.getClassName(type73);
        org.mockito.asm.Type[] typeArray83 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type73);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(signature52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang.hi!" + "'", str74, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "java.lang.hi!" + "'", str76, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "java.lang" + "'", str77, "java.lang");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "java.lang" + "'", str78, "java.lang");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "java.lang.hi!" + "'", str82, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray83);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int11 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isArray(type16);
        org.mockito.asm.Type[] typeArray19 = new org.mockito.asm.Type[] { type10, type13, type16 };
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.String[] strArray24 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray22);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray8, typeArray25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int29 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type28);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str32 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type34);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isArray(type34);
        org.mockito.asm.Type[] typeArray37 = new org.mockito.asm.Type[] { type28, type31, type34 };
        java.lang.String[] strArray38 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isArray(type46);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type40, type43, type46 };
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray51);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isPrimitive(type54);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getBoxedType(type54);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type56);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type56);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str61 = org.mockito.cglib.core.TypeUtils.getClassName(type60);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type60);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.getClassName(type62);
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type62);
        java.lang.String str66 = org.mockito.cglib.core.TypeUtils.getPackageName(type62);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type62);
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getClassName(type69);
        boolean boolean71 = org.mockito.cglib.core.TypeUtils.isArray(type69);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.getBoxedType(type69);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type72);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.getBoxedType(type73);
        org.mockito.asm.Type[] typeArray75 = org.mockito.cglib.core.TypeUtils.add(typeArray67, type74);
        java.lang.Class<?> wildcardClass76 = typeArray67.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "java.lang.hi!" + "'", str32, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang.hi!" + "'", str47, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(typeArray75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$242424242424242Elang$242424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$2424242424242Elang$2424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$24242424242Elang$24242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type19);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isArray(type5);
        boolean boolean7 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java.lang.Java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang" + "'", str1, "Java.lang");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.String[] strArray14 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray18);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray18);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$24242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2424242Elang" + "'", str1, "java$2424242Elang");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray41);
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(signature43);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        int int17 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(signature20);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type4);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$24242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        java.lang.Class<?> wildcardClass4 = typeArray3.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        int int1 = org.mockito.cglib.core.TypeUtils.ICONST((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isPrimitive(type16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        int int3 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getComponentType(type9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        java.lang.String[] strArray24 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray27);
        java.lang.String[] strArray32 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getBoxedType(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type37);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray38);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("Java$2Elang$2EJava$242Elang$242Ehi!");
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type41);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(typeArray42);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type19);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getBoxedType(type19);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type23);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type23);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        boolean boolean33 = org.mockito.cglib.core.TypeUtils.isArray(type27);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getComponentType(type27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type18);
        java.lang.String[] strArray26 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray44);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray47);
        int int49 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        int int50 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray47);
        java.lang.String[] strArray55 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray56, typeArray58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type68);
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getClassName(type68);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str73 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type72);
        java.lang.String str74 = org.mockito.cglib.core.TypeUtils.getClassName(type72);
        int int75 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type72);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        int int79 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        int int80 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type61, type66, type68, type72, type77 };
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.getBoxedType(type83);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray81, type83);
        java.lang.String str86 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type83);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type83);
        org.mockito.asm.Type type89 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray87, type89);
        org.mockito.asm.Type type92 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242Elang$242Ehi!");
        org.mockito.asm.Type[] typeArray93 = org.mockito.cglib.core.TypeUtils.add(typeArray87, type92);
        java.lang.String str94 = org.mockito.cglib.core.TypeUtils.getClassName(type92);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type92);
        java.lang.String str96 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type92);
        java.lang.String str97 = org.mockito.cglib.core.TypeUtils.getPackageName(type92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(signature45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "java.lang.hi!" + "'", str63, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang.hi!" + "'", str69, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.lang.hi!" + "'", str73, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang.hi!" + "'", str74, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(type89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertNotNull(typeArray93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "java$242Elang$242Ehi!" + "'", str94, "java$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "java$242Elang$242Ehi!" + "'", str96, "java$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "" + "'", str97, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2424242Elang$2424242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.java$2424242Elang$2424242Ehi!" + "'", str2, "java.lang.java$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getPackageName(type14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type14);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getPackageName(type14);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.getComponentType(type14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang" + "'", str16, "java.lang");
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang" + "'", str18, "java.lang");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type22);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type28);
        boolean boolean30 = org.mockito.cglib.core.TypeUtils.isArray(type28);
        org.mockito.asm.Type[] typeArray31 = new org.mockito.asm.Type[] { type22, type25, type28 };
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray31);
        java.lang.String[] strArray37 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray40);
        java.lang.String[] strArray45 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray45);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.getBoxedType(type49);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        boolean boolean55 = org.mockito.cglib.core.TypeUtils.isArray(type53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray46, type53);
        org.mockito.asm.Type type57 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str58 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.getClassName(type57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type57);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type57);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.parseType("java$2Elang$2Ehi!");
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray61, type63);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang.hi!" + "'", str26, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertNotNull(typeArray64);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract(7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        java.lang.Class<?> wildcardClass14 = typeArray6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray13);
        java.lang.String[] strArray18 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray19, typeArray21);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray19);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray36);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray13, typeArray36);
        org.mockito.cglib.core.Signature signature42 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray36);
        java.lang.Class<?> wildcardClass43 = signature42.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(signature38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(signature42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type6);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type6);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        java.lang.Class<?> wildcardClass11 = type9.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected(4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type3);
        java.lang.Class<?> wildcardClass5 = type3.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray7);
        int int9 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getBoxedType(type11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray7, type12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray0, type12);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isPrimitive(type12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242EJava$24242Elang$24242Ehi!" + "'", str1, "Java$242Elang$242EJava$24242Elang$24242Ehi!");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        java.lang.Class<?> wildcardClass52 = typeArray51.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java.lang.Java$2Elang$2Ehi!");
        java.lang.Class<?> wildcardClass2 = signature1.getClass();
        org.junit.Assert.assertNotNull(signature1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type2);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.getComponentType(type7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.cglib.core.Signature signature8 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(signature8);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type6);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type8);
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.add(typeArray2, type8);
        java.lang.Class<?> wildcardClass12 = typeArray11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$2Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang" + "'", str1, "Java$2Elang");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type21);
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type24);
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isArray(type24);
        org.mockito.asm.Type[] typeArray27 = new org.mockito.asm.Type[] { type18, type21, type24 };
        java.lang.String[] strArray28 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature31 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray30);
        java.lang.String[] strArray32 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray30);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray27, type35);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray15, type35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(signature31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        java.lang.Class<?> wildcardClass10 = type8.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.getTypes(classArray0);
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2EJava$242Elang$242Ehi!" + "'", str1, "Java$2Elang$2EJava$242Elang$242Ehi!");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$24242Elang");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.Java$2Elang$2Ehi!");
        int int2 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray34);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.getClassName(type37);
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.getBoxedType(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type44);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str49 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type48);
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.getClassName(type48);
        int int51 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type48);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        int int55 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type53);
        int int56 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type53);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type37, type42, type44, type48, type53 };
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.getBoxedType(type59);
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.add(typeArray57, type59);
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type59);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type59);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type65);
        java.lang.String[] strArray67 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray63);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray63);
        java.lang.String[] strArray69 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray70 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray69);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "java.lang.hi!" + "'", str49, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java.lang.hi!" + "'", str50, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(typeArray70);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$24242Elang");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava$24242Elang; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java.lang.java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2Elang$2Ejava$242424242Elang$242424242Ehi!" + "'", str1, "java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal(2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$242424242424242Elang$242424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242424242424242Elang$24242424242424242Ehi!" + "'", str1, "Java$24242424242424242Elang$24242424242424242Ehi!");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type37);
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getBoxedType(type37);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type40);
        java.lang.String str42 = org.mockito.cglib.core.TypeUtils.getClassName(type40);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "java.lang.hi!" + "'", str42, "java.lang.hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$24242424242424242Elang$24242424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242424242424242Elang$2424242424242424242Ehi!" + "'", str1, "Java$2424242424242424242Elang$2424242424242424242Ehi!");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.getBoxedType(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type50);
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type54);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type54);
        int int57 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type54);
        org.mockito.asm.Type type59 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean60 = org.mockito.cglib.core.TypeUtils.isPrimitive(type59);
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        int int62 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type59);
        org.mockito.asm.Type[] typeArray63 = new org.mockito.asm.Type[] { type43, type48, type50, type54, type59 };
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type[] typeArray67 = org.mockito.cglib.core.TypeUtils.add(typeArray63, type65);
        java.lang.String str68 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type65);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type65);
        org.mockito.cglib.core.Signature signature70 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray69);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean74 = org.mockito.cglib.core.TypeUtils.isPrimitive(type73);
        int int75 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type73);
        java.lang.String str76 = org.mockito.cglib.core.TypeUtils.getClassName(type73);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type73);
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isArray(type77);
        boolean boolean79 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        java.lang.String str80 = org.mockito.cglib.core.TypeUtils.getClassName(type77);
        java.lang.String str81 = org.mockito.cglib.core.TypeUtils.getPackageName(type77);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray71, type77);
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int85 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type84);
        boolean boolean86 = org.mockito.cglib.core.TypeUtils.isArray(type84);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray71, type84);
        java.lang.String str88 = org.mockito.cglib.core.TypeUtils.getClassName(type84);
        boolean boolean89 = org.mockito.cglib.core.TypeUtils.isArray(type84);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.hi!" + "'", str55, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(signature70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "java.lang.hi!" + "'", str76, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "java.lang.hi!" + "'", str80, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "java.lang" + "'", str81, "java.lang");
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "java.lang.hi!" + "'", str88, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.cglib.core.Signature signature13 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int16 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type18);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        boolean boolean23 = org.mockito.cglib.core.TypeUtils.isArray(type21);
        org.mockito.asm.Type[] typeArray24 = new org.mockito.asm.Type[] { type15, type18, type21 };
        java.lang.String[] strArray25 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray27);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray24);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type36);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type36);
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getPackageName(type36);
        java.lang.Class<?> wildcardClass40 = type36.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(signature13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray22);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2Ejava$242424242Elang$242424242Ehi!" + "'", str1, "Java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray11 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type15);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type15);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        java.lang.Class<?> wildcardClass21 = signature20.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray7);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray29 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature34 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray33, type36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray31, typeArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray40);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean45 = org.mockito.cglib.core.TypeUtils.isPrimitive(type44);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray42, type44);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(signature34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(typeArray46);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        int int20 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type1, type6, type8, type12, type17 };
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getPackageName(type23);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type8);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type8);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getComponentType(type8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray38);
        java.lang.Class<?> wildcardClass40 = typeArray38.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature24 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type26);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray30);
        java.lang.String[] strArray35 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray35);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray36);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int45 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type47);
        org.mockito.asm.Type type50 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str51 = org.mockito.cglib.core.TypeUtils.getClassName(type50);
        boolean boolean52 = org.mockito.cglib.core.TypeUtils.isArray(type50);
        org.mockito.asm.Type[] typeArray53 = new org.mockito.asm.Type[] { type44, type47, type50 };
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.cglib.core.Signature signature55 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray53);
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray53);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray42, typeArray53);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray53);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str61 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type60);
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type60);
        org.mockito.asm.Type[] typeArray63 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type60);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type60);
        int int65 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type60);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(signature24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "java.lang.hi!" + "'", str51, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(signature55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "java.lang.hi!" + "'", str61, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isPrimitive(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$2424242424242424242Elang$2424242424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242Elang");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava$242Elang; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        org.mockito.asm.Type type56 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type55);
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.add(typeArray24, type55);
        int int58 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray57);
        int int59 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray57);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 4 + "'", int58 == 4);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java.lang.Java$2Elang$2Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.lang.Java$2Elang$2Ehi!" + "'", str2, "Java.lang.Java$2Elang$2Ehi!");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isFinal((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) 7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        int int1 = org.mockito.cglib.core.TypeUtils.FCONST((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java.lang.hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java.lang" + "'", str2, "Java.lang");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$2424242424242424242Elang$2424242424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2424242424242424242Elang$2424242424242424242Ehi!" + "'", str1, "Java$2424242424242424242Elang$2424242424242424242Ehi!");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$24242424242424242Elang$24242424242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$242424242424242Elang$242424242424242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java$242424242424242Elang$242424242424242Ehi!" + "'", str2, "Java$242424242424242Elang$242424242424242Ehi!");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.Class<?> wildcardClass5 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        java.lang.String[] strArray41 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        java.lang.Class<?> wildcardClass43 = strArray41.getClass();
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray45);
        java.lang.Class<?> wildcardClass47 = typeArray45.getClass();
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray49);
        java.lang.Class<?> wildcardClass51 = typeArray49.getClass();
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature54 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray53);
        java.lang.Class<?> wildcardClass55 = typeArray53.getClass();
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature58 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray57);
        java.lang.Class<?> wildcardClass59 = typeArray57.getClass();
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature62 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray61);
        java.lang.Class<?> wildcardClass63 = typeArray61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass43, wildcardClass47, wildcardClass51, wildcardClass55, wildcardClass59, wildcardClass63 };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.getTypes(classArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray65);
        java.lang.String[] strArray70 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray70);
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray74 = org.mockito.cglib.core.TypeUtils.add(typeArray71, typeArray73);
        java.lang.String[] strArray78 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray79 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray78);
        org.mockito.asm.Type[] typeArray80 = org.mockito.cglib.core.TypeUtils.add(typeArray74, typeArray79);
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getBoxedType(type82);
        org.mockito.asm.Type[] typeArray84 = org.mockito.cglib.core.TypeUtils.add(typeArray79, type83);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray65, typeArray79);
        java.lang.String[] strArray86 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray65);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(signature50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(signature54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(signature58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(signature62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(typeArray84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertNotNull(strArray86);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$2Elang$2EJava$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type2);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type2);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$24242Elang$24242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java$24242Elang$24242Ehi!" + "'", str2, "Java$24242Elang$24242Ehi!");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface(11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature6 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.Class<?> wildcardClass7 = typeArray5.getClass();
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        java.lang.Class<?> wildcardClass11 = typeArray9.getClass();
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray13);
        java.lang.Class<?> wildcardClass15 = typeArray13.getClass();
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray17);
        java.lang.Class<?> wildcardClass19 = typeArray17.getClass();
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.Class<?> wildcardClass23 = typeArray21.getClass();
        java.lang.Class[] classArray24 = new java.lang.Class[] { wildcardClass3, wildcardClass7, wildcardClass11, wildcardClass15, wildcardClass19, wildcardClass23 };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray24);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray30 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getBoxedType(type33);
        int int37 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type36);
        java.lang.String str38 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type36);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray31, type36);
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(signature6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(classArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "java.lang.hi!" + "'", str38, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(signature41);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$24242Elang");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        java.lang.Class<?> wildcardClass9 = type4.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray6);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray13);
        int int15 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray14);
        org.mockito.cglib.core.Signature signature16 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(signature16);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type6);
        java.lang.Class<?> wildcardClass8 = type6.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type6);
        org.mockito.asm.Type[] typeArray8 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type7);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        int int10 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(signature11);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int6 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type53);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type53);
        int int61 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray60);
        java.lang.String[] strArray63 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray63);
        java.lang.Class<?> wildcardClass65 = strArray63.getClass();
        org.mockito.asm.Type type67 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass68 = type67.getClass();
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass71 = type70.getClass();
        org.mockito.asm.Type[] typeArray73 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature74 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray73);
        java.lang.Class<?> wildcardClass75 = typeArray73.getClass();
        java.lang.String[] strArray77 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray77);
        java.lang.Class<?> wildcardClass79 = strArray77.getClass();
        java.lang.Class[] classArray80 = new java.lang.Class[] { wildcardClass65, wildcardClass68, wildcardClass71, wildcardClass75, wildcardClass79 };
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.getTypes(classArray80);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.getTypes(classArray80);
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int85 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type84);
        org.mockito.asm.Type type87 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str88 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type87);
        org.mockito.asm.Type type90 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str91 = org.mockito.cglib.core.TypeUtils.getClassName(type90);
        boolean boolean92 = org.mockito.cglib.core.TypeUtils.isArray(type90);
        org.mockito.asm.Type[] typeArray93 = new org.mockito.asm.Type[] { type84, type87, type90 };
        java.lang.String[] strArray94 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray93);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray82, typeArray93);
        org.mockito.asm.Type[] typeArray96 = org.mockito.cglib.core.TypeUtils.add(typeArray60, typeArray93);
        java.lang.Class<?> wildcardClass97 = typeArray96.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(type67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(signature74);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertNotNull(classArray80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(type87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "java.lang.hi!" + "'", str88, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "java.lang.hi!" + "'", str91, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(typeArray93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertNotNull(typeArray96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type17);
        org.mockito.asm.Type type21 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean22 = org.mockito.cglib.core.TypeUtils.isPrimitive(type21);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type21);
        java.lang.String str24 = org.mockito.cglib.core.TypeUtils.getClassName(type21);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type21);
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type21);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.lang.hi!" + "'", str24, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242Elang$24242EJava$2424242Elang$2424242Ehi!" + "'", str1, "Java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("java.lang.java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java.lang.java$2424242Elang$2424242Ehi!" + "'", str1, "Java.lang.java$2424242Elang$2424242Ehi!");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java$2424242Elang$2424242Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int3 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$2Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang" + "'", str1, "Java$242Elang");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang.hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getPackageName(type5);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type5);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!" + "'", str1, "java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("java$2424242Elang");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$24242424242424242Elang$24242424242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242424242424242Elang$24242424242424242Ehi!" + "'", str1, "Java$24242424242424242Elang$24242424242424242Ehi!");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isProtected((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$2424242424242424242Elang$2424242424242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type15, type18 };
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray24);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        java.lang.Class<?> wildcardClass33 = type29.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang$2Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.cglib.core.Signature signature3 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type[] typeArray5 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int8 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type13);
        boolean boolean15 = org.mockito.cglib.core.TypeUtils.isArray(type13);
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type7, type10, type13 };
        java.lang.String[] strArray17 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.cglib.core.Signature signature18 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray16);
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray16);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray16);
        org.mockito.cglib.core.Signature signature21 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray5);
        java.lang.String[] strArray23 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray23);
        java.lang.Class<?> wildcardClass25 = strArray23.getClass();
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature28 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray27);
        java.lang.Class<?> wildcardClass29 = typeArray27.getClass();
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature32 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray31);
        java.lang.Class<?> wildcardClass33 = typeArray31.getClass();
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature36 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray35);
        java.lang.Class<?> wildcardClass37 = typeArray35.getClass();
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature40 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray39);
        java.lang.Class<?> wildcardClass41 = typeArray39.getClass();
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature44 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray43);
        java.lang.Class<?> wildcardClass45 = typeArray43.getClass();
        java.lang.Class[] classArray46 = new java.lang.Class[] { wildcardClass25, wildcardClass29, wildcardClass33, wildcardClass37, wildcardClass41, wildcardClass45 };
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.getTypes(classArray46);
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.add(typeArray5, typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray48);
        org.mockito.cglib.core.Signature signature51 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray48);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(signature3);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(signature18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(signature21);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(signature28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(signature32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(signature36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(signature40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(signature44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(signature51);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$242Elang$242EJava$24242Elang$24242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.String[] strArray36 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray4);
        int int37 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray4);
        org.mockito.cglib.core.Signature signature38 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(signature38);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray1);
        java.lang.String[] strArray3 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        int int26 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        int int27 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray24);
        java.lang.String[] strArray31 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray31);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray32, typeArray34);
        int int36 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray34);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getBoxedType(type38);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.add(typeArray34, type39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray34);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.getBoxedType(type43);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray41, type43);
        int int47 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int47 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type46);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type49);
        org.mockito.asm.Type type52 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str53 = org.mockito.cglib.core.TypeUtils.getClassName(type52);
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isArray(type52);
        org.mockito.asm.Type[] typeArray55 = new org.mockito.asm.Type[] { type46, type49, type52 };
        java.lang.String[] strArray56 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        org.mockito.cglib.core.Signature signature57 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray55);
        java.lang.String[] strArray58 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray44, typeArray55);
        int int60 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray55);
        org.mockito.cglib.core.Signature signature61 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray55);
        java.lang.String[] strArray62 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray55);
        int int63 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray55);
        org.mockito.asm.Type[] typeArray64 = org.mockito.cglib.core.TypeUtils.add(typeArray42, typeArray55);
        org.mockito.cglib.core.Signature signature65 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java.lang.hi!" + "'", str50, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "java.lang.hi!" + "'", str53, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(signature57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 3 + "'", int60 == 3);
        org.junit.Assert.assertNotNull(signature61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 3 + "'", int63 == 3);
        org.junit.Assert.assertNotNull(typeArray64);
        org.junit.Assert.assertNotNull(signature65);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java.lang.java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2Elang$2Ejava$242Elang$242Ehi!" + "'", str1, "java$2Elang$2Ejava$242Elang$242Ehi!");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2EJava$242Elang$242Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java$2Elang$2EJava$242Elang$242Ehi!" + "'", str2, "Java$2Elang$2EJava$242Elang$242Ehi!");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java.lang.java$2Elang$2Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.lang" + "'", str1, "java.lang");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        int int1 = org.mockito.cglib.core.TypeUtils.LCONST((long) 5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPublic((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type7);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type7);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getPackageName(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang" + "'", str10, "java.lang");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        org.mockito.asm.Type type37 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type37);
        java.lang.String[] strArray39 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.Class<?> wildcardClass41 = strArray39.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type2);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang" + "'", str3, "java.lang");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang" + "'", str4, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!" + "'", str1, "Java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.String[] strArray1 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray2 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        org.mockito.asm.Type[] typeArray11 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature12 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray11);
        java.lang.Class<?> wildcardClass13 = typeArray11.getClass();
        java.lang.String[] strArray15 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray15);
        java.lang.Class<?> wildcardClass17 = strArray15.getClass();
        java.lang.Class[] classArray18 = new java.lang.Class[] { wildcardClass3, wildcardClass6, wildcardClass9, wildcardClass13, wildcardClass17 };
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        org.mockito.asm.Type[] typeArray20 = org.mockito.cglib.core.TypeUtils.getTypes(classArray18);
        java.lang.String[] strArray24 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.add(typeArray25, typeArray27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int31 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type33);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.getClassName(type36);
        boolean boolean38 = org.mockito.cglib.core.TypeUtils.isArray(type36);
        org.mockito.asm.Type[] typeArray39 = new org.mockito.asm.Type[] { type30, type33, type36 };
        java.lang.String[] strArray40 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray39);
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature43 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray42);
        java.lang.String[] strArray44 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray42);
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.add(typeArray39, typeArray42);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray45);
        org.mockito.asm.Type type48 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int49 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type48);
        org.mockito.asm.Type type51 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type51);
        org.mockito.asm.Type type54 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str55 = org.mockito.cglib.core.TypeUtils.getClassName(type54);
        boolean boolean56 = org.mockito.cglib.core.TypeUtils.isArray(type54);
        org.mockito.asm.Type[] typeArray57 = new org.mockito.asm.Type[] { type48, type51, type54 };
        java.lang.String[] strArray58 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray57);
        org.mockito.asm.Type type60 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int61 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type60);
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type63);
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str67 = org.mockito.cglib.core.TypeUtils.getClassName(type66);
        boolean boolean68 = org.mockito.cglib.core.TypeUtils.isArray(type66);
        org.mockito.asm.Type[] typeArray69 = new org.mockito.asm.Type[] { type60, type63, type66 };
        java.lang.String[] strArray70 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray69);
        org.mockito.asm.Type[] typeArray71 = org.mockito.cglib.core.TypeUtils.add(typeArray57, typeArray69);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray45, typeArray71);
        org.mockito.asm.Type type74 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean75 = org.mockito.cglib.core.TypeUtils.isPrimitive(type74);
        org.mockito.asm.Type type76 = org.mockito.cglib.core.TypeUtils.getBoxedType(type74);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type76);
        org.mockito.asm.Type[] typeArray78 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type76);
        org.mockito.asm.Type type80 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str81 = org.mockito.cglib.core.TypeUtils.getClassName(type80);
        org.mockito.asm.Type type82 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type80);
        java.lang.String str83 = org.mockito.cglib.core.TypeUtils.getClassName(type82);
        java.lang.String str84 = org.mockito.cglib.core.TypeUtils.getClassName(type82);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray45, type82);
        boolean boolean86 = org.mockito.cglib.core.TypeUtils.isArray(type82);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray20, type82);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type88 = org.mockito.cglib.core.TypeUtils.getComponentType(type82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(signature12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(signature43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "java.lang.hi!" + "'", str55, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang.hi!" + "'", str64, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "java.lang.hi!" + "'", str67, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(typeArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertNotNull(typeArray78);
        org.junit.Assert.assertNotNull(type80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(type82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(typeArray87);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isInterface((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("Java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.Class<?> wildcardClass6 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang" + "'", str8, "java.lang");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray11);
        java.lang.String[] strArray14 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray17 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray14);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray12, typeArray18);
        int int20 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray19);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.asm.Type[] typeArray41 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray41);
        java.lang.String[] strArray43 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isStatic((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type3);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type5);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getComponentType(type5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.mockito.asm.Type[] typeArray0 = null;
        java.lang.String[] strArray2 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        java.lang.Class<?> wildcardClass8 = typeArray6.getClass();
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature11 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray10);
        java.lang.Class<?> wildcardClass12 = typeArray10.getClass();
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature15 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray14);
        java.lang.Class<?> wildcardClass16 = typeArray14.getClass();
        org.mockito.asm.Type[] typeArray18 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature19 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray18);
        java.lang.Class<?> wildcardClass20 = typeArray18.getClass();
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature23 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray22);
        java.lang.Class<?> wildcardClass24 = typeArray22.getClass();
        java.lang.Class[] classArray25 = new java.lang.Class[] { wildcardClass4, wildcardClass8, wildcardClass12, wildcardClass16, wildcardClass20, wildcardClass24 };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray28 = org.mockito.cglib.core.TypeUtils.getTypes(classArray25);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray31 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray30);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray28, typeArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray0, typeArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(signature11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(signature15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(signature19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(signature23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(classArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type31);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.getBoxedType(type39);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isPrivate(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java.lang.java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isSynthetic(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isPrimitive(type4);
        java.lang.Class<?> wildcardClass9 = type4.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!" + "'", str1, "java$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type L; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.getPackageName("java$242Elang");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$24242Elang$24242EJava$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("Java.lang.java$2424242Elang$2424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$2Elang$2Ejava$242424242Elang$242424242Ehi!" + "'", str1, "Java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2Elang$2Ejava$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        boolean boolean9 = org.mockito.cglib.core.TypeUtils.isArray(type7);
        org.mockito.asm.Type[] typeArray10 = new org.mockito.asm.Type[] { type1, type4, type7 };
        java.lang.String[] strArray11 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray10);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int14 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str20 = org.mockito.cglib.core.TypeUtils.getClassName(type19);
        boolean boolean21 = org.mockito.cglib.core.TypeUtils.isArray(type19);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type13, type16, type19 };
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray22);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray10, typeArray22);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        boolean boolean28 = org.mockito.cglib.core.TypeUtils.isArray(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getBoxedType(type26);
        int int30 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type26);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        java.lang.String str33 = org.mockito.cglib.core.TypeUtils.getClassName(type26);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getPackageName(type26);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        org.mockito.asm.Type[] typeArray36 = org.mockito.cglib.core.TypeUtils.add(typeArray10, type26);
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type26);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.lang.hi!" + "'", str20, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "java.lang.hi!" + "'", str33, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang" + "'", str34, "java.lang");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.upperFirst("Java$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Java$24242424242Elang$24242424242Ehi!" + "'", str1, "Java$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int int1 = org.mockito.cglib.core.TypeUtils.DCONST((double) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2Ehi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava$2Elang$2Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang" + "'", str2, "java.lang");
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int4 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type3, type6, type9 };
        java.lang.String[] strArray13 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.cglib.core.Signature signature14 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray12);
        java.lang.String[] strArray20 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray20);
        org.mockito.asm.Type[] typeArray23 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray23);
        int int25 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type28 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type28);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type28);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray12, type30);
        java.lang.Class<?> wildcardClass32 = typeArray12.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(signature14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        int int20 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type1, type6, type8, type12, type17 };
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type27);
        java.lang.Class<?> wildcardClass31 = typeArray21.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java.lang.hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isArray(type4);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type LJava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type18);
        java.lang.String[] strArray26 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray26);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray27, typeArray29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type32);
        org.mockito.asm.Type type35 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str36 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type35);
        org.mockito.asm.Type type38 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str39 = org.mockito.cglib.core.TypeUtils.getClassName(type38);
        boolean boolean40 = org.mockito.cglib.core.TypeUtils.isArray(type38);
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] { type32, type35, type38 };
        java.lang.String[] strArray42 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray41);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature45 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray44);
        java.lang.String[] strArray46 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray44);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray41, typeArray44);
        org.mockito.asm.Type[] typeArray48 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray47);
        int int49 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        int int50 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray47);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray47);
        java.lang.String[] strArray55 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray55);
        org.mockito.asm.Type[] typeArray58 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray59 = org.mockito.cglib.core.TypeUtils.add(typeArray56, typeArray58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.getClassName(type61);
        java.lang.String str63 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type61);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type66 = org.mockito.cglib.core.TypeUtils.getBoxedType(type65);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str69 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type68);
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getClassName(type68);
        org.mockito.asm.Type type72 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str73 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type72);
        java.lang.String str74 = org.mockito.cglib.core.TypeUtils.getClassName(type72);
        int int75 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type72);
        org.mockito.asm.Type type77 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isPrimitive(type77);
        int int79 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        int int80 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type77);
        org.mockito.asm.Type[] typeArray81 = new org.mockito.asm.Type[] { type61, type66, type68, type72, type77 };
        org.mockito.asm.Type type83 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.getBoxedType(type83);
        org.mockito.asm.Type[] typeArray85 = org.mockito.cglib.core.TypeUtils.add(typeArray81, type83);
        java.lang.String str86 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type83);
        org.mockito.asm.Type[] typeArray87 = org.mockito.cglib.core.TypeUtils.add(typeArray56, type83);
        org.mockito.asm.Type type89 = org.mockito.cglib.core.TypeUtils.getType("java$2Elang");
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray87, type89);
        org.mockito.asm.Type type92 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$242Elang$242Ehi!");
        org.mockito.asm.Type[] typeArray93 = org.mockito.cglib.core.TypeUtils.add(typeArray87, type92);
        java.lang.String str94 = org.mockito.cglib.core.TypeUtils.getClassName(type92);
        org.mockito.asm.Type[] typeArray95 = org.mockito.cglib.core.TypeUtils.add(typeArray47, type92);
        org.mockito.cglib.core.Signature signature96 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.lang.hi!" + "'", str36, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "java.lang.hi!" + "'", str39, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(signature45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(typeArray59);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "java.lang.hi!" + "'", str63, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "java.lang.hi!" + "'", str69, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "java.lang.hi!" + "'", str70, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "java.lang.hi!" + "'", str73, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang.hi!" + "'", str74, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(type77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(type83);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertNotNull(typeArray85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(type89);
        org.junit.Assert.assertNotNull(typeArray90);
        org.junit.Assert.assertNotNull(type92);
        org.junit.Assert.assertNotNull(typeArray93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "java$242Elang$242Ehi!" + "'", str94, "java$242Elang$242Ehi!");
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertNotNull(signature96);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature10 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type12);
        org.mockito.asm.Type[] typeArray16 = org.mockito.cglib.core.TypeUtils.add(typeArray6, typeArray9);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        org.mockito.asm.Type[] typeArray22 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type18);
        int int23 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray22);
        java.lang.String[] strArray25 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray26 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray25);
        java.lang.Class<?> wildcardClass27 = strArray25.getClass();
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass30 = type29.getClass();
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.fromInternalName("");
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature36 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray35);
        java.lang.Class<?> wildcardClass37 = typeArray35.getClass();
        java.lang.String[] strArray39 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray39);
        java.lang.Class<?> wildcardClass41 = strArray39.getClass();
        java.lang.Class[] classArray42 = new java.lang.Class[] { wildcardClass27, wildcardClass30, wildcardClass33, wildcardClass37, wildcardClass41 };
        org.mockito.asm.Type[] typeArray43 = org.mockito.cglib.core.TypeUtils.getTypes(classArray42);
        org.mockito.asm.Type[] typeArray44 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang");
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray22, typeArray46);
        java.lang.String[] strArray48 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray46);
        java.lang.Class<?> wildcardClass49 = strArray48.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(signature10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(typeArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(signature36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type4);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type7);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        boolean boolean10 = org.mockito.cglib.core.TypeUtils.isArray(type9);
        boolean boolean11 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isPrimitive(type9);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("java$2424242Elang$2424242EJava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("java$2424242Elang$2424242Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type17);
        java.lang.String[] strArray20 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray19);
        org.mockito.asm.Type type22 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str23 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        boolean boolean24 = org.mockito.cglib.core.TypeUtils.isArray(type22);
        java.lang.String str25 = org.mockito.cglib.core.TypeUtils.getClassName(type22);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getPackageName(type22);
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.getPackageName(type22);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getPackageName(type22);
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type22);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray19, type22);
        java.lang.String[] strArray34 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray37);
        org.mockito.asm.Type type40 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int41 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type type46 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str47 = org.mockito.cglib.core.TypeUtils.getClassName(type46);
        boolean boolean48 = org.mockito.cglib.core.TypeUtils.isArray(type46);
        org.mockito.asm.Type[] typeArray49 = new org.mockito.asm.Type[] { type40, type43, type46 };
        java.lang.String[] strArray50 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray49);
        org.mockito.asm.Type[] typeArray52 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature53 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray52);
        java.lang.String[] strArray54 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray52);
        org.mockito.asm.Type[] typeArray55 = org.mockito.cglib.core.TypeUtils.add(typeArray49, typeArray52);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray38, typeArray55);
        org.mockito.asm.Type type58 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int59 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type58);
        org.mockito.asm.Type type61 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str62 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type61);
        org.mockito.asm.Type type64 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str65 = org.mockito.cglib.core.TypeUtils.getClassName(type64);
        boolean boolean66 = org.mockito.cglib.core.TypeUtils.isArray(type64);
        org.mockito.asm.Type[] typeArray67 = new org.mockito.asm.Type[] { type58, type61, type64 };
        java.lang.String[] strArray68 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray67);
        org.mockito.asm.Type type70 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int71 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type70);
        org.mockito.asm.Type type73 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str74 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type73);
        org.mockito.asm.Type type76 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str77 = org.mockito.cglib.core.TypeUtils.getClassName(type76);
        boolean boolean78 = org.mockito.cglib.core.TypeUtils.isArray(type76);
        org.mockito.asm.Type[] typeArray79 = new org.mockito.asm.Type[] { type70, type73, type76 };
        java.lang.String[] strArray80 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray79);
        org.mockito.asm.Type[] typeArray81 = org.mockito.cglib.core.TypeUtils.add(typeArray67, typeArray79);
        org.mockito.asm.Type[] typeArray82 = org.mockito.cglib.core.TypeUtils.add(typeArray55, typeArray81);
        org.mockito.asm.Type type84 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean85 = org.mockito.cglib.core.TypeUtils.isPrimitive(type84);
        org.mockito.asm.Type type86 = org.mockito.cglib.core.TypeUtils.getBoxedType(type84);
        org.mockito.asm.Type type87 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type86);
        org.mockito.asm.Type[] typeArray88 = org.mockito.cglib.core.TypeUtils.add(typeArray55, type86);
        boolean boolean89 = org.mockito.cglib.core.TypeUtils.isArray(type86);
        org.mockito.asm.Type[] typeArray90 = org.mockito.cglib.core.TypeUtils.add(typeArray30, type86);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.lang.hi!" + "'", str23, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.lang.hi!" + "'", str25, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "java.lang" + "'", str26, "java.lang");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang" + "'", str27, "java.lang");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang" + "'", str28, "java.lang");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "java.lang.hi!" + "'", str47, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(signature53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(typeArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "java.lang.hi!" + "'", str62, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "java.lang.hi!" + "'", str65, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(type73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "java.lang.hi!" + "'", str74, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "java.lang.hi!" + "'", str77, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(type84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(type86);
        org.junit.Assert.assertNotNull(type87);
        org.junit.Assert.assertNotNull(typeArray88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(typeArray90);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        boolean boolean5 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Lhi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        int int20 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type1, type6, type8, type12, type17 };
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        java.lang.String str26 = org.mockito.cglib.core.TypeUtils.getClassName(type23);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getBoxedType(type14);
        int int18 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type17);
        org.mockito.cglib.core.Signature signature20 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(typeArray19);
        org.junit.Assert.assertNotNull(signature20);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2EJava$242Elang$242Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        int int5 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type3);
        boolean boolean6 = org.mockito.cglib.core.TypeUtils.isPrimitive(type3);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type3);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.getComponentType(type3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java$24242424242424242Elang$24242424242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java" + "'", str2, "Java");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Hi!");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature5 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray4);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.getClassName(type7);
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type7);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type7);
        java.lang.Class<?> wildcardClass11 = typeArray10.getClass();
        java.lang.Class[] classArray12 = new java.lang.Class[] { wildcardClass2, wildcardClass11 };
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        org.mockito.asm.Type[] typeArray15 = org.mockito.cglib.core.TypeUtils.getTypes(classArray12);
        java.lang.String[] strArray16 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray15);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(signature5);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.Class<?> wildcardClass7 = type1.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java$2Elang$2Ehi!");
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        org.mockito.asm.Type type7 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.getBoxedType(type7);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type10);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.getClassName(type10);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type14);
        int int17 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type14);
        org.mockito.asm.Type type19 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isPrimitive(type19);
        int int21 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        int int22 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type19);
        org.mockito.asm.Type[] typeArray23 = new org.mockito.asm.Type[] { type3, type8, type10, type14, type19 };
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.getBoxedType(type25);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray23, type25);
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type25);
        org.mockito.asm.Type[] typeArray29 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type25);
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean32 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        java.lang.String str35 = org.mockito.cglib.core.TypeUtils.getClassName(type31);
        boolean boolean36 = org.mockito.cglib.core.TypeUtils.isPrimitive(type31);
        java.lang.String str37 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        int int39 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray29);
        java.lang.Class<?> wildcardClass40 = typeArray29.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "java.lang.hi!" + "'", str35, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "java.lang.hi!" + "'", str37, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        java.lang.String[] strArray2 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature7 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type9);
        org.mockito.asm.Type[] typeArray13 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray12);
        org.mockito.asm.Type[] typeArray14 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray13);
        int int15 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2Ehi!");
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.getBoxedType(type17);
        org.mockito.asm.Type[] typeArray19 = org.mockito.cglib.core.TypeUtils.add(typeArray14, type17);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(signature7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(typeArray19);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type30);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.getClassName(type33);
        boolean boolean35 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.mockito.asm.Type[] typeArray36 = new org.mockito.asm.Type[] { type27, type30, type33 };
        java.lang.String[] strArray37 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray36);
        org.mockito.asm.Type type39 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int40 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type39);
        org.mockito.asm.Type type42 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str43 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type42);
        org.mockito.asm.Type type45 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str46 = org.mockito.cglib.core.TypeUtils.getClassName(type45);
        boolean boolean47 = org.mockito.cglib.core.TypeUtils.isArray(type45);
        org.mockito.asm.Type[] typeArray48 = new org.mockito.asm.Type[] { type39, type42, type45 };
        java.lang.String[] strArray49 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray48);
        org.mockito.asm.Type[] typeArray50 = org.mockito.cglib.core.TypeUtils.add(typeArray36, typeArray48);
        org.mockito.asm.Type[] typeArray51 = org.mockito.cglib.core.TypeUtils.add(typeArray24, typeArray50);
        org.mockito.asm.Type type53 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean54 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        org.mockito.asm.Type type55 = org.mockito.cglib.core.TypeUtils.getBoxedType(type53);
        java.lang.String str56 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        java.lang.String str57 = org.mockito.cglib.core.TypeUtils.getClassName(type53);
        boolean boolean58 = org.mockito.cglib.core.TypeUtils.isPrimitive(type53);
        java.lang.String str59 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type53);
        org.mockito.asm.Type[] typeArray60 = org.mockito.cglib.core.TypeUtils.add(typeArray50, type53);
        org.mockito.asm.Type type62 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type63 = org.mockito.cglib.core.TypeUtils.getBoxedType(type62);
        java.lang.String str64 = org.mockito.cglib.core.TypeUtils.getPackageName(type63);
        org.mockito.asm.Type type65 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type63);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray60, type65);
        java.lang.String[] strArray67 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray60);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "java.lang.hi!" + "'", str34, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "java.lang.hi!" + "'", str43, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "java.lang.hi!" + "'", str46, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertNotNull(type53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "java.lang.hi!" + "'", str56, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "java.lang.hi!" + "'", str57, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "java.lang.hi!" + "'", str59, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertNotNull(type62);
        org.junit.Assert.assertNotNull(type63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.lang" + "'", str64, "java.lang");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("Java$24242424242424242Elang$24242424242424242Ehi!");
        org.junit.Assert.assertNotNull(typeArray1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2Ejava$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        boolean boolean12 = org.mockito.cglib.core.TypeUtils.isArray(type11);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        boolean boolean1 = org.mockito.cglib.core.TypeUtils.isAbstract((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str3 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.getBoxedType(type5);
        org.mockito.asm.Type type8 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str9 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type8);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type8);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        java.lang.String str14 = org.mockito.cglib.core.TypeUtils.getClassName(type12);
        int int15 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean18 = org.mockito.cglib.core.TypeUtils.isPrimitive(type17);
        int int19 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        int int20 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type17);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type1, type6, type8, type12, type17 };
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type24 = org.mockito.cglib.core.TypeUtils.getBoxedType(type23);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type23);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.fromInternalName("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type27);
        java.lang.String[] strArray34 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray34);
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray37);
        org.mockito.asm.Type[] typeArray40 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature41 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray40);
        org.mockito.asm.Type type43 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str44 = org.mockito.cglib.core.TypeUtils.getClassName(type43);
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type43);
        org.mockito.asm.Type[] typeArray46 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type43);
        org.mockito.asm.Type[] typeArray47 = org.mockito.cglib.core.TypeUtils.add(typeArray37, typeArray40);
        org.mockito.asm.Type type49 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str50 = org.mockito.cglib.core.TypeUtils.getClassName(type49);
        boolean boolean51 = org.mockito.cglib.core.TypeUtils.isArray(type49);
        java.lang.String str52 = org.mockito.cglib.core.TypeUtils.getClassName(type49);
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.add(typeArray40, type49);
        int int54 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray53);
        org.mockito.cglib.core.Signature signature55 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray53);
        org.mockito.asm.Type[] typeArray56 = org.mockito.cglib.core.TypeUtils.add(typeArray30, typeArray53);
        org.mockito.cglib.core.Signature signature57 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray56);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.lang.hi!" + "'", str3, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.lang.hi!" + "'", str9, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.lang.hi!" + "'", str14, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(signature41);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "java.lang.hi!" + "'", str44, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "java.lang.hi!" + "'", str50, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "java.lang.hi!" + "'", str52, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(signature55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(signature57);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        int int8 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray6);
        org.mockito.asm.Type type10 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getBoxedType(type10);
        org.mockito.asm.Type[] typeArray12 = org.mockito.cglib.core.TypeUtils.add(typeArray6, type11);
        int int13 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        int int14 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        int int15 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        java.lang.String[] strArray41 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        java.lang.Class<?> wildcardClass43 = strArray41.getClass();
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray45);
        java.lang.Class<?> wildcardClass47 = typeArray45.getClass();
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray49);
        java.lang.Class<?> wildcardClass51 = typeArray49.getClass();
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature54 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray53);
        java.lang.Class<?> wildcardClass55 = typeArray53.getClass();
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature58 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray57);
        java.lang.Class<?> wildcardClass59 = typeArray57.getClass();
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature62 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray61);
        java.lang.Class<?> wildcardClass63 = typeArray61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass43, wildcardClass47, wildcardClass51, wildcardClass55, wildcardClass59, wildcardClass63 };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.getTypes(classArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray65);
        java.lang.String[] strArray67 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray35);
        org.mockito.asm.Type[] typeArray68 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.mockito.asm.Type[] typeArray69 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray67);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(signature50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(signature54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(signature58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(signature62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray69);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("java.lang.hi!");
        org.mockito.asm.Type[] typeArray3 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature4 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray3);
        org.mockito.asm.Type type6 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str7 = org.mockito.cglib.core.TypeUtils.getClassName(type6);
        java.lang.String str8 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type6);
        org.mockito.asm.Type[] typeArray9 = org.mockito.cglib.core.TypeUtils.add(typeArray3, type6);
        org.mockito.asm.Type[] typeArray10 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int13 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type15);
        org.mockito.asm.Type type18 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str19 = org.mockito.cglib.core.TypeUtils.getClassName(type18);
        boolean boolean20 = org.mockito.cglib.core.TypeUtils.isArray(type18);
        org.mockito.asm.Type[] typeArray21 = new org.mockito.asm.Type[] { type12, type15, type18 };
        java.lang.String[] strArray22 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature25 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray24);
        java.lang.String[] strArray26 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray24);
        org.mockito.asm.Type[] typeArray27 = org.mockito.cglib.core.TypeUtils.add(typeArray21, typeArray24);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.getType("java.lang");
        org.mockito.asm.Type[] typeArray30 = org.mockito.cglib.core.TypeUtils.add(typeArray21, type29);
        org.mockito.asm.Type[] typeArray31 = org.mockito.cglib.core.TypeUtils.add(typeArray9, type29);
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        org.mockito.asm.Type type33 = org.mockito.cglib.core.TypeUtils.getBoxedType(type29);
        boolean boolean34 = org.mockito.cglib.core.TypeUtils.isArray(type33);
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertNotNull(signature4);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "java.lang.hi!" + "'", str7, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.lang.hi!" + "'", str8, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.lang.hi!" + "'", str19, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(signature25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$242Elang$242Ejava$24242424242Elang$24242424242Ehi!");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str1 = org.mockito.cglib.core.TypeUtils.escapeType("java$242424242Elang$242424242Ehi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java$24242424242Elang$24242424242Ehi!" + "'", str1, "java$24242424242Elang$24242424242Ehi!");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$242Elang$242EJava$24242Elang$24242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isPrimitive(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type3);
        java.lang.Class<?> wildcardClass6 = type3.getClass();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type2);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type3);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.getPackageName(type1);
        int int7 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        boolean boolean8 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        int int9 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str12 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang" + "'", str5, "java.lang");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang" + "'", str6, "java.lang");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "java.lang.hi!" + "'", str12, "java.lang.hi!");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$242Elang$242Ehi!");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/Java$242Elang$242Ehi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseConstructor("Java$24242424242424242Elang$24242424242424242Ehi!");
        org.junit.Assert.assertNotNull(signature1);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("Java$242Elang$242Ehi!");
        boolean boolean2 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str10 = org.mockito.cglib.core.TypeUtils.getClassName(type9);
        java.lang.String str11 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type9);
        org.mockito.asm.Type type13 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.getBoxedType(type13);
        org.mockito.asm.Type type16 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str17 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type16);
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type16);
        org.mockito.asm.Type type20 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str21 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type20);
        java.lang.String str22 = org.mockito.cglib.core.TypeUtils.getClassName(type20);
        int int23 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type20);
        org.mockito.asm.Type type25 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        boolean boolean26 = org.mockito.cglib.core.TypeUtils.isPrimitive(type25);
        int int27 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        int int28 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type25);
        org.mockito.asm.Type[] typeArray29 = new org.mockito.asm.Type[] { type9, type14, type16, type20, type25 };
        org.mockito.asm.Type type31 = org.mockito.cglib.core.TypeUtils.getType("hi!");
        org.mockito.asm.Type type32 = org.mockito.cglib.core.TypeUtils.getBoxedType(type31);
        org.mockito.asm.Type[] typeArray33 = org.mockito.cglib.core.TypeUtils.add(typeArray29, type31);
        java.lang.String str34 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type31);
        org.mockito.asm.Type[] typeArray35 = org.mockito.cglib.core.TypeUtils.add(typeArray4, type31);
        java.lang.Class[] classArray36 = new java.lang.Class[] {};
        org.mockito.asm.Type[] typeArray37 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.getTypes(classArray36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray38);
        java.lang.String[] strArray41 = new java.lang.String[] { "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray42 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray41);
        java.lang.Class<?> wildcardClass43 = strArray41.getClass();
        org.mockito.asm.Type[] typeArray45 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature46 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray45);
        java.lang.Class<?> wildcardClass47 = typeArray45.getClass();
        org.mockito.asm.Type[] typeArray49 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature50 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray49);
        java.lang.Class<?> wildcardClass51 = typeArray49.getClass();
        org.mockito.asm.Type[] typeArray53 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature54 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray53);
        java.lang.Class<?> wildcardClass55 = typeArray53.getClass();
        org.mockito.asm.Type[] typeArray57 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature58 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray57);
        java.lang.Class<?> wildcardClass59 = typeArray57.getClass();
        org.mockito.asm.Type[] typeArray61 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature62 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray61);
        java.lang.Class<?> wildcardClass63 = typeArray61.getClass();
        java.lang.Class[] classArray64 = new java.lang.Class[] { wildcardClass43, wildcardClass47, wildcardClass51, wildcardClass55, wildcardClass59, wildcardClass63 };
        org.mockito.asm.Type[] typeArray65 = org.mockito.cglib.core.TypeUtils.getTypes(classArray64);
        org.mockito.asm.Type[] typeArray66 = org.mockito.cglib.core.TypeUtils.add(typeArray35, typeArray65);
        org.mockito.asm.Type type68 = org.mockito.cglib.core.TypeUtils.fromInternalName("Java.lang.Java$2Elang$2Ehi!");
        org.mockito.asm.Type type69 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type68);
        java.lang.String str70 = org.mockito.cglib.core.TypeUtils.getPackageName(type68);
        boolean boolean71 = org.mockito.cglib.core.TypeUtils.isPrimitive(type68);
        org.mockito.asm.Type[] typeArray72 = org.mockito.cglib.core.TypeUtils.add(typeArray35, type68);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.lang.hi!" + "'", str10, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "java.lang.hi!" + "'", str11, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.lang.hi!" + "'", str17, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "java.lang.hi!" + "'", str21, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "java.lang.hi!" + "'", str22, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(classArray36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(signature46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(typeArray49);
        org.junit.Assert.assertNotNull(signature50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(signature54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(typeArray57);
        org.junit.Assert.assertNotNull(signature58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(signature62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(classArray64);
        org.junit.Assert.assertNotNull(typeArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Java.lang" + "'", str70, "Java.lang");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(typeArray72);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        boolean boolean3 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        boolean boolean4 = org.mockito.cglib.core.TypeUtils.isArray(type1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type5 = org.mockito.cglib.core.TypeUtils.getComponentType(type1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.lang.hi!" + "'", str2, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.mockito.asm.Type[] typeArray1 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature2 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray1);
        org.mockito.asm.Type type4 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str5 = org.mockito.cglib.core.TypeUtils.getClassName(type4);
        java.lang.String str6 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type4);
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray1, type4);
        java.lang.String[] strArray8 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        java.lang.String[] strArray9 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray1);
        org.mockito.asm.Type type11 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int12 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type11);
        org.mockito.asm.Type type14 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str15 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type14);
        org.mockito.asm.Type type17 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str18 = org.mockito.cglib.core.TypeUtils.getClassName(type17);
        boolean boolean19 = org.mockito.cglib.core.TypeUtils.isArray(type17);
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type11, type14, type17 };
        java.lang.String[] strArray21 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray20);
        org.mockito.asm.Type type23 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int24 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type23);
        org.mockito.asm.Type type26 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str27 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type26);
        org.mockito.asm.Type type29 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str30 = org.mockito.cglib.core.TypeUtils.getClassName(type29);
        boolean boolean31 = org.mockito.cglib.core.TypeUtils.isArray(type29);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type23, type26, type29 };
        java.lang.String[] strArray33 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray32);
        org.mockito.asm.Type[] typeArray34 = org.mockito.cglib.core.TypeUtils.add(typeArray20, typeArray32);
        org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.hi!");
        boolean boolean37 = org.mockito.cglib.core.TypeUtils.isPrimitive(type36);
        org.mockito.asm.Type[] typeArray38 = org.mockito.cglib.core.TypeUtils.add(typeArray32, type36);
        org.mockito.asm.Type[] typeArray39 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray32);
        org.mockito.asm.Type type41 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int42 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type41);
        org.mockito.asm.Type type44 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str45 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type44);
        org.mockito.asm.Type type47 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str48 = org.mockito.cglib.core.TypeUtils.getClassName(type47);
        boolean boolean49 = org.mockito.cglib.core.TypeUtils.isArray(type47);
        org.mockito.asm.Type[] typeArray50 = new org.mockito.asm.Type[] { type41, type44, type47 };
        java.lang.String[] strArray51 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray50);
        org.mockito.cglib.core.Signature signature52 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray50);
        int int53 = org.mockito.cglib.core.TypeUtils.getStackSize(typeArray50);
        org.mockito.asm.Type[] typeArray54 = org.mockito.cglib.core.TypeUtils.add(typeArray1, typeArray50);
        java.lang.Class<?> wildcardClass55 = typeArray54.getClass();
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertNotNull(signature2);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.lang.hi!" + "'", str5, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.lang.hi!" + "'", str6, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.hi!" + "'", str15, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.lang.hi!" + "'", str18, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.lang.hi!" + "'", str27, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "java.lang.hi!" + "'", str30, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(type41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "java.lang.hi!" + "'", str45, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "java.lang.hi!" + "'", str48, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(signature52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("Java$2Elang$2Ehi!");
        java.lang.String str2 = org.mockito.cglib.core.TypeUtils.getClassName(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Java$2Elang$2Ehi!" + "'", str2, "Java$2Elang$2Ehi!");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.parseType("java.lang.java$2Elang$2Ehi!");
        int int2 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type1);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.core.Signature signature1 = org.mockito.cglib.core.TypeUtils.parseSignature("Java$242424242424242Elang$242424242424242Ehi!");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.lang.String[] strArray3 = new java.lang.String[] { "java.lang.hi!", "", "java.lang.hi!" };
        org.mockito.asm.Type[] typeArray4 = org.mockito.cglib.core.TypeUtils.fromInternalNames(strArray3);
        org.mockito.asm.Type[] typeArray6 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.asm.Type[] typeArray7 = org.mockito.cglib.core.TypeUtils.add(typeArray4, typeArray6);
        org.mockito.asm.Type type9 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        int int10 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type9);
        org.mockito.asm.Type type12 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str13 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type12);
        org.mockito.asm.Type type15 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str16 = org.mockito.cglib.core.TypeUtils.getClassName(type15);
        boolean boolean17 = org.mockito.cglib.core.TypeUtils.isArray(type15);
        org.mockito.asm.Type[] typeArray18 = new org.mockito.asm.Type[] { type9, type12, type15 };
        java.lang.String[] strArray19 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray18);
        org.mockito.asm.Type[] typeArray21 = org.mockito.cglib.core.TypeUtils.parseTypes("hi!");
        org.mockito.cglib.core.Signature signature22 = org.mockito.cglib.core.TypeUtils.parseConstructor(typeArray21);
        java.lang.String[] strArray23 = org.mockito.cglib.core.TypeUtils.toInternalNames(typeArray21);
        org.mockito.asm.Type[] typeArray24 = org.mockito.cglib.core.TypeUtils.add(typeArray18, typeArray21);
        org.mockito.asm.Type[] typeArray25 = org.mockito.cglib.core.TypeUtils.add(typeArray7, typeArray24);
        org.mockito.asm.Type type27 = org.mockito.cglib.core.TypeUtils.parseType("hi!");
        java.lang.String str28 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        java.lang.String str29 = org.mockito.cglib.core.TypeUtils.getClassName(type27);
        org.mockito.asm.Type type30 = org.mockito.cglib.core.TypeUtils.getBoxedType(type27);
        java.lang.String str31 = org.mockito.cglib.core.TypeUtils.emulateClassGetName(type27);
        org.mockito.asm.Type[] typeArray32 = org.mockito.cglib.core.TypeUtils.add(typeArray25, type27);
        int int33 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        org.mockito.asm.Type type34 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type27);
        int int35 = org.mockito.cglib.core.TypeUtils.NEWARRAY(type27);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type36 = org.mockito.cglib.core.TypeUtils.getComponentType(type27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Type Ljava/lang/hi!; is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.lang.hi!" + "'", str13, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.lang.hi!" + "'", str16, "java.lang.hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(typeArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(signature22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "java.lang.hi!" + "'", str28, "java.lang.hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "java.lang.hi!" + "'", str29, "java.lang.hi!");
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "java.lang.hi!" + "'", str31, "java.lang.hi!");
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.mockito.asm.Type type1 = org.mockito.cglib.core.TypeUtils.getType("java.lang.hi!");
        org.mockito.asm.Type type2 = org.mockito.cglib.core.TypeUtils.getBoxedType(type1);
        org.mockito.asm.Type type3 = org.mockito.cglib.core.TypeUtils.getUnboxedType(type1);
        java.lang.String str4 = org.mockito.cglib.core.TypeUtils.getClassName(type3);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.lang.hi!" + "'", str4, "java.lang.hi!");
    }
}

