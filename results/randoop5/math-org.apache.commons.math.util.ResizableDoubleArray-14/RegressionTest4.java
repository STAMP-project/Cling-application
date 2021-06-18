import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1);
        resizableDoubleArray1.setExpansionMode(0);
        int int4 = resizableDoubleArray1.start();
        resizableDoubleArray1.contract();
        double[] doubleArray6 = resizableDoubleArray1.getElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setNumElements((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement((int) (byte) 0, (double) 10.0f);
        double double7 = resizableDoubleArray2.getElement(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) ' ');
        resizableDoubleArray0.discardFrontElements((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        int int9 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        int int11 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements(36);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.getNumElements();
        float float12 = resizableDoubleArray0.getContractionCriteria();
        int int13 = resizableDoubleArray0.getNumElements();
        float float14 = resizableDoubleArray0.getExpansionFactor();
        int int15 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.5f + "'", float12 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(10, (double) 36);
        double double9 = resizableDoubleArray0.addElementRolling((-1.0d));
        double double11 = resizableDoubleArray0.getElement((int) (byte) 10);
        double double13 = resizableDoubleArray0.addElementRolling((double) 97);
        double double15 = resizableDoubleArray0.addElementRolling((double) 36);
        resizableDoubleArray0.contract();
        int int17 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (byte) 10);
        int int16 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1);
        resizableDoubleArray1.setExpansionMode(0);
        resizableDoubleArray1.setContractionCriteria((float) 64);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.addElement(0.0d);
        resizableDoubleArray2.clear();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        float float8 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, 100.5f, 10.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(37);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, 36.5f, 100.5f);
        double[] doubleArray4 = resizableDoubleArray3.getValues();
        float float5 = resizableDoubleArray3.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.5f + "'", float5 == 100.5f);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements(68);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1, (float) 99, (float) 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) (short) 100);
        resizableDoubleArray0.addElement((double) 10.5f);
        double double22 = resizableDoubleArray0.addElementRolling((double) 35);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        int int5 = resizableDoubleArray1.getExpansionMode();
        int int6 = resizableDoubleArray1.start();
        float float7 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray8 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setElement((int) (short) 10, (double) 36.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 36.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 36.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setExpansionMode(0);
        resizableDoubleArray0.addElement((double) 35.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.contract();
        float float13 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setElement((int) 'a', (double) 10L);
        float float17 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 'a');
        int int3 = resizableDoubleArray2.getNumElements();
        double[] doubleArray4 = resizableDoubleArray2.getElements();
        double[] doubleArray5 = resizableDoubleArray2.getElements();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(99, (float) 3);
        resizableDoubleArray2.contract();
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setExpansionMode((int) (byte) 1);
        double double15 = resizableDoubleArray0.getElement(1);
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 36);
        double[] doubleArray19 = resizableDoubleArray0.getValues();
        int int20 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.setElement(32, (double) (short) 100);
        resizableDoubleArray1.setNumElements((int) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        int int3 = resizableDoubleArray2.getNumElements();
        resizableDoubleArray2.setElement(100, (double) (short) 1);
        double[] doubleArray7 = resizableDoubleArray2.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor((float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(64, (float) 103, 68.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        double double4 = resizableDoubleArray0.addElementRolling((double) 2.5f);
        int int5 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        float float7 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setExpansionMode(1);
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 97.0f);
        float float13 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.5f + "'", float13 == 2.5f);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, (float) ' ');
        int int3 = resizableDoubleArray2.start();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) (short) 10);
        int int12 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        int int9 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 3);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(33, 100.5f, (float) 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(101, (float) 100L);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        resizableDoubleArray2.clear();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        double double12 = resizableDoubleArray0.getElement((int) (byte) 0);
        resizableDoubleArray0.addElement((double) 36);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        int int15 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(102, 10.5f, (float) 35);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.setContractionCriteria((float) 'a');
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setExpansionFactor((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        int int8 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (short) 10);
        resizableDoubleArray2.addElement((double) 100L);
        float float5 = resizableDoubleArray2.getContractionCriteria();
        java.lang.Class<?> wildcardClass6 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.5f + "'", float5 == 10.5f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) '#', 35.0d);
        resizableDoubleArray0.setExpansionMode((int) (byte) 0);
        int int16 = resizableDoubleArray0.getExpansionMode();
        int int17 = resizableDoubleArray0.getNumElements();
        float float18 = resizableDoubleArray0.getExpansionFactor();
        java.lang.Class<?> wildcardClass19 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        double double6 = resizableDoubleArray1.addElementRolling((double) 100.0f);
        resizableDoubleArray1.clear();
        double[] doubleArray8 = resizableDoubleArray1.getValues();
        double[] doubleArray9 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.addElement(0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 10.0f);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(101, 100.0f, 4.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        int int10 = resizableDoubleArray0.getNumElements();
        double double12 = resizableDoubleArray0.getElement((int) '#');
        double double14 = resizableDoubleArray0.addElementRolling((double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10);
        resizableDoubleArray2.setExpansionMode((int) (short) 0);
        int int5 = resizableDoubleArray2.start();
        resizableDoubleArray2.setNumElements((int) (byte) 100);
        double double9 = resizableDoubleArray2.addElementRolling((double) (-1L));
        float float10 = resizableDoubleArray2.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(4);
        double[] doubleArray2 = resizableDoubleArray1.getElements();
        int int3 = resizableDoubleArray1.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(32, 0.0f, (float) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.getNumElements();
        float float9 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setExpansionFactor(2.5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setContractionCriteria((float) '4');
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setExpansionMode((int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(103, 36.0f, (float) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.start();
        double double14 = resizableDoubleArray0.addElementRolling((double) (short) 0);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0]");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int9 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        double double12 = resizableDoubleArray0.addElementRolling((double) 100.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setContractionCriteria((float) 99);
        resizableDoubleArray0.setContractionCriteria(2.5f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        float float10 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(68, 68.5f, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.discardFrontElements((int) (short) 10);
        resizableDoubleArray0.setElement(68, (double) 100.0f);
        float float14 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 68);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray2.getElement(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setContractionCriteria(100.5f);
        int int11 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 36.5f);
        double[] doubleArray14 = resizableDoubleArray0.getElements();
        double[] doubleArray15 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 36.5]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setContractionCriteria(100.5f);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        java.lang.Class<?> wildcardClass12 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.5f + "'", float11 == 100.5f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) ' ', (float) 35);
        double double5 = resizableDoubleArray3.addElementRolling((double) 4);
        double[] doubleArray6 = resizableDoubleArray3.getValues();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        double double7 = resizableDoubleArray0.addElementRolling((double) 1);
        float float8 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement((double) 2.5f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) ' ', (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, 100.0d);
        int int16 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setElement((int) (short) 0, (double) 64);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, 100.0d);
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        double double11 = resizableDoubleArray0.getElement((int) (short) 10);
        resizableDoubleArray0.discardFrontElements(37);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 1, 35.0d);
        float float16 = resizableDoubleArray0.getContractionCriteria();
        float float17 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        double[] doubleArray15 = resizableDoubleArray0.getValues();
        java.lang.Class<?> wildcardClass16 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(4);
        resizableDoubleArray1.addElement((double) 'a');
        resizableDoubleArray1.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        resizableDoubleArray2.setNumElements(10);
        resizableDoubleArray2.discardFrontElements(2);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        int int7 = resizableDoubleArray0.getExpansionMode();
        int int8 = resizableDoubleArray0.getNumElements();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) 33);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 33.0]");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray2.getElement((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 97 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        float float13 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        int int12 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement(11, (double) (byte) 100);
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        int int13 = resizableDoubleArray0.start();
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        int int15 = resizableDoubleArray0.getNumElements();
        double double17 = resizableDoubleArray0.addElementRolling(1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) 64, 36.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.discardFrontElements((int) (short) 10);
        resizableDoubleArray0.setContractionCriteria((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.setElement(32, (double) (short) 100);
        int int7 = resizableDoubleArray1.start();
        double[] doubleArray8 = resizableDoubleArray1.getValues();
        int int9 = resizableDoubleArray1.getNumElements();
        int int10 = resizableDoubleArray1.getExpansionMode();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 33 + "'", int9 == 33);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 37);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray2.getElement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 0 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.contract();
        int int17 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) 0);
        double double14 = resizableDoubleArray0.addElementRolling((double) 32);
        resizableDoubleArray0.setElement(100, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        int int10 = resizableDoubleArray0.getNumElements();
        double double12 = resizableDoubleArray0.getElement((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.addElement((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 10);
        int int3 = resizableDoubleArray2.getNumElements();
        float float4 = resizableDoubleArray2.getContractionCriteria();
        resizableDoubleArray2.setElement(0, 0.0d);
        int int8 = resizableDoubleArray2.getExpansionMode();
        int int9 = resizableDoubleArray2.getExpansionMode();
        resizableDoubleArray2.setNumElements(35);
        float float12 = resizableDoubleArray2.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.5f + "'", float4 == 10.5f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.5f + "'", float12 == 10.5f);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(101, 32.0f, 100.5f);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray5 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        double[] doubleArray4 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.clear();
        double[] doubleArray6 = resizableDoubleArray2.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.contract();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements(97);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(3, (float) (byte) 100, 2.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement(0, 1.0d);
        float float6 = resizableDoubleArray2.getContractionCriteria();
        resizableDoubleArray2.setExpansionFactor((float) 11);
        float float9 = resizableDoubleArray2.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.5f + "'", float6 == 100.5f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.5f + "'", float9 == 100.5f);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setElement(102, (-1.0d));
        double double11 = resizableDoubleArray0.getElement(0);
        resizableDoubleArray0.addElement((double) 97.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(36, (float) 10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        int int13 = resizableDoubleArray0.start();
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        float float3 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray4 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.setContractionCriteria((float) (short) 10);
        int int8 = resizableDoubleArray1.start();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = resizableDoubleArray1.getElement(102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 102 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        double double9 = resizableDoubleArray0.getElement(0);
        resizableDoubleArray0.setContractionCriteria((float) 36);
        int int12 = resizableDoubleArray0.getExpansionMode();
        double double14 = resizableDoubleArray0.addElementRolling((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        int int13 = resizableDoubleArray0.start();
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(35);
        resizableDoubleArray0.setNumElements((int) 'a');
        resizableDoubleArray0.setNumElements(36);
        resizableDoubleArray0.setExpansionMode(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(97, (float) 4);
        resizableDoubleArray2.contract();
        resizableDoubleArray2.setNumElements((int) '#');
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((-1), 2.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(4, (float) 102);
        int int3 = resizableDoubleArray2.getExpansionMode();
        int int4 = resizableDoubleArray2.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setContractionCriteria((float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setElement((int) (short) 10, 100.0d);
        resizableDoubleArray0.setContractionCriteria(102.0f);
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        int int5 = resizableDoubleArray1.getExpansionMode();
        int int6 = resizableDoubleArray1.start();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.setElement(10, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 101);
        int int15 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.setContractionCriteria((float) (byte) 10);
        double double9 = resizableDoubleArray0.addElementRolling((double) 100.5f);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = resizableDoubleArray0.getElement(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 97 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(99, (float) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) -1, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.setElement((int) (byte) 10, (double) (-1.0f));
        int int6 = resizableDoubleArray1.start();
        double double8 = resizableDoubleArray1.addElementRolling((-1.0d));
        resizableDoubleArray1.setNumElements((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        resizableDoubleArray0.contract();
        double double9 = resizableDoubleArray0.addElementRolling((double) 37);
        int int10 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.start();
        int int3 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement(1.0d);
        resizableDoubleArray0.clear();
        int int7 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(102, 32.0f, (-1.0f), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 4, (float) 100L, 0);
        float float5 = resizableDoubleArray4.getExpansionFactor();
        resizableDoubleArray4.setContractionCriteria((float) (short) 10);
        resizableDoubleArray4.clear();
        double double10 = resizableDoubleArray4.addElementRolling((double) '4');
        resizableDoubleArray4.discardFrontElements(0);
        resizableDoubleArray4.contract();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 4.0f + "'", float5 == 4.0f);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100);
        resizableDoubleArray1.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setContractionCriteria(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement(0, (double) (-1L));
        int int15 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements(52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) (short) 1, (-1.0f), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 100.0f, (float) 35, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.start();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', (float) 97);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        double double5 = resizableDoubleArray2.addElementRolling((double) 2.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setContractionCriteria((float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(33, (float) 37, (float) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', (float) 97);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(101, 102.5f, (float) (short) 100, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, 2.0f);
        int int3 = resizableDoubleArray2.getExpansionMode();
        resizableDoubleArray2.clear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        double double15 = resizableDoubleArray0.getElement((int) (short) 10);
        resizableDoubleArray0.addElement((double) 35);
        double double19 = resizableDoubleArray0.getElement((int) (byte) 100);
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 10);
        int int3 = resizableDoubleArray2.getNumElements();
        float float4 = resizableDoubleArray2.getContractionCriteria();
        resizableDoubleArray2.setElement(0, 0.0d);
        resizableDoubleArray2.setNumElements(68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.5f + "'", float4 == 10.5f);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(33, (double) (short) 1);
        resizableDoubleArray0.addElement((double) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(99, (float) 10L, 10.5f);
        resizableDoubleArray3.contract();
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0, (float) 1L, (float) 4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10);
        resizableDoubleArray2.setNumElements(36);
        resizableDoubleArray2.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.discardFrontElements(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        int int9 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.start();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        double double4 = resizableDoubleArray0.addElementRolling((double) 2.5f);
        resizableDoubleArray0.setElement(102, (double) 101);
        resizableDoubleArray0.clear();
        java.lang.Class<?> wildcardClass9 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(101);
        resizableDoubleArray0.setElement(36, (double) 68);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 68.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        float float10 = resizableDoubleArray0.getExpansionFactor();
        double double12 = resizableDoubleArray0.addElementRolling((double) 10.5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(52);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.setContractionCriteria((float) (byte) 10);
        double double9 = resizableDoubleArray0.addElementRolling((double) 100.5f);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.5]");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) '4', (double) (-1L));
        double double13 = resizableDoubleArray0.addElementRolling((double) 100L);
        resizableDoubleArray0.discardFrontElements(0);
        float float16 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10);
        resizableDoubleArray2.setNumElements(36);
        resizableDoubleArray2.clear();
        float float6 = resizableDoubleArray2.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.addElement(0.0d);
        resizableDoubleArray2.addElement((double) 36);
        double[] doubleArray8 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.setNumElements((int) (short) 1);
        resizableDoubleArray2.setContractionCriteria(32.5f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 36.0]");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        float float14 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0, 0.0, 10.0, 10.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 0.0, 10.0, 10.0]");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, 100.5f, 100.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 10);
        int int3 = resizableDoubleArray2.getNumElements();
        float float4 = resizableDoubleArray2.getContractionCriteria();
        double[] doubleArray5 = resizableDoubleArray2.getElements();
        int int6 = resizableDoubleArray2.start();
        resizableDoubleArray2.setNumElements((int) (short) 10);
        float float9 = resizableDoubleArray2.getContractionCriteria();
        float float10 = resizableDoubleArray2.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.5f + "'", float4 == 10.5f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.5f + "'", float9 == 10.5f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.5f + "'", float10 == 10.5f);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 4);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.addElement((double) (short) -1);
        int int6 = resizableDoubleArray2.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray2.getElement(99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 99 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) (short) 100);
        int int13 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(1.0d);
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        java.lang.Class<?> wildcardClass17 = doubleArray16.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        int int3 = resizableDoubleArray2.getExpansionMode();
        float float4 = resizableDoubleArray2.getExpansionFactor();
        float float5 = resizableDoubleArray2.getExpansionFactor();
        double double7 = resizableDoubleArray2.addElementRolling((double) 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(68, 2.5f, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 36.5f);
        double[] doubleArray11 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) 102);
        resizableDoubleArray0.setNumElements(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 100.0, 0.0, 36.5]");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) ' ', (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        int int18 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setElement(2, (double) 10.5f);
        float float23 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray24 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 2.0f + "'", float23 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 10.5]");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float9 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        int int17 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement(100, 100.0d);
        double double22 = resizableDoubleArray0.addElementRolling((double) 100.0f);
        resizableDoubleArray0.setContractionCriteria((float) (short) 10);
        double double26 = resizableDoubleArray0.addElementRolling((double) 36.0f);
        int int27 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(3, (float) 52, (float) 11, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 100);
        double double4 = resizableDoubleArray2.addElementRolling((double) 100);
        resizableDoubleArray2.clear();
        double[] doubleArray6 = resizableDoubleArray2.getElements();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray2.getElement((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 35 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(3, (float) (short) -1, 102.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) '4', (double) (-1L));
        double double13 = resizableDoubleArray0.addElementRolling((double) 100L);
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.discardFrontElements((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.contract();
        double[] doubleArray5 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = resizableDoubleArray0.getElement(101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 101 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(10.0d);
        int int9 = resizableDoubleArray0.start();
        int int10 = resizableDoubleArray0.getNumElements();
        float float11 = resizableDoubleArray0.getExpansionFactor();
        int int12 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setExpansionMode((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0f + "'", float11 == 2.0f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        int int18 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setElement(2, (double) 10.5f);
        double[] doubleArray23 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 10.5]");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        resizableDoubleArray2.setNumElements(103);
        resizableDoubleArray2.clear();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.start();
        double double14 = resizableDoubleArray0.addElementRolling((double) (short) 0);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        java.lang.Class<?> wildcardClass16 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(36);
        resizableDoubleArray1.setNumElements((int) (short) 10);
        resizableDoubleArray1.setContractionCriteria((float) 'a');
        int int6 = resizableDoubleArray1.start();
        resizableDoubleArray1.setExpansionFactor((float) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(64, 2.5f);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.setContractionCriteria((float) (byte) 10);
        double double9 = resizableDoubleArray0.addElementRolling((double) 100.5f);
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements((int) (byte) 1);
        resizableDoubleArray0.addElement((double) 97);
        resizableDoubleArray0.addElement(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = resizableDoubleArray0.getElement(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 11 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.discardFrontElements((int) (short) 10);
        resizableDoubleArray0.setElement(68, (double) 100.0f);
        float float14 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setExpansionMode((int) (byte) 0);
        int int18 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 90 + "'", int18 == 90);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        double double17 = resizableDoubleArray0.addElementRolling((double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) 68);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (byte) 100);
        resizableDoubleArray0.addElement((double) 64);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray2.getElement((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 1 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(33, (float) (short) 10);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(64);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(4);
        int int2 = resizableDoubleArray1.start();
        int int3 = resizableDoubleArray1.start();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, 68.5f, (float) 64, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(33, (float) 1L, 102.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, 36.5f, 100.5f);
        float float4 = resizableDoubleArray3.getContractionCriteria();
        java.lang.Class<?> wildcardClass5 = resizableDoubleArray3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.5f + "'", float4 == 100.5f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        double double9 = resizableDoubleArray0.getElement(0);
        resizableDoubleArray0.setContractionCriteria((float) 36);
        resizableDoubleArray0.setNumElements((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(103, 0.0f, 102.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        double double12 = resizableDoubleArray0.addElementRolling((double) (byte) 10);
        double double14 = resizableDoubleArray0.addElementRolling((double) 64);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(4, (float) 102);
        int int3 = resizableDoubleArray2.getExpansionMode();
        double double5 = resizableDoubleArray2.addElementRolling((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setContractionCriteria((float) 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements(0);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements(4);
        float float6 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 4);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.setNumElements((int) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        resizableDoubleArray0.contract();
        double double9 = resizableDoubleArray0.addElementRolling((double) 37);
        float float10 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray4 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) 100);
        int int7 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        double double9 = resizableDoubleArray0.getElement((int) (short) 1);
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.contract();
        int int16 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        int int8 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria(35.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        double double6 = resizableDoubleArray1.addElementRolling((double) 100.0f);
        resizableDoubleArray1.clear();
        resizableDoubleArray1.contract();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) '4', (double) 2.5f);
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) '#');
        double double17 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int18 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) '4');
        resizableDoubleArray2.clear();
        resizableDoubleArray2.setContractionCriteria(100.0f);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        int int18 = resizableDoubleArray0.start();
        double double20 = resizableDoubleArray0.addElementRolling((double) '#');
        double double22 = resizableDoubleArray0.addElementRolling((double) 2.0f);
        resizableDoubleArray0.setElement(1, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(0);
        resizableDoubleArray0.setElement(97, (double) 2.5f);
        float float19 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray20 = resizableDoubleArray0.getElements();
        double double22 = resizableDoubleArray0.getElement(32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.5f + "'", float19 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 36.5f);
        int int11 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) 4);
        resizableDoubleArray2.setContractionCriteria((float) 103);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray2.getElement(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 4 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setExpansionFactor(2.5f);
        int int14 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements(11);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) (short) 100);
        double[] doubleArray19 = resizableDoubleArray0.getElements();
        int int20 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) 10);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(53);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(37, 2.0f, (float) 52);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        resizableDoubleArray0.setNumElements(10);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        java.lang.Class<?> wildcardClass17 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 0.0, 10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 'a');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0]");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.contract();
        double double12 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.addElement((double) 1);
        int int15 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(1);
        float float18 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 103 + "'", int15 == 103);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.5f + "'", float18 == 2.5f);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        int int3 = resizableDoubleArray2.getExpansionMode();
        float float4 = resizableDoubleArray2.getExpansionFactor();
        double[] doubleArray5 = resizableDoubleArray2.getElements();
        int int6 = resizableDoubleArray2.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        int int9 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setElement(102, (double) 1L);
        double[] doubleArray17 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0]");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        float float3 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray4 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.setNumElements((int) (short) 10);
        float float8 = resizableDoubleArray1.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        resizableDoubleArray0.addElement((double) 100L);
        resizableDoubleArray0.addElement((double) (short) 0);
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.contract();
        float float18 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.5f + "'", float18 == 2.5f);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(0, (double) (byte) -1);
        resizableDoubleArray0.setNumElements((int) (byte) 0);
        resizableDoubleArray0.setElement(68, (double) 36.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(52);
        resizableDoubleArray0.discardFrontElements(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        int int12 = resizableDoubleArray0.getNumElements();
        float float13 = resizableDoubleArray0.getContractionCriteria();
        int int14 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.5f + "'", float13 == 2.5f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(32, (float) (byte) 10);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        int int6 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.getElement(0);
        int int15 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements(52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(0);
        resizableDoubleArray0.setElement(97, (double) 2.5f);
        float float19 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray20 = resizableDoubleArray0.getElements();
        int int21 = resizableDoubleArray0.start();
        double double23 = resizableDoubleArray0.addElementRolling((double) 52);
        float float24 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5, 52.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.5f + "'", float19 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 2.5f + "'", float24 == 2.5f);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        resizableDoubleArray0.setNumElements(10);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = resizableDoubleArray0.getElement(90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 90 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 0.0, 10.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        int int5 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        float float6 = resizableDoubleArray0.getContractionCriteria();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        float float9 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.setElement(68, (double) 1);
        float float7 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.5f + "'", float7 == 2.5f);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        int int4 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        java.lang.Class<?> wildcardClass6 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) '4', (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(90);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.contract();
        int int11 = resizableDoubleArray0.getNumElements();
        int int12 = resizableDoubleArray0.start();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setExpansionMode(0);
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(32);
        double double12 = resizableDoubleArray0.getElement((int) (short) 10);
        resizableDoubleArray0.setNumElements(68);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        double double7 = resizableDoubleArray0.addElementRolling((double) 1);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements((int) '4');
        resizableDoubleArray0.addElement((double) (byte) 10);
        double double14 = resizableDoubleArray0.addElementRolling(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 1, 35.0d);
        float float16 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(35, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(3, (float) 'a', (float) 69, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((-1), (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) '#');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(102, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ');
        double double3 = resizableDoubleArray1.addElementRolling((double) 35);
        int int4 = resizableDoubleArray1.start();
        double[] doubleArray5 = resizableDoubleArray1.getElements();
        int int6 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(0);
        resizableDoubleArray0.setElement(97, (double) 2.5f);
        int int19 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        double double22 = resizableDoubleArray0.addElementRolling((double) 69);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        double double10 = resizableDoubleArray0.addElementRolling((double) 100.0f);
        resizableDoubleArray0.clear();
        int int12 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setExpansionFactor((float) 2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) '4', (double) 2.5f);
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) '#');
        resizableDoubleArray0.setNumElements((int) (short) 1);
        float float18 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5]");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) (short) 100);
        float float13 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        double double9 = resizableDoubleArray0.getElement(0);
        int int10 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray11 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 35.0]");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.contract();
        double[] doubleArray15 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(35.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(36, 4.0f, (float) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 4, (float) 100L, 0);
        float float5 = resizableDoubleArray4.getExpansionFactor();
        resizableDoubleArray4.setContractionCriteria((float) (short) 10);
        resizableDoubleArray4.clear();
        double double10 = resizableDoubleArray4.addElementRolling((double) '4');
        int int11 = resizableDoubleArray4.getExpansionMode();
        resizableDoubleArray4.clear();
        resizableDoubleArray4.setElement(68, (double) 2.0f);
        int int16 = resizableDoubleArray4.getExpansionMode();
        int int17 = resizableDoubleArray4.getExpansionMode();
        resizableDoubleArray4.discardFrontElements(0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 4.0f + "'", float5 == 4.0f);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (short) 10);
        resizableDoubleArray2.addElement((double) (-1L));
        double[] doubleArray5 = resizableDoubleArray2.getValues();
        double[] doubleArray6 = resizableDoubleArray2.getElements();
        double[] doubleArray7 = resizableDoubleArray2.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        resizableDoubleArray2.setNumElements(103);
        int int6 = resizableDoubleArray2.start();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        int int8 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 37);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(99);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.setNumElements((int) (short) 0);
        float float5 = resizableDoubleArray1.getContractionCriteria();
        resizableDoubleArray1.setElement(11, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(3, (float) 90, 2.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(102, (float) (-1), (float) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        int int4 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        double double7 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.setElement(35, (double) 101);
        float float11 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (byte) 10);
        resizableDoubleArray0.setNumElements(3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0f + "'", float11 == 2.0f);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 10);
        int int3 = resizableDoubleArray2.start();
        float float4 = resizableDoubleArray2.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.5f + "'", float4 == 10.5f);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        int int3 = resizableDoubleArray2.getNumElements();
        double double5 = resizableDoubleArray2.addElementRolling((double) (-1));
        int int6 = resizableDoubleArray2.start();
        float float7 = resizableDoubleArray2.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 36.0f + "'", float7 == 36.0f);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.setContractionCriteria((float) (byte) 10);
        double double9 = resizableDoubleArray0.addElementRolling((double) 100.5f);
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements((int) (byte) 1);
        resizableDoubleArray0.addElement((double) 97);
        double double16 = resizableDoubleArray0.addElementRolling((double) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        int int13 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements(99);
        int int16 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) 'a', (double) 10L);
        float float20 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 2.5f + "'", float20 == 2.5f);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        resizableDoubleArray2.setNumElements(10);
        float float5 = resizableDoubleArray2.getContractionCriteria();
        float float6 = resizableDoubleArray2.getExpansionFactor();
        int int7 = resizableDoubleArray2.start();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 36.5f + "'", float5 == 36.5f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 36.0f + "'", float6 == 36.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 101);
        resizableDoubleArray2.contract();
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.setNumElements((int) '#');
        float float8 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        double double10 = resizableDoubleArray0.addElementRolling((double) 68);
        resizableDoubleArray0.setContractionCriteria((float) (byte) 100);
        float float13 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(69, (float) 97, (float) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        resizableDoubleArray0.discardFrontElements(36);
        int int15 = resizableDoubleArray0.getExpansionMode();
        int int16 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(10, (double) 36);
        double double9 = resizableDoubleArray0.addElementRolling((-1.0d));
        resizableDoubleArray0.setElement(4, (double) 97.0f);
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) 90);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) (short) 100);
        double[] doubleArray12 = resizableDoubleArray0.getValues();
        float float13 = resizableDoubleArray0.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        double double9 = resizableDoubleArray0.getElement(0);
        resizableDoubleArray0.setContractionCriteria((float) 36);
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 35.0]");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        int int12 = resizableDoubleArray0.start();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (byte) 100, 100.5f);
        resizableDoubleArray3.setElement((int) (short) 1, (double) 102);
        resizableDoubleArray3.setExpansionFactor((float) (byte) 10);
        float float9 = resizableDoubleArray3.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.5f + "'", float9 == 100.5f);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        int int4 = resizableDoubleArray2.start();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray2.getElement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 0 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, 2.0f);
        float float3 = resizableDoubleArray2.getContractionCriteria();
        resizableDoubleArray2.addElement((double) 10L);
        resizableDoubleArray2.addElement((double) 97.0f);
        resizableDoubleArray2.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.5f + "'", float3 == 2.5f);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1);
        double[] doubleArray2 = resizableDoubleArray1.getElements();
        int int3 = resizableDoubleArray1.start();
        resizableDoubleArray1.setElement(10, (double) 0L);
        resizableDoubleArray1.setNumElements((int) (byte) 0);
        float float9 = resizableDoubleArray1.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray4 = resizableDoubleArray0.getValues();
        double[] doubleArray5 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setExpansionMode(0);
        int int8 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        double double4 = resizableDoubleArray0.addElementRolling((double) 2.5f);
        resizableDoubleArray0.setElement(102, (double) 101);
        resizableDoubleArray0.setNumElements(0);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = resizableDoubleArray0.getElement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 0 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        resizableDoubleArray0.discardFrontElements(36);
        int int15 = resizableDoubleArray0.getExpansionMode();
        double double17 = resizableDoubleArray0.addElementRolling((double) 10);
        float float18 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        float float14 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements(102);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(101);
        java.lang.Class<?> wildcardClass2 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements((int) (byte) 0);
        int int10 = resizableDoubleArray0.start();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        double double12 = resizableDoubleArray0.addElementRolling((double) 2.0f);
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        int int13 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement(35.0d);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.setElement(32, (double) 69);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 100);
        double double4 = resizableDoubleArray2.addElementRolling((double) 100);
        float float5 = resizableDoubleArray2.getContractionCriteria();
        double[] doubleArray6 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.setElement(90, (double) 4);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.5f + "'", float5 == 100.5f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        double double9 = resizableDoubleArray0.getElement((int) (short) 1);
        int int10 = resizableDoubleArray0.start();
        float float11 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setContractionCriteria((float) 4);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        java.lang.Class<?> wildcardClass12 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getNumElements();
        double[] doubleArray11 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setNumElements((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, 100.0d);
        int int16 = resizableDoubleArray0.getNumElements();
        float float17 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement(101, (double) 97);
        double double22 = resizableDoubleArray0.getElement(33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) 1L, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, (float) (short) -1, (float) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria(100.0f);
        resizableDoubleArray0.addElement((double) 10);
        double[] doubleArray6 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        float float3 = resizableDoubleArray2.getContractionCriteria();
        float float4 = resizableDoubleArray2.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setContractionCriteria((float) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 36.5f + "'", float3 == 36.5f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 36.5f + "'", float4 == 36.5f);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        resizableDoubleArray0.setElement(99, (double) 100.0f);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.discardFrontElements(36);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.contract();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        float float3 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray4 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.contract();
        double[] doubleArray6 = resizableDoubleArray1.getValues();
        int int7 = resizableDoubleArray1.getExpansionMode();
        double[] doubleArray8 = resizableDoubleArray1.getElements();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        double double5 = resizableDoubleArray0.addElementRolling((double) (short) 10);
        float float6 = resizableDoubleArray0.getExpansionFactor();
        int int7 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        int int16 = resizableDoubleArray0.getExpansionMode();
        float float17 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.5f + "'", float17 == 2.5f);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 102);
        int int12 = resizableDoubleArray0.start();
        float float13 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setContractionCriteria((float) 103);
        float float16 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.0f + "'", float16 == 2.0f);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        int int8 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        resizableDoubleArray0.addElement(0.0d);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, 36.0f, (float) 103, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(10.0d);
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria((float) 'a');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.addElement((double) 35);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.discardFrontElements(0);
        double[] doubleArray5 = resizableDoubleArray2.getValues();
        int int6 = resizableDoubleArray2.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionMode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        resizableDoubleArray0.contract();
        double double9 = resizableDoubleArray0.addElementRolling((double) 37);
        resizableDoubleArray0.addElement((double) 52);
        double[] doubleArray12 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 32.0, 37.0, 52.0, 0.0, 0.0]");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double double5 = resizableDoubleArray0.addElementRolling((double) 'a');
        float float6 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        double double9 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.setElement((int) (short) 10, (double) 102.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) (byte) 10, (float) 69, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(97, 100.0f, (float) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria(100.0f);
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        int int13 = resizableDoubleArray0.start();
        double double15 = resizableDoubleArray0.addElementRolling((double) 64);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(36, (double) 10L);
        resizableDoubleArray0.addElement((double) 36.5f);
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement((int) ' ', (double) 37);
        resizableDoubleArray0.setContractionCriteria(97.0f);
        java.lang.Class<?> wildcardClass17 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 36.5]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setExpansionMode((int) (byte) 1);
        double double15 = resizableDoubleArray0.getElement(1);
        float float16 = resizableDoubleArray0.getContractionCriteria();
        float float17 = resizableDoubleArray0.getContractionCriteria();
        float float18 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.5f + "'", float17 == 2.5f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) 33);
        double double8 = resizableDoubleArray0.addElementRolling((double) 100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 33.0d + "'", double8 == 33.0d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        double double17 = resizableDoubleArray0.addElementRolling((double) 100.0f);
        double[] doubleArray18 = resizableDoubleArray0.getElements();
        int int19 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray4 = resizableDoubleArray0.getValues();
        int int5 = resizableDoubleArray0.getNumElements();
        int int6 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setNumElements((int) ' ');
        double[] doubleArray11 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) (byte) 100);
        resizableDoubleArray0.setContractionCriteria((float) 101);
        resizableDoubleArray0.addElement((double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        int int5 = resizableDoubleArray0.start();
        double double7 = resizableDoubleArray0.addElementRolling((double) 35);
        resizableDoubleArray0.setNumElements((int) '#');
        int int10 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        double double7 = resizableDoubleArray0.addElementRolling((double) 0.0f);
        float float8 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        float float7 = resizableDoubleArray0.getExpansionFactor();
        int int8 = resizableDoubleArray0.getNumElements();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) (short) 100);
        double[] doubleArray19 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setExpansionFactor((float) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        double double9 = resizableDoubleArray0.addElementRolling((double) 4);
        int int10 = resizableDoubleArray0.getNumElements();
        int int11 = resizableDoubleArray0.start();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 101 + "'", int10 == 101);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        resizableDoubleArray0.contract();
        double double9 = resizableDoubleArray0.addElementRolling((double) 37);
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        float float11 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 32.0, 37.0]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        double[] doubleArray4 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.clear();
        double[] doubleArray6 = resizableDoubleArray2.getValues();
        double double8 = resizableDoubleArray2.addElementRolling((double) 68);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[68.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.contract();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        int int4 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        double[] doubleArray6 = resizableDoubleArray0.getElements();
        int int7 = resizableDoubleArray0.getNumElements();
        int int8 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, 102.0f);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.addElement((double) 4);
        resizableDoubleArray2.setExpansionFactor(100.0f);
        int int8 = resizableDoubleArray2.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setContractionCriteria((float) '4');
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        int int15 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(101);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 102 + "'", int15 == 102);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        int int14 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 102);
        int int12 = resizableDoubleArray0.getNumElements();
        int int13 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        int int17 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements(37);
        double double21 = resizableDoubleArray0.addElementRolling(35.0d);
        double double23 = resizableDoubleArray0.getElement(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.discardFrontElements(35);
        int int14 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 66 + "'", int14 == 66);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, 0.0f, (float) 1L, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(68, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.start();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setElement(36, (double) 10L);
        float float8 = resizableDoubleArray0.getContractionCriteria();
        int int9 = resizableDoubleArray0.getExpansionMode();
        int int10 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(36);
        resizableDoubleArray1.setNumElements((int) (short) 10);
        resizableDoubleArray1.setContractionCriteria((float) 'a');
        double[] doubleArray6 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.setNumElements(99);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 0L);
        resizableDoubleArray0.setContractionCriteria((float) (short) 10);
        resizableDoubleArray0.discardFrontElements((int) (byte) 10);
        int int15 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1);
        double[] doubleArray2 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.setContractionCriteria((float) 52);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(10, (double) 36);
        double double9 = resizableDoubleArray0.addElementRolling((-1.0d));
        double double11 = resizableDoubleArray0.getElement((int) (byte) 10);
        double double13 = resizableDoubleArray0.addElementRolling((double) 97);
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) 1);
        float float17 = resizableDoubleArray0.getExpansionFactor();
        double double19 = resizableDoubleArray0.addElementRolling((double) 69);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        int int4 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        double[] doubleArray6 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.start();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        double double11 = resizableDoubleArray0.getElement((int) (short) 10);
        resizableDoubleArray0.addElement((double) 'a');
        int int14 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 101 + "'", int14 == 101);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        float float3 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray4 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.contract();
        double[] doubleArray6 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.setElement((int) (byte) 10, (double) (-1.0f));
        int int6 = resizableDoubleArray1.start();
        double double8 = resizableDoubleArray1.addElementRolling(100.0d);
        double[] doubleArray9 = resizableDoubleArray1.getValues();
        float float10 = resizableDoubleArray1.getContractionCriteria();
        int int11 = resizableDoubleArray1.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, -1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        resizableDoubleArray0.setNumElements((int) 'a');
        int int9 = resizableDoubleArray0.getExpansionMode();
        double double11 = resizableDoubleArray0.getElement(2);
        float float12 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.5f + "'", float12 == 2.5f);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements(1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(32, (float) 0L, (float) 4, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements(0);
        double double10 = resizableDoubleArray0.addElementRolling((double) 68);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.addElementRolling((double) 36);
        int int15 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        float float6 = resizableDoubleArray0.getContractionCriteria();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        float float9 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        double double12 = resizableDoubleArray0.addElementRolling((-1.0d));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getContractionCriteria();
        int int5 = resizableDoubleArray0.getNumElements();
        double double7 = resizableDoubleArray0.addElementRolling(97.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        resizableDoubleArray0.setElement(99, (double) 100.0f);
        resizableDoubleArray0.contract();
        int int15 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, 2.0f);
        float float3 = resizableDoubleArray2.getContractionCriteria();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.5f + "'", float3 == 2.5f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = resizableDoubleArray2.getElement(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 11 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        int int4 = resizableDoubleArray0.start();
        double double6 = resizableDoubleArray0.addElementRolling((double) 10.5f);
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[10.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(4, (float) 102);
        float float3 = resizableDoubleArray2.getContractionCriteria();
        int int4 = resizableDoubleArray2.getNumElements();
        double[] doubleArray5 = resizableDoubleArray2.getElements();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.5f + "'", float3 == 102.5f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(0, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements(52);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        resizableDoubleArray0.setContractionCriteria((float) 4);
        int int13 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double double5 = resizableDoubleArray0.getElement((int) (byte) 1);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setContractionCriteria((float) 2);
        resizableDoubleArray0.contract();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        int int7 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) 10L);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 100.5f);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.discardFrontElements((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements(97);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(0);
        resizableDoubleArray0.setElement(97, (double) 2.5f);
        float float19 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray20 = resizableDoubleArray0.getElements();
        double double22 = resizableDoubleArray0.getElement(36);
        resizableDoubleArray0.setNumElements(90);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.5f + "'", float19 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        double double6 = resizableDoubleArray1.addElementRolling((double) 100.0f);
        double[] doubleArray7 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.clear();
        float float9 = resizableDoubleArray1.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(68, (float) 3);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (byte) 100, 100.5f);
        resizableDoubleArray3.setElement((int) (short) 1, (double) 102);
        resizableDoubleArray3.addElement((double) 101);
        resizableDoubleArray3.addElement((double) 103);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.getElement(0);
        int int15 = resizableDoubleArray0.start();
        int int16 = resizableDoubleArray0.start();
        double[] doubleArray17 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) 69, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 36, (float) (byte) 100, 0);
        resizableDoubleArray4.contract();
        resizableDoubleArray4.setNumElements((int) (short) 10);
        resizableDoubleArray4.contract();
        resizableDoubleArray4.setElement(37, (double) 36.0f);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        float float14 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 101 + "'", int12 == 101);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(102, (float) 100);
        double double4 = resizableDoubleArray2.addElementRolling((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', 2.5f, 32.0f);
        int int4 = resizableDoubleArray3.getNumElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        float float13 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 2.5f);
        float float16 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        double double19 = resizableDoubleArray0.getElement((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.0f + "'", float13 == 2.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.0f + "'", float16 == 2.0f);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.5d + "'", double19 == 2.5d);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.getElement(0);
        int int15 = resizableDoubleArray0.start();
        int int16 = resizableDoubleArray0.start();
        float float17 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.5f + "'", float17 == 2.5f);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) '#', (float) 100L);
        float float4 = resizableDoubleArray3.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray3.discardFrontElements(90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        double double10 = resizableDoubleArray0.addElementRolling((double) 68);
        double double12 = resizableDoubleArray0.addElementRolling(0.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(4, (float) 11, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray18 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray4 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) 100);
        float float7 = resizableDoubleArray0.getExpansionFactor();
        int int8 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 11);
        int int11 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.start();
        resizableDoubleArray0.contract();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.getElement((int) (byte) 10);
        double double16 = resizableDoubleArray0.getElement(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        int int12 = resizableDoubleArray0.start();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements(10);
        float float16 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, 0.0f, (float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria(10.5f);
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.5f + "'", float10 == 10.5f);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        double double17 = resizableDoubleArray0.addElementRolling((double) (-1.0f));
        int int18 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(90, (float) (byte) 1, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) '4', (double) 2.5f);
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) '#');
        int int16 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setExpansionMode((int) (byte) 1);
        double double15 = resizableDoubleArray0.getElement(1);
        float float16 = resizableDoubleArray0.getContractionCriteria();
        float float17 = resizableDoubleArray0.getContractionCriteria();
        int int18 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.5f + "'", float17 == 2.5f);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        int int17 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement(100, 100.0d);
        double double22 = resizableDoubleArray0.addElementRolling((double) 100.0f);
        int int23 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setNumElements((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        java.lang.Class<?> wildcardClass12 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, (float) (byte) 10);
        resizableDoubleArray2.setExpansionMode((int) (short) 0);
        int int5 = resizableDoubleArray2.start();
        resizableDoubleArray2.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray2.start();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.setContractionCriteria((float) (short) 10);
        resizableDoubleArray0.setNumElements((int) (short) 100);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        int int13 = resizableDoubleArray0.start();
        double[] doubleArray14 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(35);
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setElement(1, (double) 1.0f);
        resizableDoubleArray0.clear();
        double[] doubleArray22 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        resizableDoubleArray2.contract();
        resizableDoubleArray2.contract();
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setExpansionFactor((float) 10L);
        resizableDoubleArray0.setNumElements(37);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement(0, 1.0d);
        float float6 = resizableDoubleArray2.getContractionCriteria();
        double[] doubleArray7 = resizableDoubleArray2.getElements();
        int int8 = resizableDoubleArray2.start();
        int int9 = resizableDoubleArray2.getNumElements();
        int int10 = resizableDoubleArray2.getNumElements();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.5f + "'", float6 == 100.5f);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.getElement((int) (byte) 10);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        int int16 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        float float3 = resizableDoubleArray1.getExpansionFactor();
        resizableDoubleArray1.setNumElements(33);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionMode(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) 0);
        int int13 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.setContractionCriteria((float) (byte) 10);
        double double9 = resizableDoubleArray0.addElementRolling((double) 100.5f);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = resizableDoubleArray0.getElement(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 1 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        double double9 = resizableDoubleArray0.addElementRolling((double) 4);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.getNumElements();
        float float12 = resizableDoubleArray0.getContractionCriteria();
        float float13 = resizableDoubleArray0.getContractionCriteria();
        float float14 = resizableDoubleArray0.getContractionCriteria();
        int int15 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 10.5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.5f + "'", float12 == 2.5f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.5f + "'", float13 == 2.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 'a');
        resizableDoubleArray2.setExpansionFactor((float) 68);
        resizableDoubleArray2.setNumElements(3);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.getNumElements();
        float float9 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        int int11 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = resizableDoubleArray0.getElement(69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 69 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, (float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement(99, (double) 35);
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement(0.0d);
        double double12 = resizableDoubleArray0.addElementRolling((double) 100.0f);
        resizableDoubleArray0.addElement((double) 4);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria(1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        double double6 = resizableDoubleArray1.addElementRolling((double) 100.0f);
        resizableDoubleArray1.clear();
        float float8 = resizableDoubleArray1.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(99, (float) 68, (float) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(10.0d);
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements(35);
        int int12 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 102.5f);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 36, (float) (byte) 100, 0);
        resizableDoubleArray4.contract();
        resizableDoubleArray4.setElement(102, (double) 36.5f);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(10, (double) 36);
        double double9 = resizableDoubleArray0.addElementRolling((-1.0d));
        resizableDoubleArray0.setElement(4, (double) 97.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setExpansionFactor(2.5f);
        resizableDoubleArray0.setElement((int) (short) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        int int10 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        int int12 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(68, (float) 99, (float) (short) 100);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(53, (float) 53);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(2, (float) 10);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.discardFrontElements((int) (byte) 1);
        resizableDoubleArray0.setNumElements((int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 4, (float) 100L, 0);
        float float5 = resizableDoubleArray4.getExpansionFactor();
        resizableDoubleArray4.setContractionCriteria((float) (short) 10);
        resizableDoubleArray4.clear();
        double double10 = resizableDoubleArray4.addElementRolling((double) '4');
        int int11 = resizableDoubleArray4.getExpansionMode();
        resizableDoubleArray4.clear();
        resizableDoubleArray4.setElement(68, (double) 2.0f);
        int int16 = resizableDoubleArray4.getExpansionMode();
        int int17 = resizableDoubleArray4.getExpansionMode();
        resizableDoubleArray4.setExpansionMode((int) (short) 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 4.0f + "'", float5 == 4.0f);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        float float8 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setElement(52, 97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double double3 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.clear();
        resizableDoubleArray0.clear();
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(11);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(36, 32.5f, (float) 35);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        double double14 = resizableDoubleArray0.getElement((int) (byte) 10);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        int int12 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement(11, (double) (byte) 100);
        resizableDoubleArray0.discardFrontElements(33);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        int int3 = resizableDoubleArray2.getNumElements();
        resizableDoubleArray2.setElement(100, (double) (short) 1);
        resizableDoubleArray2.discardFrontElements((int) '#');
        float float9 = resizableDoubleArray2.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 36.5f + "'", float9 == 36.5f);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        int int17 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements(37);
        double double21 = resizableDoubleArray0.addElementRolling(35.0d);
        double[] doubleArray22 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0, 0.0]");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        double double7 = resizableDoubleArray0.addElementRolling((double) '4');
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[52.0]");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((-1), (float) 90, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        float float5 = resizableDoubleArray1.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setExpansionFactor((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        int int5 = resizableDoubleArray1.getExpansionMode();
        int int6 = resizableDoubleArray1.start();
        float float7 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray8 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setElement((int) (short) 10, (double) 36.0f);
        double[] doubleArray12 = resizableDoubleArray1.getElements();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 36.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 36.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 36.0]");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) (short) 100);
        double[] doubleArray19 = resizableDoubleArray0.getElements();
        int int20 = resizableDoubleArray0.start();
        float float21 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray22 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) (byte) 0);
        resizableDoubleArray0.addElement((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 2.0f + "'", float21 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0]");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getContractionCriteria();
        java.lang.Class<?> wildcardClass5 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        int int6 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.setContractionCriteria((float) (byte) 10);
        resizableDoubleArray1.setNumElements((int) (short) 10);
        double double9 = resizableDoubleArray1.addElementRolling((double) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        double[] doubleArray5 = resizableDoubleArray1.getElements();
        int int6 = resizableDoubleArray1.getExpansionMode();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        int int6 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(101, (float) 100L);
        resizableDoubleArray2.setElement(0, 35.0d);
        resizableDoubleArray2.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray2.getElement(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 3 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        float float14 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        double double17 = resizableDoubleArray0.addElementRolling((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(3, (float) 52);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.getNumElements();
        float float12 = resizableDoubleArray0.getContractionCriteria();
        float float13 = resizableDoubleArray0.getContractionCriteria();
        float float14 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.discardFrontElements(36);
        float float17 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = resizableDoubleArray0.getElement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 0 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.5f + "'", float12 == 2.5f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.5f + "'", float13 == 2.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.getExpansionMode();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        int int7 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        float float9 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        int int11 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        int int11 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(35, (float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor((float) 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) 68, (float) 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.discardFrontElements(0);
        float float6 = resizableDoubleArray1.getContractionCriteria();
        int int7 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.addElement((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getNumElements();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        int int10 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        float float16 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.contract();
        float float18 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(10.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 2.0f + "'", float18 == 2.0f);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        float float9 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray16 = resizableDoubleArray0.getValues();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        double[] doubleArray18 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.discardFrontElements(0);
        int int21 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(37, (float) 97, 35.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(103, 97.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        resizableDoubleArray0.contract();
        double[] doubleArray12 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.addElement((double) 66);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 66.0]");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        double double15 = resizableDoubleArray0.getElement((int) (short) 10);
        resizableDoubleArray0.addElement((double) 35);
        int int18 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement((int) '#', 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, (-1.0f), 102.5f, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setNumElements(10);
        int int7 = resizableDoubleArray0.getExpansionMode();
        float float8 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) 4);
        java.lang.Class<?> wildcardClass3 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setElement((int) (short) 10, 100.0d);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements(2);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        double double14 = resizableDoubleArray0.addElementRolling(100.0d);
        double[] doubleArray15 = resizableDoubleArray0.getValues();
        int int16 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setExpansionMode((int) (byte) 1);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.getNumElements();
        double[] doubleArray12 = resizableDoubleArray0.getValues();
        int int13 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, 102.0f, (float) 1L, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setElement(53, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) ' ');
        int int11 = resizableDoubleArray0.start();
        double double13 = resizableDoubleArray0.getElement((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) 32);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setExpansionMode((int) (byte) 1);
        double double15 = resizableDoubleArray0.getElement(1);
        float float16 = resizableDoubleArray0.getContractionCriteria();
        float float17 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setContractionCriteria((float) 35);
        float float20 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.5f + "'", float16 == 2.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.5f + "'", float17 == 2.5f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 2.0f + "'", float20 == 2.0f);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.contract();
        double double12 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.addElement((double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        int int13 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double double3 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.clear();
        resizableDoubleArray0.clear();
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 35 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        resizableDoubleArray0.setNumElements(10);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        int int16 = resizableDoubleArray0.getNumElements();
        int int17 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(35);
        double[] doubleArray2 = resizableDoubleArray1.getElements();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        double[] doubleArray4 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.clear();
        resizableDoubleArray2.setNumElements(97);
        float float8 = resizableDoubleArray2.getContractionCriteria();
        float float9 = resizableDoubleArray2.getContractionCriteria();
        java.lang.Class<?> wildcardClass10 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.5f + "'", float8 == 10.5f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.5f + "'", float9 == 10.5f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        int int17 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray18 = resizableDoubleArray0.getElements();
        java.lang.Class<?> wildcardClass19 = doubleArray18.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setElement((int) 'a', (double) 10L);
        double[] doubleArray17 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0]");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) 52, 10.0f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(102, (float) 35, (float) 33, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 11, 10.5f, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 'a');
        resizableDoubleArray2.setExpansionFactor((float) 68);
        int int5 = resizableDoubleArray2.start();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement(101, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        double[] doubleArray4 = resizableDoubleArray0.getElements();
        int int5 = resizableDoubleArray0.getExpansionMode();
        int int6 = resizableDoubleArray0.getNumElements();
        double double8 = resizableDoubleArray0.addElementRolling((double) 36.0f);
        float float9 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, (float) ' ');
        float float3 = resizableDoubleArray2.getContractionCriteria();
        float float4 = resizableDoubleArray2.getContractionCriteria();
        double[] doubleArray5 = resizableDoubleArray2.getValues();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.5f + "'", float3 == 32.5f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.5f + "'", float4 == 32.5f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }
}

