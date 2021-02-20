import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        resizableDoubleArray2.addElement((double) 1);
        resizableDoubleArray2.setNumElements(66);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setExpansionFactor((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        int int6 = resizableDoubleArray0.getNumElements();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement(10.0d);
        resizableDoubleArray0.addElement(0.0d);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 66);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(99, (float) 10L, (float) 102, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        int int20 = resizableDoubleArray0.getNumElements();
        int int21 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(32);
        double double7 = resizableDoubleArray0.addElementRolling(36.0d);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 0L);
        resizableDoubleArray0.addElement((double) 100);
        resizableDoubleArray0.clear();
        int int14 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, (float) 10, (float) 101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        int int13 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        int int15 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) '4', (float) 101);
        int int4 = resizableDoubleArray3.getNumElements();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(36, (float) 66, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        int int4 = resizableDoubleArray2.start();
        resizableDoubleArray2.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray2.getElement(66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 66 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements(0);
        int int9 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements((int) (byte) 1);
        double[] doubleArray12 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        resizableDoubleArray0.contract();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, 32.5f, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getExpansionMode();
        double double10 = resizableDoubleArray0.addElementRolling((double) 102.5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        int int4 = resizableDoubleArray0.start();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        int int16 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        float float4 = resizableDoubleArray1.getContractionCriteria();
        float float5 = resizableDoubleArray1.getExpansionFactor();
        float float6 = resizableDoubleArray1.getContractionCriteria();
        resizableDoubleArray1.clear();
        int int8 = resizableDoubleArray1.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setExpansionMode(1);
        int int9 = resizableDoubleArray0.getNumElements();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) '4');
        resizableDoubleArray2.clear();
        double double5 = resizableDoubleArray2.addElementRolling(100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, (float) (short) 10, (float) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(2, (float) (byte) -1, (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) 103, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setContractionCriteria(100.5f);
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        resizableDoubleArray0.setElement(68, (double) 1);
        int int24 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(36);
        resizableDoubleArray1.setNumElements((int) (short) 10);
        resizableDoubleArray1.setContractionCriteria((float) 'a');
        int int6 = resizableDoubleArray1.start();
        resizableDoubleArray1.setExpansionFactor(10.5f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1);
        resizableDoubleArray1.setExpansionMode(0);
        resizableDoubleArray1.addElement((double) (short) 10);
        double[] doubleArray6 = resizableDoubleArray1.getValues();
        float float7 = resizableDoubleArray1.getExpansionFactor();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        int int9 = resizableDoubleArray0.getExpansionMode();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement(64, (double) 36.5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement(0, 1.0d);
        float float6 = resizableDoubleArray2.getContractionCriteria();
        double[] doubleArray7 = resizableDoubleArray2.getElements();
        int int8 = resizableDoubleArray2.start();
        int int9 = resizableDoubleArray2.getNumElements();
        resizableDoubleArray2.addElement((double) 69);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.5f + "'", float6 == 100.5f);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.discardFrontElements(0);
        float float9 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement(103, (double) 32.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        int int14 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        float float16 = resizableDoubleArray0.getExpansionFactor();
        float float17 = resizableDoubleArray0.getExpansionFactor();
        double double19 = resizableDoubleArray0.addElementRolling((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.0f + "'", float16 == 2.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(103, (float) 66);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 4);
        resizableDoubleArray2.contract();
        resizableDoubleArray2.contract();
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.addElement((double) 100.5f);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.discardFrontElements((int) (byte) 1);
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.discardFrontElements(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.5]");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(37, 100.0f, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, 32.0f, (float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        int int10 = resizableDoubleArray0.getExpansionMode();
        int int11 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10, (float) 4, (float) 100L, 0);
        float float5 = resizableDoubleArray4.getExpansionFactor();
        resizableDoubleArray4.setContractionCriteria((float) (short) 10);
        double[] doubleArray8 = resizableDoubleArray4.getElements();
        float float9 = resizableDoubleArray4.getContractionCriteria();
        resizableDoubleArray4.setElement(36, (double) 100.0f);
        resizableDoubleArray4.addElement((double) 3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 4.0f + "'", float5 == 4.0f);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) (byte) 100);
        resizableDoubleArray0.setNumElements(4);
        double double15 = resizableDoubleArray0.addElementRolling((double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) '#', 4.0f, 4.0f, 0);
        resizableDoubleArray4.contract();
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ');
        double double3 = resizableDoubleArray1.addElementRolling((double) 35);
        int int4 = resizableDoubleArray1.start();
        double[] doubleArray5 = resizableDoubleArray1.getElements();
        float float6 = resizableDoubleArray1.getExpansionFactor();
        resizableDoubleArray1.addElement((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float9 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setContractionCriteria((float) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) -1, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        double double5 = resizableDoubleArray0.addElementRolling((double) '4');
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setExpansionMode(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[52.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        double double11 = resizableDoubleArray0.getElement((int) '4');
        resizableDoubleArray0.setContractionCriteria((float) '4');
        resizableDoubleArray0.setElement(0, (double) 101);
        float float17 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(68.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement(99, (double) 35);
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        float float9 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        int int6 = resizableDoubleArray0.start();
        resizableDoubleArray0.setContractionCriteria((float) 52);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(53, (float) (byte) 0, 36.0f, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        int int11 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 99);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
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
        resizableDoubleArray0.setNumElements(4);
        double double17 = resizableDoubleArray0.addElementRolling((double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        int int3 = resizableDoubleArray1.getNumElements();
        resizableDoubleArray1.contract();
        int int5 = resizableDoubleArray1.start();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) 97);
        int int3 = resizableDoubleArray2.getNumElements();
        resizableDoubleArray2.addElement(100.0d);
        double[] doubleArray6 = resizableDoubleArray2.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setExpansionFactor((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0]");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(36, (float) ' ');
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        float float3 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray4 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.contract();
        double[] doubleArray6 = resizableDoubleArray1.getValues();
        double[] doubleArray7 = resizableDoubleArray1.getValues();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(102, 68.5f, (float) ' ', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setNumElements(68);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) 97);
        resizableDoubleArray0.setExpansionMode(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        double double8 = resizableDoubleArray0.addElementRolling((double) 1.0f);
        resizableDoubleArray0.addElement((double) 1.0f);
        int int11 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = resizableDoubleArray0.getElement(69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 69 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a');
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        float float4 = resizableDoubleArray1.getContractionCriteria();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(36);
        resizableDoubleArray1.setNumElements((int) (short) 10);
        resizableDoubleArray1.setContractionCriteria((float) 'a');
        double[] doubleArray6 = resizableDoubleArray1.getElements();
        int int7 = resizableDoubleArray1.getNumElements();
        double[] doubleArray8 = resizableDoubleArray1.getElements();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setContractionCriteria((float) ' ');
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        double double12 = resizableDoubleArray0.addElementRolling((double) 100L);
        resizableDoubleArray0.setNumElements((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(11);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(33, (float) (short) 1, 68.5f, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setExpansionFactor(2.5f);
        int int14 = resizableDoubleArray0.getNumElements();
        float float15 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.5f + "'", float15 == 2.5f);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.setNumElements((int) (short) 1);
        resizableDoubleArray0.setContractionCriteria((float) 4);
        float float13 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 4.0f + "'", float13 == 4.0f);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        float float5 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 0.0]");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        int int3 = resizableDoubleArray0.getExpansionMode();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, 2.0f, (float) '#');
        resizableDoubleArray3.contract();
        resizableDoubleArray3.setNumElements(37);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.setContractionCriteria(10.5f);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.discardFrontElements((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.discardFrontElements(0);
        float float6 = resizableDoubleArray1.getContractionCriteria();
        double double8 = resizableDoubleArray1.addElementRolling((double) 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        resizableDoubleArray0.setNumElements(53);
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.discardFrontElements(1);
        resizableDoubleArray0.setContractionCriteria(2.0f);
        float float15 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.setContractionCriteria(100.5f);
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        resizableDoubleArray0.setElement(68, (double) 1);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) ' ');
        int int11 = resizableDoubleArray0.start();
        double double13 = resizableDoubleArray0.getElement(52);
        float float14 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        resizableDoubleArray0.contract();
        float float14 = resizableDoubleArray0.getExpansionFactor();
        float float15 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double double5 = resizableDoubleArray0.getElement((int) (byte) 1);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setContractionCriteria((float) 2);
        resizableDoubleArray0.setElement(32, (double) 3.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 3.0, 0.0, 0.0]");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(100, 35.0f);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(35, (float) 10L);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        resizableDoubleArray0.contract();
        int int16 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        double double6 = resizableDoubleArray1.addElementRolling((double) 100.0f);
        double double8 = resizableDoubleArray1.addElementRolling((double) 10L);
        resizableDoubleArray1.setContractionCriteria((float) 100L);
        int int11 = resizableDoubleArray1.start();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (byte) 100, 100.5f);
        resizableDoubleArray3.setElement((int) (short) 1, (double) 102);
        float float7 = resizableDoubleArray3.getContractionCriteria();
        resizableDoubleArray3.addElement((double) 100.5f);
        resizableDoubleArray3.setNumElements(2);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.5f + "'", float7 == 100.5f);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement(0, 1.0d);
        float float6 = resizableDoubleArray2.getContractionCriteria();
        double[] doubleArray7 = resizableDoubleArray2.getElements();
        int int8 = resizableDoubleArray2.start();
        int int9 = resizableDoubleArray2.getExpansionMode();
        float float10 = resizableDoubleArray2.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.5f + "'", float6 == 100.5f);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.5f + "'", float10 == 100.5f);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(2, (float) 11, (float) 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setElement((int) '#', (double) '4');
        resizableDoubleArray0.addElement((double) 3.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(35, (float) 102);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0]");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', 2.5f);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1);
        resizableDoubleArray1.setExpansionMode(0);
        int int4 = resizableDoubleArray1.start();
        double double6 = resizableDoubleArray1.addElementRolling((double) 36.5f);
        float float7 = resizableDoubleArray1.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 0L);
        resizableDoubleArray0.addElement((double) 100.5f);
        resizableDoubleArray0.setElement((int) (short) 100, (double) 0L);
        int int16 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) 'a');
        resizableDoubleArray0.discardFrontElements((int) (byte) 0);
        double[] doubleArray21 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 101 + "'", int16 == 101);
        org.junit.Assert.assertNotNull(doubleArray21);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.discardFrontElements(0);
        double[] doubleArray5 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray2.setContractionCriteria((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0]");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        resizableDoubleArray0.addElement((double) 102.0f);
        float float17 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.0f + "'", float14 == 2.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        int int5 = resizableDoubleArray0.start();
        double double7 = resizableDoubleArray0.addElementRolling((double) 35);
        int int8 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.getNumElements();
        float float9 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray10 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(35, (float) 36, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        resizableDoubleArray0.contract();
        double double9 = resizableDoubleArray0.addElementRolling((double) 37);
        resizableDoubleArray0.addElement((double) 52);
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 37.0, 52.0]");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) ' ');
        resizableDoubleArray0.discardFrontElements((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor(102.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 100, 32.5f, (float) 102, (int) (byte) 1);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double double5 = resizableDoubleArray0.getElement((int) (byte) 1);
        float float6 = resizableDoubleArray0.getContractionCriteria();
        double double8 = resizableDoubleArray0.getElement(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, 2.0f);
        resizableDoubleArray2.setContractionCriteria(100.5f);
        int int5 = resizableDoubleArray2.start();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((-1), (float) 11, 36.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: -1must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.getNumElements();
        float float9 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.start();
        double double14 = resizableDoubleArray0.addElementRolling((-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        int int5 = resizableDoubleArray1.getExpansionMode();
        float float6 = resizableDoubleArray1.getContractionCriteria();
        int int7 = resizableDoubleArray1.getExpansionMode();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, 4.0f, (float) (short) 1, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        resizableDoubleArray0.setElement(1, (double) 99);
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
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        resizableDoubleArray0.setNumElements((int) 'a');
        int int9 = resizableDoubleArray0.getExpansionMode();
        double double11 = resizableDoubleArray0.getElement(2);
        int int12 = resizableDoubleArray0.start();
        java.lang.Class<?> wildcardClass13 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements((int) '4');
        int int9 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.discardFrontElements((int) (short) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        float float11 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setElement((-1), (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Cannot set an element at a negative index");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0f + "'", float11 == 2.0f);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        int int14 = resizableDoubleArray0.getExpansionMode();
        float float15 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        double[] doubleArray14 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.contract();
        float float16 = resizableDoubleArray0.getContractionCriteria();
        java.lang.Class<?> wildcardClass17 = resizableDoubleArray0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        int int24 = resizableDoubleArray0.start();
        double[] doubleArray25 = resizableDoubleArray0.getValues();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5, 52.0]");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 36);
        int int3 = resizableDoubleArray2.getNumElements();
        int int4 = resizableDoubleArray2.getNumElements();
        resizableDoubleArray2.setExpansionFactor((float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(4);
        double[] doubleArray2 = resizableDoubleArray1.getElements();
        int int3 = resizableDoubleArray1.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = resizableDoubleArray1.getElement(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 1 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        float float8 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) 2.0f);
        float float12 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.5f + "'", float12 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.0]");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        double double9 = resizableDoubleArray0.getElement((int) (short) 1);
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setNumElements((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of elements must be zero or a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.discardFrontElements(97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1);
        resizableDoubleArray1.contract();
        float float3 = resizableDoubleArray1.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.5f + "'", float3 == 2.5f);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) '4', (float) 97);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        double double5 = resizableDoubleArray2.addElementRolling((double) 2.5f);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray2.getElement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 0 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        double double13 = resizableDoubleArray0.addElementRolling((double) 100);
        resizableDoubleArray0.setContractionCriteria((float) 11);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        resizableDoubleArray0.setContractionCriteria((float) 10L);
        int int14 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = resizableDoubleArray0.getElement(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 10 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) 101);
        resizableDoubleArray2.setExpansionFactor((float) 4);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement((double) 10.0f);
        resizableDoubleArray0.setContractionCriteria((float) 100L);
        double[] doubleArray16 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard a negative number of elements.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0, 10.0]");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria(2.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = resizableDoubleArray0.getElement(90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 90 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
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
        double double19 = resizableDoubleArray0.addElementRolling((double) 35.0f);
        resizableDoubleArray0.addElement((double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) ' ');
        int int11 = resizableDoubleArray0.start();
        double double13 = resizableDoubleArray0.getElement(52);
        resizableDoubleArray0.addElement((double) 4.5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setExpansionMode(0);
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setElement(35, (double) 4);
        int int13 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(103, 1.0f, (float) 100L, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(1.0d);
        resizableDoubleArray0.setNumElements((int) '#');
        resizableDoubleArray0.discardFrontElements(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        float float5 = resizableDoubleArray1.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray1.getElement(37);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 37 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, (float) 102);
        int int3 = resizableDoubleArray2.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.contract();
        int int12 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 11);
        int int15 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        int int12 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(10, (double) 36);
        double double9 = resizableDoubleArray0.addElementRolling((-1.0d));
        double double11 = resizableDoubleArray0.getElement((int) (byte) 10);
        double double13 = resizableDoubleArray0.addElementRolling((double) 97);
        double double15 = resizableDoubleArray0.addElementRolling((double) 36);
        resizableDoubleArray0.setElement(1, 97.0d);
        resizableDoubleArray0.discardFrontElements((int) (byte) 0);
        resizableDoubleArray0.setContractionCriteria(102.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        resizableDoubleArray0.setNumElements(101);
        resizableDoubleArray0.addElement(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        resizableDoubleArray2.setElement(0, 1.0d);
        float float6 = resizableDoubleArray2.getContractionCriteria();
        double[] doubleArray7 = resizableDoubleArray2.getElements();
        int int8 = resizableDoubleArray2.start();
        int int9 = resizableDoubleArray2.getNumElements();
        resizableDoubleArray2.setNumElements(52);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.5f + "'", float6 == 100.5f);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        double[] doubleArray2 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.setExpansionMode((int) (byte) 0);
        resizableDoubleArray1.addElement((double) (short) 0);
        resizableDoubleArray1.addElement((double) 10.0f);
        double double10 = resizableDoubleArray1.addElementRolling((double) '4');
        double[] doubleArray11 = resizableDoubleArray1.getValues();
        resizableDoubleArray1.discardFrontElements((int) (short) 0);
        resizableDoubleArray1.discardFrontElements(2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 52.0, 0.0]");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, 2.0f);
        resizableDoubleArray2.addElement(100.0d);
        double double6 = resizableDoubleArray2.getElement((int) (short) 0);
        double double8 = resizableDoubleArray2.addElementRolling(0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        resizableDoubleArray0.clear();
        int int19 = resizableDoubleArray0.getNumElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        float float10 = resizableDoubleArray0.getExpansionFactor();
        double double12 = resizableDoubleArray0.addElementRolling(0.0d);
        int int13 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setExpansionMode(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        float float12 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray13 = resizableDoubleArray0.getElements();
        int int14 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        double[] doubleArray15 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(10, (float) 10);
        float float3 = resizableDoubleArray2.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.5f + "'", float3 == 10.5f);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double double5 = resizableDoubleArray0.getElement((int) (byte) 1);
        int int6 = resizableDoubleArray0.start();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement(53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 53 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 10, (float) 11);
        resizableDoubleArray3.addElement((double) 2);
        float float6 = resizableDoubleArray3.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) '4', (double) (short) 0);
        resizableDoubleArray0.clear();
        int int8 = resizableDoubleArray0.getNumElements();
        float float9 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        int int11 = resizableDoubleArray0.getNumElements();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.5f + "'", float9 == 2.5f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(33, 97.0f);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) 68, 35.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) 97);
        int int3 = resizableDoubleArray2.getNumElements();
        double[] doubleArray4 = resizableDoubleArray2.getElements();
        double[] doubleArray5 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.setNumElements(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', 2.5f);
        int int3 = resizableDoubleArray2.getNumElements();
        double[] doubleArray4 = resizableDoubleArray2.getValues();
        int int5 = resizableDoubleArray2.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        int int19 = resizableDoubleArray0.getExpansionMode();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setContractionCriteria(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
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
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setExpansionMode(1);
        double[] doubleArray4 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (-1L), (float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(101, (float) 100L);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        double[] doubleArray4 = resizableDoubleArray2.getValues();
        double double6 = resizableDoubleArray2.addElementRolling(102.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray2.getElement((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 1 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[102.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        int int13 = resizableDoubleArray0.start();
        resizableDoubleArray0.setElement(32, (double) 32);
        float float17 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement((double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 32.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.5f + "'", float17 == 2.5f);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(97);
        float float2 = resizableDoubleArray1.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = resizableDoubleArray1.getElement(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 3 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 4);
        resizableDoubleArray2.contract();
        java.lang.Class<?> wildcardClass4 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        float float15 = resizableDoubleArray0.getExpansionFactor();
        float float16 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode(4);
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
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 4.0f + "'", float16 == 4.0f);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setElement((int) (short) 10, 100.0d);
        int int8 = resizableDoubleArray0.start();
        float float9 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 2.0f + "'", float9 == 2.0f);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        float float11 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement((double) 10.0f);
        resizableDoubleArray0.setNumElements((int) (short) 0);
        float float16 = resizableDoubleArray0.getExpansionFactor();
        int int17 = resizableDoubleArray0.start();
        double[] doubleArray18 = resizableDoubleArray0.getElements();
        double[] doubleArray19 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.5f + "'", float11 == 2.5f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 2.0f + "'", float16 == 2.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        double[] doubleArray3 = resizableDoubleArray1.getValues();
        float float4 = resizableDoubleArray1.getContractionCriteria();
        float float5 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray6 = resizableDoubleArray1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray1.setContractionCriteria(0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(36, (float) 10L, 36.0f);
        int int4 = resizableDoubleArray3.start();
        float float5 = resizableDoubleArray3.getContractionCriteria();
        double[] doubleArray6 = resizableDoubleArray3.getValues();
        double double8 = resizableDoubleArray3.addElementRolling(36.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 36.0f + "'", float5 == 36.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[36.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(52, (float) 35);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        resizableDoubleArray0.setExpansionMode(0);
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 1, (double) ' ');
        resizableDoubleArray0.contract();
        double double9 = resizableDoubleArray0.addElementRolling((double) 37);
        resizableDoubleArray0.addElement((double) 52);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(102);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (short) 1, (double) 0.0f);
        resizableDoubleArray0.setExpansionFactor(2.5f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = resizableDoubleArray0.getElement((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 35 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        double double4 = resizableDoubleArray0.addElementRolling((double) 2.5f);
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) 11);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = resizableDoubleArray0.getElement(66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 66 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        float float8 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.discardFrontElements(101);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot discard more elements than arecontained in this array.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(0, (float) 69, 10.5f, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) '4');
        double double4 = resizableDoubleArray2.addElementRolling((double) 97.0f);
        resizableDoubleArray2.setNumElements((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        double double8 = resizableDoubleArray0.addElementRolling((double) (short) 100);
        resizableDoubleArray0.addElement((-1.0d));
        float float11 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0f + "'", float11 == 2.0f);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        double double7 = resizableDoubleArray0.getElement(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(52, (float) (short) 100);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement(10.0d);
        int int9 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 0, (float) 99, 68.5f, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(3, 102.5f, 2.0f, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(101, (float) ' ', (float) 68);
        resizableDoubleArray3.setExpansionMode((int) (byte) 0);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        resizableDoubleArray0.setElement((int) (byte) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) ' ', (float) 35);
        resizableDoubleArray3.contract();
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        double[] doubleArray17 = resizableDoubleArray0.getElements();
        int int18 = resizableDoubleArray0.start();
        double[] doubleArray19 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 35.0]");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement((int) '4', 0.0d);
        float float7 = resizableDoubleArray0.getContractionCriteria();
        double double9 = resizableDoubleArray0.getElement((int) '#');
        double double11 = resizableDoubleArray0.getElement(3);
        int int12 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.5f + "'", float7 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        double[] doubleArray3 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(32);
        double[] doubleArray6 = resizableDoubleArray0.getElements();
        double[] doubleArray7 = resizableDoubleArray0.getElements();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements((int) '#');
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setElement(11, (double) 100.0f);
        float float8 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.5f + "'", float8 == 2.5f);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 37);
        resizableDoubleArray2.addElement((double) 32);
        double[] doubleArray5 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.clear();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0]");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.start();
        double[] doubleArray8 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setContractionCriteria((float) 69);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0]");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setExpansionMode(1);
        resizableDoubleArray0.discardFrontElements((int) (short) 10);
        resizableDoubleArray0.setElement(68, (double) 100.0f);
        resizableDoubleArray0.discardFrontElements(35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        double[] doubleArray21 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 1.0]");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(11, 0.0f, (float) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The expansion factor must be a number greater than 1.0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        float float17 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 2.0f + "'", float17 == 2.0f);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) (short) -1);
        int int7 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray8 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) (byte) 10);
        resizableDoubleArray0.addElement((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0]");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setElement((int) '#', (double) '4');
        int int16 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        float float13 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray14 = resizableDoubleArray0.getValues();
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
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 2.5f + "'", float13 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        double double8 = resizableDoubleArray0.addElementRolling((double) 1.0f);
        resizableDoubleArray0.addElement((double) 1.0f);
        double[] doubleArray11 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        float float3 = resizableDoubleArray0.getExpansionFactor();
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        resizableDoubleArray0.contract();
        int int7 = resizableDoubleArray0.getNumElements();
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements(0);
        double[] doubleArray11 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        double[] doubleArray18 = resizableDoubleArray0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = resizableDoubleArray0.getElement((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 100 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 2.0f + "'", float15 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        resizableDoubleArray0.setNumElements(99);
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionFactor((float) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Contraction criteria can never be smaller than the expansion factor.  This would lead to a never ending loop of expansion and contraction as a newly expanded internal storage array would immediately satisfy the criteria for contraction");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement((int) (byte) 0, (double) 2.5f);
        int int11 = resizableDoubleArray0.getNumElements();
        float float12 = resizableDoubleArray0.getContractionCriteria();
        int int13 = resizableDoubleArray0.getNumElements();
        float float14 = resizableDoubleArray0.getContractionCriteria();
        int int15 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[2.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.5f + "'", float12 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 2.5f + "'", float14 == 2.5f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        double double20 = resizableDoubleArray0.addElementRolling(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, 32.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.addElement((double) 100.0f);
        resizableDoubleArray0.addElement((double) 0);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10L);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.addElement(10.0d);
        int int13 = resizableDoubleArray0.getNumElements();
        double double15 = resizableDoubleArray0.addElementRolling((double) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        resizableDoubleArray0.clear();
        float float10 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.0f + "'", float10 == 2.0f);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) (byte) 1);
        double[] doubleArray12 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0]");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray2 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.addElement((double) (-1));
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setExpansionMode(0);
        resizableDoubleArray0.contract();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        int int5 = resizableDoubleArray0.start();
        float float6 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        double double9 = resizableDoubleArray0.addElementRolling((double) 102);
        double double11 = resizableDoubleArray0.addElementRolling((double) 102.5f);
        resizableDoubleArray0.setNumElements(0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.0f + "'", float6 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 10, (float) 69);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        int int11 = resizableDoubleArray0.getNumElements();
        int int12 = resizableDoubleArray0.start();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        float float3 = resizableDoubleArray1.getExpansionFactor();
        double[] doubleArray4 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.clear();
        int int6 = resizableDoubleArray1.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray4 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 36, (float) (byte) 100, 0);
        int int5 = resizableDoubleArray4.getExpansionMode();
        resizableDoubleArray4.setExpansionFactor((float) (short) 10);
        float float8 = resizableDoubleArray4.getContractionCriteria();
        int int9 = resizableDoubleArray4.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) (byte) 10, (float) ' ');
        resizableDoubleArray3.contract();
        resizableDoubleArray3.contract();
        resizableDoubleArray3.addElement((-1.0d));
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 'a');
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        resizableDoubleArray0.discardFrontElements(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(68);
        double double3 = resizableDoubleArray1.addElementRolling((double) 97);
        resizableDoubleArray1.setContractionCriteria((float) 102);
        double[] doubleArray6 = resizableDoubleArray1.getValues();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.start();
        int int10 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
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
        resizableDoubleArray0.setNumElements(2);
        double[] doubleArray17 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 10.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setNumElements((int) '#');
        float float4 = resizableDoubleArray0.getExpansionFactor();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        int int13 = resizableDoubleArray0.getNumElements();
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        double double13 = resizableDoubleArray0.getElement(35);
        int int14 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setExpansionMode(0);
        double[] doubleArray17 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 99 + "'", int14 == 99);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        double[] doubleArray6 = resizableDoubleArray0.getElements();
        double[] doubleArray7 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray4 = resizableDoubleArray0.getValues();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.contract();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.clear();
        double double6 = resizableDoubleArray0.addElementRolling((double) 32.5f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        float float5 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.clear();
        resizableDoubleArray0.setContractionCriteria((float) 36);
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.contract();
        double[] doubleArray11 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setExpansionFactor(2.0f);
        int int14 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setContractionCriteria(32.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.0f + "'", float5 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 100);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.addElement(0.0d);
        double[] doubleArray6 = resizableDoubleArray2.getElements();
        int int7 = resizableDoubleArray2.getNumElements();
        double[] doubleArray8 = resizableDoubleArray2.getValues();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0]");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        float float4 = resizableDoubleArray0.getContractionCriteria();
        resizableDoubleArray0.setElement(10, (double) 36);
        double double9 = resizableDoubleArray0.addElementRolling((-1.0d));
        double double11 = resizableDoubleArray0.getElement((int) (byte) 10);
        int int12 = resizableDoubleArray0.getNumElements();
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.5f + "'", float4 == 2.5f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 36.0, -1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double double10 = resizableDoubleArray0.addElementRolling((double) 0L);
        resizableDoubleArray0.addElement((double) 100.5f);
        double[] doubleArray13 = resizableDoubleArray0.getValues();
        int int14 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setNumElements(35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) 'a', (float) 100L);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.contract();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.clear();
        int int5 = resizableDoubleArray0.start();
        int int6 = resizableDoubleArray0.getNumElements();
        float float7 = resizableDoubleArray0.getExpansionFactor();
        int int8 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, (float) 97);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(11);
        float float2 = resizableDoubleArray1.getContractionCriteria();
        int int3 = resizableDoubleArray1.getExpansionMode();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.5f + "'", float2 == 2.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        float float3 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) '#');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        int int7 = resizableDoubleArray0.start();
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.discardFrontElements(1);
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
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setElement((int) (short) 10, 100.0d);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.getExpansionMode();
        double[] doubleArray10 = resizableDoubleArray0.getValues();
        float float11 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 2.0f + "'", float11 == 2.0f);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(3, 4.5f, (float) 52);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(102, 100.5f);
        int int3 = resizableDoubleArray2.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        double double6 = resizableDoubleArray1.addElementRolling((double) 100.0f);
        double[] doubleArray7 = resizableDoubleArray1.getElements();
        resizableDoubleArray1.setContractionCriteria((float) 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        double double9 = resizableDoubleArray0.addElementRolling((double) 4);
        resizableDoubleArray0.addElement((double) (-1.0f));
        float float12 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(100, (float) 97);
        int int3 = resizableDoubleArray2.getNumElements();
        resizableDoubleArray2.addElement(100.0d);
        double[] doubleArray6 = resizableDoubleArray2.getElements();
        resizableDoubleArray2.setElement((int) (short) 1, 10.0d);
        double[] doubleArray10 = resizableDoubleArray2.getElements();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.discardFrontElements((int) (short) 1);
        int int12 = resizableDoubleArray0.getExpansionMode();
        int int13 = resizableDoubleArray0.getNumElements();
        int int14 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getValues();
        float float2 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray3 = resizableDoubleArray0.getElements();
        float float4 = resizableDoubleArray0.getExpansionFactor();
        float float5 = resizableDoubleArray0.getContractionCriteria();
        double[] doubleArray6 = resizableDoubleArray0.getElements();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 2.5f + "'", float5 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.clear();
        double double6 = resizableDoubleArray1.addElementRolling((double) 100.0f);
        resizableDoubleArray1.clear();
        resizableDoubleArray1.contract();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.addElement((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray(1, (float) 10, 10.5f);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int8 = resizableDoubleArray0.start();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        int int10 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setContractionCriteria((float) '#');
        resizableDoubleArray0.setNumElements(4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.addElement((double) 0.0f);
        resizableDoubleArray0.setNumElements((int) 'a');
        double[] doubleArray6 = resizableDoubleArray0.getValues();
        double[] doubleArray7 = resizableDoubleArray0.getValues();
        int int8 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.setElement(0, (double) 102.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[102.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[102.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(11, (float) (short) 10);
        resizableDoubleArray2.setContractionCriteria(102.5f);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 1, (float) 4);
        int int3 = resizableDoubleArray2.getExpansionMode();
        int int4 = resizableDoubleArray2.getNumElements();
        resizableDoubleArray2.addElement((-1.0d));
        double double8 = resizableDoubleArray2.addElementRolling((double) 10.5f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(68, (float) '4');
        resizableDoubleArray2.contract();
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 102);
        int int12 = resizableDoubleArray0.start();
        int int13 = resizableDoubleArray0.getExpansionMode();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 10);
        resizableDoubleArray1.contract();
        float float3 = resizableDoubleArray1.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.5f + "'", float3 == 2.5f);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        resizableDoubleArray0.setContractionCriteria(97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5, 0.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 2.5f + "'", float19 == 2.5f);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.5]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(97, (float) 10);
        double[] doubleArray3 = resizableDoubleArray2.getElements();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) '#');
        resizableDoubleArray0.setElement((int) (short) 10, 100.0d);
        int int8 = resizableDoubleArray0.start();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.addElement((double) 2.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray3 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 0, (float) 2, 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The initial capacity supplied: 0must be a positive integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        double double5 = resizableDoubleArray0.addElementRolling(0.0d);
        int int6 = resizableDoubleArray0.start();
        resizableDoubleArray0.discardFrontElements((int) (byte) 10);
        int int9 = resizableDoubleArray0.getExpansionMode();
        resizableDoubleArray0.clear();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray(102, (float) (short) 10);
        int int3 = resizableDoubleArray2.getExpansionMode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        resizableDoubleArray0.addElement(0.0d);
        resizableDoubleArray0.contract();
        int int11 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 2.0f + "'", float4 == 2.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 102 + "'", int11 == 102);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double[] doubleArray1 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.addElement((double) (short) -1);
        float float4 = resizableDoubleArray0.getExpansionFactor();
        resizableDoubleArray0.setElement((int) (byte) 100, (double) (short) 100);
        double double9 = resizableDoubleArray0.addElementRolling((double) 4);
        resizableDoubleArray0.addElement((double) (-1.0f));
        resizableDoubleArray0.clear();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) (short) 100);
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
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (short) 1, 10.0f);
        double[] doubleArray3 = resizableDoubleArray2.getValues();
        double[] doubleArray4 = resizableDoubleArray2.getValues();
        resizableDoubleArray2.clear();
        double[] doubleArray6 = resizableDoubleArray2.getValues();
        java.lang.Class<?> wildcardClass7 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100, 100.0f);
        float float3 = resizableDoubleArray2.getExpansionFactor();
        resizableDoubleArray2.addElement((double) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.setElement(100, (double) (byte) 100);
        resizableDoubleArray0.contract();
        double[] doubleArray12 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) (short) 0, (double) 99);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        int int18 = resizableDoubleArray0.getNumElements();
        double double20 = resizableDoubleArray0.getElement(52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        double double9 = resizableDoubleArray0.addElementRolling((double) 10);
        float float10 = resizableDoubleArray0.getContractionCriteria();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        resizableDoubleArray0.setElement((int) ' ', (double) 69);
        float float21 = resizableDoubleArray0.getExpansionFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 2.5f + "'", float10 == 2.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 2.0f + "'", float21 == 2.0f);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        int int15 = resizableDoubleArray0.getNumElements();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        float float8 = resizableDoubleArray0.getExpansionFactor();
        double[] doubleArray9 = resizableDoubleArray0.getValues();
        resizableDoubleArray0.setNumElements(101);
        float float12 = resizableDoubleArray0.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            resizableDoubleArray0.setExpansionMode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal expansionMode setting.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 2.0f + "'", float8 == 2.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray2 = new org.apache.commons.math.util.ResizableDoubleArray((int) ' ', (float) 4);
        resizableDoubleArray2.addElement((double) (short) 10);
        java.lang.Class<?> wildcardClass5 = resizableDoubleArray2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        double double2 = resizableDoubleArray0.addElementRolling((double) ' ');
        resizableDoubleArray0.setElement((int) '#', (double) (short) 0);
        resizableDoubleArray0.setNumElements((int) (byte) 100);
        resizableDoubleArray0.contract();
        int int9 = resizableDoubleArray0.getNumElements();
        resizableDoubleArray0.setContractionCriteria((float) 102);
        int int12 = resizableDoubleArray0.start();
        resizableDoubleArray0.setContractionCriteria((float) 32);
        double[] doubleArray15 = resizableDoubleArray0.getElements();
        resizableDoubleArray0.setElement((int) (byte) 10, (double) 36.0f);
        resizableDoubleArray0.addElement((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray((int) (byte) 100);
        int int2 = resizableDoubleArray1.getExpansionMode();
        resizableDoubleArray1.clear();
        resizableDoubleArray1.discardFrontElements(0);
        float float6 = resizableDoubleArray1.getContractionCriteria();
        float float7 = resizableDoubleArray1.getExpansionFactor();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = resizableDoubleArray1.getElement(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: The index specified: 10 is larger than the current number of elements");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 2.5f + "'", float6 == 2.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 2.0f + "'", float7 == 2.0f);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray0 = new org.apache.commons.math.util.ResizableDoubleArray();
        float float1 = resizableDoubleArray0.getExpansionFactor();
        int int2 = resizableDoubleArray0.getNumElements();
        double double4 = resizableDoubleArray0.addElementRolling((double) (-1));
        int int5 = resizableDoubleArray0.start();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.math.util.ResizableDoubleArray resizableDoubleArray1 = new org.apache.commons.math.util.ResizableDoubleArray(11);
        resizableDoubleArray1.setElement(36, (double) 100.5f);
        int int5 = resizableDoubleArray1.getNumElements();
        int int6 = resizableDoubleArray1.getNumElements();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 37 + "'", int6 == 37);
    }
}

