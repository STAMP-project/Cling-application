import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (short) -1, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = com.google.javascript.rhino.head.Decompiler.INITIAL_INDENT_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = com.google.javascript.rhino.head.Decompiler.ONLY_BODY_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = com.google.javascript.rhino.head.Decompiler.TO_SOURCE_FLAG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = com.google.javascript.rhino.head.Decompiler.CASE_GAP_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int0 = com.google.javascript.rhino.head.Decompiler.INDENT_GAP_PROP;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (short) 0, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.javascript.rhino.head.Decompiler decompiler0 = new com.google.javascript.rhino.head.Decompiler();
        java.lang.Class<?> wildcardClass1 = decompiler0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", 10, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", 0, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", 1, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) '#', uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (short) 100, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (byte) 1, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (byte) 100, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", 2, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (-1), uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (byte) 1, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (short) -1, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", 100, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (short) 100, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (byte) -1, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", 0, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (short) 1, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (short) 10, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (short) 0, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (short) 1, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", 1, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", 2, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (-1), uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (short) 10, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) ' ', uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) '#', uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) '4', uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (byte) 0, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", 10, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) 'a', uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", 100, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (byte) 10, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (byte) 10, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) ' ', uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", 3, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) '4', uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) 'a', uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", 3, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (byte) 100, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("", (int) (byte) -1, uintMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.google.javascript.rhino.head.UintMap uintMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = com.google.javascript.rhino.head.Decompiler.decompile("hi!", (int) (byte) 0, uintMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

