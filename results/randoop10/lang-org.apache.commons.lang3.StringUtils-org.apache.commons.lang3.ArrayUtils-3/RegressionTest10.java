import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, 35);
        int int25 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray14, true, 0);
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, true);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaa                  ...", "     Hi      44444444444444444444444444444                                AAA44444444hi     Hi      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Class<?> wildcardClass8 = floatArray7.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HIHIH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       0.0       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaafalse", 445);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444..." + "'", str2, "true44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaatrue44444444444444444444444444444                                AAA444444444444444444444444444444...");
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 10L);
        double[] doubleArray8 = new double[] {};
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) '4', (double) (byte) -1);
        double[] doubleArray16 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray8, doubleArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 100, (double) 100);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray8, 0, 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 1L);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray3, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 24, Length: 3");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 0.0, 100.0]");
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("falsefalsetruefalsefalsetruetruetruefalse", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "falsefalsetruefalsefalsetruetruetruefalse" + "'", str2, "falsefalsetruefalsefalsetruetruetruefalse");
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("{-1,10,0,10,1,10,0,0}", "                             aaaA", "     Hi      44444444444444444444444444444                                AAA44444444hi     Hi      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{-1,10,0,10,1,10,0,0}" + "'", str3, "{-1,10,0,10,1,10,0,0}");
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("trueaaa                            aaaAtrueaaa                            aaaAtrueaaa                            aaaAfalse", "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HIHIH                                                        aaa##################", 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Aaa444444444444444444444444444...", "0     HIHIH0     HIHIH10    {}444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("{{,#},{,#},{,#},{,#}}", "aaa                            aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{,#},{,#},{,#},{,#}}" + "'", str2, "{{,#},{,#},{,#},{,#}}");
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(byteArray6, (byte) -1);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray6, (byte) 0);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray6, (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.remove(byteArray6, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 65, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###", "                                                                AAA                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray13);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.clone(charArray13);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "      AAAA1      AAA", charArray13);
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.subarray(charArray13, (int) (short) 1, 18);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.subarray(charArray20, 42, (int) (short) 100);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray20, '4');
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" aaahihi... ", "444444444444444444444444444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi.H{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi...{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,hi..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi", "               aaahihi#..");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Aaaa                            aaA001Aaaa                            aaA1Aaaa                            aaA0Aaaa                            aaA1-", "aa                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray8, '4');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, 0);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray19 = org.apache.commons.lang3.ArrayUtils.add(charArray11, 21, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 21, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, 4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a, 4, 4, 4, 4]");
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aAAAa                                                                                               aaaaaA", (java.lang.CharSequence) "1      AAAA1      AAAA10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray2, (byte) 100);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) 10, (int) (short) 100);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray2);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.remove(byteArray2, 445);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 445, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 445);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", "                           ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0" + "'", str3, "1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0");
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                              HIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "{true,false,false,false,true,false}", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray4);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray8);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (short) -1, 12);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0]");
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "{}", 96);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 10, 27);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.clone(floatArray12);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[-1.0, 10.0, 35.0]");
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("           ...", "{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 13, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444tru" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444tru");
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "h aaahihi... ", (java.lang.CharSequence) "10.01.0#############################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "trueaaa                                                                                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaHIHIH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("        0.010.0        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.010.0" + "'", str1, "0.010.0");
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("falsefalsetruefalsefalsetruetruetruefalse", "hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        java.lang.Character[] charArray7 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray7, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray9, '4');
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray9, '4', 3);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("", charArray9);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, #, a, 4, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{{,#},{,#},{,#},{,#}}", "-1A10A0A10A1A10A0A0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray6);
        boolean[] booleanArray20 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray25 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray27);
        boolean[] booleanArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray27);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray20, booleanArray27);
        boolean[] booleanArray37 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray44 = new boolean[] { false, false, true, true, false, true };
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray37, booleanArray44);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray37);
        int int49 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray37, true, (int) '#');
        boolean boolean50 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray20, booleanArray37);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray20);
        boolean[] booleanArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray20);
        java.lang.Boolean[] booleanArray53 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray20);
        short[] shortArray60 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int63 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray60, (short) (byte) 0, (-1));
        short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.add(shortArray60, (short) (byte) -1);
        short[] shortArray67 = org.apache.commons.lang3.ArrayUtils.add(shortArray60, (short) (byte) 1);
        short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray67, (short) (byte) 1);
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.clone(shortArray69);
        java.lang.Short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray69);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray71);
        short[] shortArray79 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int82 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray79, (short) (byte) 0, (-1));
        short[] shortArray84 = org.apache.commons.lang3.ArrayUtils.add(shortArray79, (short) (byte) -1);
        short[] shortArray86 = org.apache.commons.lang3.ArrayUtils.add(shortArray79, (short) (byte) 1);
        short[] shortArray88 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray86, (short) (byte) 1);
        boolean boolean89 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray88);
        short[] shortArray90 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray88);
        short[] shortArray92 = org.apache.commons.lang3.ArrayUtils.add(shortArray88, (short) (byte) -1);
        short[] shortArray93 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray72, shortArray92);
        int int95 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray53, (java.lang.Object) shortArray93, 19);
        boolean boolean96 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray6, shortArray93);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray20), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray53);
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray60), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray65), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray67), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray84), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray86), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray88), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray90), "[0, 0, 10, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray92), "[0, 0, 10, 10, 0, 1, -1]");
        org.junit.Assert.assertNotNull(shortArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray93), "[0, 0, 10, 10, 0, 1, 0, 0, 10, 10, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1110", "       aAA", (-1));
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 27, (int) (byte) 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A AAA 0.0A");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1      aaaA1      aaaA10", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1      aaaA1      aaaA10" + "'", str12, "1      aaaA1      aaaA10");
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}" + "'", str1, "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444444hihi...", "{-1.0,10.0,35.0}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 17);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.add(longArray0, (long) 25);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray5 = org.apache.commons.lang3.ArrayUtils.add(longArray0, 1000, (long) 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1000, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[25]");
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        boolean[] booleanArray5 = new boolean[] { true, false, false, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray9 = new boolean[] { true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        boolean[] booleanArray19 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray26 = new boolean[] { false, false, true, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray26);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray28, false, 93);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray28, true);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray28);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray34);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, false, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, false, true, true, false, false, false, true, false, false, true]");
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "-14-140");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) 27, (double) 'a');
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (double) 10L);
        java.lang.Double[] doubleArray23 = new java.lang.Double[] { 0.0d, 10.0d };
        double[] doubleArray24 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray23);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) doubleArray15, (java.lang.Object) doubleArray24);
        double[] doubleArray26 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.add(doubleArray26, 93, (double) 98);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 93, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0", "4444444444-1a10a0a10a1a10a0a0", "                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0" + "'", str3, "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0");
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444-1a10a0a10a1a10a0a0", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "true   hitrue   hitrue   hif lse");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        java.lang.Float[] floatArray3 = new java.lang.Float[] { 100.0f, 0.0f, (-1.0f) };
        java.lang.Float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray4, (float) 100L);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 100.0d, (-1.0d), (-1.0d), 10.0d, 0.0d };
        java.lang.Double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray12);
        int int15 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) floatArray4, (java.lang.Object) doubleArray12, (int) 'a');
        boolean[] booleanArray21 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray26 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray26, false);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray28);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray28);
        boolean[] booleanArray31 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray21, booleanArray28);
        boolean[] booleanArray33 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray21, false);
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.add(booleanArray21, true);
        java.lang.Boolean[] booleanArray40 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray40, false);
        boolean boolean43 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray42);
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray42);
        boolean boolean45 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray44);
        boolean[] booleanArray52 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray59 = new boolean[] { false, false, true, true, false, true };
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray52, booleanArray59);
        boolean boolean62 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray59, false);
        int int65 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray59, false, (int) (short) 0);
        boolean[] booleanArray66 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray44, booleanArray59);
        int int69 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray66, false, 13);
        boolean[] booleanArray70 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray21, booleanArray66);
        int int72 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray12, (java.lang.Object) booleanArray66, (int) '#');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(booleanArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray21), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray31), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray33), "[false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[false, false, true, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(booleanArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray66), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(booleanArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray70), "[false, false, true, false, false, true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...1A10A0A0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("{a,#,a,4,4,4}", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray14, (float) (short) 100);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray14, (-1), (-1));
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray14);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        short[] shortArray0 = null;
        short[] shortArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray0, (short) (byte) 0);
        org.junit.Assert.assertNull(shortArray2);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        double[] doubleArray0 = null;
        double[] doubleArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray0, (double) 52);
        org.junit.Assert.assertNull(doubleArray2);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                       AAa                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "true   hitrue   hitrue   hif lse", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 3);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.subarray(intArray4, (int) 'a', (int) (short) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray7, 24);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 18);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" aaahihi...  ", "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("aaa                            aaaA", " 0.001 0.1 0.0H!ih 0.001 0.1 0.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi-1A10A0A10A1A10A0A0hi", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE" + "'", str1, "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE");
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("{}", 65, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "-1011001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaa444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                aAA         ", 5, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                aAA         " + "'", str3, "                aAA         ");
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                       AAa                          0.0       ", "aaahihi..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        java.lang.Integer[] intArray3 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 3);
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.add(intArray8, 52);
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray10, 13, 25);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[52]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) charArray0);
        java.lang.Object[] objArray2 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) charArray0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "0.0       ", 35);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(objArray2, (java.lang.Object[]) strArray6);
        java.lang.Object[] objArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) strArray6);
        int int10 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray6);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ,                                  aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ,                                  aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.add(doubleArray1, (double) (short) -1);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 26, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        java.lang.Float[][] floatArray0 = null;
        java.lang.Float[] floatArray5 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray10 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[] floatArray15 = new java.lang.Float[] { 100.0f, 1.0f, 1.0f, (-1.0f) };
        java.lang.Float[][] floatArray16 = new java.lang.Float[][] { floatArray5, floatArray10, floatArray15 };
        java.lang.Float[] floatArray20 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray24 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray28 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray32 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[] floatArray36 = new java.lang.Float[] { (-1.0f), 0.0f, 0.0f };
        java.lang.Float[][] floatArray37 = new java.lang.Float[][] { floatArray20, floatArray24, floatArray28, floatArray32, floatArray36 };
        java.lang.Float[][] floatArray38 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray37);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) floatArray37, 'a');
        java.lang.Float[][] floatArray41 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray0, floatArray37);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isNotEmpty((java.io.Serializable[][]) floatArray41);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        byte[] byteArray0 = null;
        int int2 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH0", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray14, (float) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, 10.0f, (int) (byte) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) (short) 1, 0);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray14);
        float[] floatArray26 = new float[] { (byte) 10 };
        float[] floatArray28 = org.apache.commons.lang3.ArrayUtils.add(floatArray26, (float) (-1));
        float[] floatArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray26);
        float[] floatArray32 = org.apache.commons.lang3.ArrayUtils.add(floatArray29, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray29);
        float[] floatArray34 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray29);
        int int37 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray29, (float) 94, 94);
        float[] floatArray39 = org.apache.commons.lang3.ArrayUtils.add(floatArray29, (float) 93);
        float[] floatArray40 = org.apache.commons.lang3.ArrayUtils.clone(floatArray29);
        int int42 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray29, (float) 52);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray29, 0.0f, (int) '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[10.0, 93.0]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[10.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean[] booleanArray22 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray29 = new boolean[] { false, false, true, true, false, true };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray22, booleanArray29);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray22);
        int int34 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray22, true, (int) '#');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray5, booleanArray22);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray22, true);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray37, true);
        boolean[] booleanArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray37);
        boolean[] booleanArray47 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray54 = new boolean[] { false, false, true, true, false, true };
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray47, booleanArray54);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray54, false);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray54, false, (int) (short) 0);
        java.lang.Boolean[] booleanArray61 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray54);
        boolean[] booleanArray63 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray54, false);
        java.lang.Boolean[] booleanArray64 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray63);
        boolean[] booleanArray65 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray40, booleanArray63);
        boolean[] booleanArray66 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray65);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray22), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray29), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[false, false, false, true, false]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(booleanArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray40), "[false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray47), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray54), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(booleanArray61);
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray64);
        org.junit.Assert.assertNotNull(booleanArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray65), "[false, false, false, true, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray66), "[false, false, false, true, false, false, true, true, false, true]");
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        long[] longArray0 = null;
        long[] longArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray0, (long) 24);
        org.junit.Assert.assertNull(longArray2);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-11001011000-11001011000-11001011000-11 aaahihi..." + "'", str1, "-11001011000-11001011000-11001011000-11 aaahihi...");
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray9);
        byte[] byteArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray9);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray22, (byte) -1);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray22);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("            hI             ", "...1A10A0A0", "itrueaaah");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, '#');
        java.lang.Character[] charArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray14);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        boolean[] booleanArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray0, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444                                AAA44444444hi", "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa", "                      4!iha!iha!ih !ih4!ih                      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             ", "     Hi      44444444444444444444444444444                                AAA44444444hi     Hi      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaHIHIH", 25, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("{-1,10,10,1,10,0,0}", 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("          a#a444          ", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hihiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIH" + "'", str1, "HIHIH");
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         " + "'", str1, "                                         ");
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        java.lang.Long[] longArray25 = org.apache.commons.lang3.ArrayUtils.toObject(longArray19);
        java.lang.String str27 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) longArray25, "-10110010");
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray25);
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.subarray(longArray28, 99, 27);
        java.lang.Long[] longArray32 = org.apache.commons.lang3.ArrayUtils.toObject(longArray31);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray31);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{-1,-1,0}" + "'", str27, "{-1,-1,0}");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[]");
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "aaa4444444444444444444444444444444441.0444444aaaaaa4444444444444444444444444444444441.04444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("1001-1010", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-1010" + "'", str2, "1001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-10101001-1010");
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      a444#a       ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      a444#a       " + "'", str3, "      a444#a       ");
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                           ", "100 1", "1.0a0.0                              HIHIH                                                      ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           " + "'", str3, "                           ");
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '4');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        char[] charArray2 = new char[] { ' ', '#' };
        char[] charArray5 = new char[] { ' ', '#' };
        char[] charArray8 = new char[] { ' ', '#' };
        char[] charArray11 = new char[] { ' ', '#' };
        char[][] charArray12 = new char[][] { charArray2, charArray5, charArray8, charArray11 };
        char[] charArray19 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 'a');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.add(charArray19, ' ');
        char[] charArray30 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray32 = org.apache.commons.lang3.ArrayUtils.add(charArray30, 'a');
        char[] charArray34 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray30, '#');
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray34);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray19, charArray34);
        char[][] charArray37 = org.apache.commons.lang3.ArrayUtils.add(charArray12, charArray34);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray34);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray40 = org.apache.commons.lang3.ArrayUtils.remove(charArray34, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1000, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , #]");
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("10.0a", "aaahihi...", "hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia", 52);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10.0a" + "'", str4, "10.0a");
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA1", "{0,10,1,1,0}");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("99", "eslafeurteurteurteslafeslafeurteslafeslaf");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                    ", 3);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray7);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        boolean boolean18 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.subarray(intArray4, 164, (int) '4');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray25, (long) 0);
        long[] longArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray27, (long) 2);
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.add(longArray29, 3, (long) (short) 0);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.remove(longArray32, 0);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray34, 1L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[1, 100, 0, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[1, 100, 0, 0, 1]");
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi", "                       flse4flse4true4true4flse4true4flse", "aaahihi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi" + "'", str3, "hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi-1a10a0a10a1a10a0a0hi");
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444...", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444..." + "'", str2, "4444444444444444444444444...");
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("trueaaa                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                             aaaeurt" + "'", str1, "                                                                                             aaaeurt");
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", "0.0       ", 35);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("-1100100-10", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1100100-10" + "'", str6, "-1100100-10");
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###", 32, "101101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###10110110110110110110110110110" + "'", str3, "###10110110110110110110110110110");
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa", "0.01      AAAA1      AAAA11.01      AAAA1      AAAA1100.01      AAAA1      AAAA110.01      AAAA1      AAAA110.01      AAAA1      AAAA1-1.0", "{a,#,a,4,4,4}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa" + "'", str3, "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa");
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        java.lang.Long[] longArray6 = new java.lang.Long[] { 0L, (-1L), 100L, 10L, 1L, 1L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray6, (long) 17);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) longArray6, ' ', (int) 'a', 96);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[0, -1, 100, 10, 1, 1]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[0, -1, 100, 10, 1, 1]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                ...", "eslafihaaaeurtihaaaeurtihaaaeurt", 432);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray6);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 10);
        short[] shortArray13 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray6, (short) 1);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray13), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  4444444444444444444444444...   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  4444444444444444444444444...   " + "'", str1, "  4444444444444444444444444...   ");
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                             ...ihihaaa 11-00011010011-00011010011-00011010011-                                            ", "false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             ...ihihaaa 11-00011010011-00011010011-00011010011-                                            " + "'", str2, "                                             ...ihihaaa 11-00011010011-00011010011-00011010011-                                            ");
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        int[] intArray0 = null;
        int[] intArray1 = new int[] {};
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray1, (-1));
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray5);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.contains(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray2);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, 28, (int) ' ');
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.subarray(intArray2, (int) (byte) 10, (int) '#');
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray2);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 6);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[6]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...", (int) (byte) -1, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, (int) ' ', 10);
        java.lang.Integer[] intArray18 = org.apache.commons.lang3.ArrayUtils.toObject(intArray8);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18);
        int[] intArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18, 35);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray21, (int) (short) 100, (int) '4');
        int[] intArray27 = org.apache.commons.lang3.ArrayUtils.subarray(intArray21, (int) (byte) 0, (int) (byte) 1);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray21, 2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                           ", "trueaaah      aaaAhifalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("ahaaahaaahaaahaaahaaahaaa.1a0.01", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap5 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        java.lang.Float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        java.lang.Float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        java.lang.Float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray6);
        float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray6);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[2.0, 52.0, -1.0]");
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.clone(byteArray20);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray21, (byte) 10, 35);
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.add(byteArray21, 0, (byte) -1);
        int int30 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray21, (byte) 1, 52);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[-1, -1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaa", "-,-,-", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa" + "'", str3, "aaa");
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", 18, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1," + "'", str3, "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        java.lang.Long[] longArray25 = org.apache.commons.lang3.ArrayUtils.toObject(longArray19);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray19, (-1), 3);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray19, (long) 432);
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray30, (long) 6);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("{10.0}", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{10.0}" + "'", str2, "{10.0}");
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", " hi!4hi! hi!ahi!ahi!4", (int) (short) 100, 164);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " hi!4hi! hi!ahi!ahi!4" + "'", str4, " hi!4hi! hi!ahi!ahi!4");
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}", "aaa444", 27);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "");
        long[] longArray15 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray17 = org.apache.commons.lang3.ArrayUtils.add(longArray15, (long) (short) 1);
        long[] longArray23 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.add(longArray23, (long) (short) 1);
        long[] longArray29 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(longArray29, (long) ' ');
        long[] longArray32 = org.apache.commons.lang3.ArrayUtils.addAll(longArray25, longArray29);
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray29);
        long[] longArray34 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray15);
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray34);
        long[] longArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray35, (long) 0);
        double[] doubleArray39 = new double[] { 1.0f };
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray39);
        double[] doubleArray43 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray39, (int) (short) 10, (int) ' ');
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray37, (java.lang.Object) doubleArray39);
        int int45 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray9, (java.lang.Object) boolean44);
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray50 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                aaa                                 ", "                                                                aaa                                 ", (int) (byte) 10);
        int int53 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray50, (java.lang.Object) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAIH!ih", 42);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.replaceEach("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA", strArray9, strArray50);
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.replaceEach("trueaaahitrueaaahitrueaaahifalse", strArray4, strArray50);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}" + "'", str5, "{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray17), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray32), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA" + "'", str54, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "trueaaahitrueaaahitrueaaahifalse" + "'", str55, "trueaaahitrueaaahitrueaaahifalse");
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[][] doubleArray2 = new double[][] { doubleArray0, doubleArray1 };
        double[][] doubleArray5 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray2, 0, (int) (short) 10);
        java.lang.Object[] objArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty((java.lang.Object[]) doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) doubleArray2, ' ', 6, 164);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[]");
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[[], []]");
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAA4444444444-1A10A0A10...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("-10110010AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", "              1110               ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", (java.lang.CharSequence) "1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0" + "'", charSequence2, "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0");
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray7);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray7);
        int[] intArray20 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, 100);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray20);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.contains(intArray20, (int) (byte) 10);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray20);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray20);
        int[] intArray28 = org.apache.commons.lang3.ArrayUtils.addAll(intArray15, intArray20);
        int[] intArray30 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray15, 2);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.contains(intArray15, 13);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[100, 1, 35, 10, 100, 1, 35, 10]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "TRUE", "aaahi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray7);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        int[] intArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, 98);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray18);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("trueaaahtru   eaaahfalse", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtru   eaaahfalse" + "'", str2, "trueaaahtru   eaaahfalse");
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) 100);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 100, (double) (-1));
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray0, doubleArray6);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray10, 0, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray10, 432);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 432, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 35.0, 0.0]");
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray12);
        char[] charArray17 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray18 = org.apache.commons.lang3.ArrayUtils.toObject(charArray17);
        char[] charArray19 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.subarray(charArray17, 8, (int) ' ');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.clone(charArray17);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray12, charArray17);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray12);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, #,  ]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) (byte) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray8, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.clone(shortArray4);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray4);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray4, (short) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray17), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa" + "'", str1, "-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "10.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1011001" + "'", str8, "-1011001");
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                          ", "       AAA     HIHIH     HIHIH     HIHIH  ", "100#############################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          " + "'", str3, "                                          ");
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "{{ ,#},{ ,#},{ ,#},{ ,#}}                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray5, (double) (byte) -1);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray5, (double) 0L, (int) (byte) 100);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        org.apache.commons.lang3.ArrayUtils.reverse(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1      aaaa1      aaaa10", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray7);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, (int) (short) 0);
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, 0);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray19);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAA                                                                                               aaaA", "                                             aaa                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 1 };
        byte[] byteArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray3);
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray3, (byte) -1, 98);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.clone(byteArray3);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,", "...1A10A0A0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("-1A10A0A10A1A10A0A0");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray16 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray23 = new boolean[] { false, false, true, true, false, true };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray16, booleanArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, false);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, false, (int) (short) 0);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray23);
        boolean[] booleanArray32 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray30, false);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray32), "[true, true, true, false, false, true, true, false, true]");
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                 AAA                                                                                               aaa", "truetruetruefalse               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAA1      AAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray19);
        java.lang.Boolean[] booleanArray25 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        java.lang.Long[] longArray34 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray34);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) longArray34, (java.lang.Object) (short) 100);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) booleanArray25, (java.lang.Object) longArray34);
        java.lang.Boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray25);
        boolean[] booleanArray41 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray25, false);
        boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray19, booleanArray41);
        boolean[] booleanArray43 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray19);
        boolean[] booleanArray44 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray43);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray20);
        org.junit.Assert.assertNotNull(booleanArray25);
        org.junit.Assert.assertNotNull(booleanArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray27), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertNotNull(booleanArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray41), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray42), "[false, false, true, true, false, true, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray43), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray44), "[false, false, true, true, false, true, false]");
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihi...", "", 96);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("a#a444", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", "-1011001");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        java.lang.Object obj0 = null;
        long[] longArray1 = null;
        long[] longArray7 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.add(longArray7, (long) (short) 1);
        long[] longArray13 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(longArray13, (long) ' ');
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.addAll(longArray9, longArray13);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray16);
        long[] longArray23 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.add(longArray23, (long) (short) 1);
        long[] longArray31 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray33 = org.apache.commons.lang3.ArrayUtils.add(longArray31, (long) (short) 1);
        long[] longArray37 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(longArray37, (long) ' ');
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.addAll(longArray33, longArray37);
        long[] longArray41 = org.apache.commons.lang3.ArrayUtils.addAll(longArray23, longArray37);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray37);
        java.lang.Long[] longArray43 = org.apache.commons.lang3.ArrayUtils.toObject(longArray37);
        long[] longArray44 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray43);
        long[] longArray45 = org.apache.commons.lang3.ArrayUtils.addAll(longArray16, longArray44);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray1, longArray45);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isSameType(obj0, (java.lang.Object) longArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray33), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray37), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray45), "[0, -1, -1, 97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRaaaRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR", "1.0a0.0", 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RRRRRR1.0a0.0RRRRRR" + "'", str3, "RRRRRR1.0a0.0RRRRRR");
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("###10110110110110110110110110110", "       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAAaaahihi...       aAA", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        java.lang.Character[] charArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY;
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0, '#');
        java.lang.Character[] charArray3 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray3);
        char[] charArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray8 = org.apache.commons.lang3.ArrayUtils.remove(charArray6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        boolean[] booleanArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray3 = org.apache.commons.lang3.ArrayUtils.add(booleanArray0, 23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       aaa" + "'", str1, "       aaa");
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        byte[] byteArray0 = null;
        byte[] byteArray3 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, 26, 0);
        org.junit.Assert.assertNull(byteArray3);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        java.lang.Long[] longArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_LONG_OBJECT_ARRAY;
        java.lang.Long[] longArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray0);
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) longArray1);
        long[] longArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray1);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[]");
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        java.lang.Character[] charArray0 = new java.lang.Character[] {};
        java.lang.Character[] charArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray0);
        char[] charArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray0);
        char[] charArray3 = org.apache.commons.lang3.ArrayUtils.clone(charArray2);
        java.lang.Character[] charArray4 = org.apache.commons.lang3.ArrayUtils.toObject(charArray2);
        char[] charArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray4);
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray5, '#');
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("... aa-11001011000-11001011000-11001011000-11 aaahihi...  ", "aaa4444444444-1a10a0a10a1a10a0a0", "HIHIH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... aa-11001011000-11001011000-11001011000-11 aaahihi...  " + "'", str3, "... aa-11001011000-11001011000-11001011000-11 aaahihi...  ");
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa" + "'", str2, "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa");
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 142 + "'", int2 == 142);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("{true,false,false,false,true,false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{true,false,false,false,true,false}" + "'", str1, "{true,false,false,false,true,false}");
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray19 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) (byte) 0, (-1));
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) (byte) -1);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) (byte) 1);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) (byte) 10);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray19);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.contains(shortArray12, (short) (byte) 0);
        short[] shortArray38 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int41 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray38, (short) (byte) 0, (-1));
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray38, (short) (byte) 1);
        short[] shortArray50 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int53 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray50, (short) (byte) 0, (-1));
        boolean boolean54 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray38, shortArray50);
        short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray38, (short) 1);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray56, (short) 10);
        boolean boolean59 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray12, shortArray56);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray56);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray62 = org.apache.commons.lang3.ArrayUtils.remove(shortArray56, 432);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 432, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 0, 10, 1, 10, 0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray38), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray56), "[0, 10, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("false4false4true4true4false4true4false", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("      aaaA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        int int6 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray1, 0.0f, 100);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 0L);
        float[] floatArray11 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, 10, (int) (byte) 10);
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray17 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray8, (int) (short) 10, 10);
        float[] floatArray18 = null;
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray8, floatArray18);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(floatArray19, 0.0f);
        float[] floatArray23 = new float[] { (byte) 10 };
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) (-1));
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray25, (float) '4');
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray27);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(floatArray27, (float) 10);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray27, 10.0f, (int) (byte) 10);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray27, (float) (short) 1, 0);
        int int39 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray27, (float) 99, 2);
        float[] floatArray41 = new float[] { (byte) 10 };
        float[] floatArray43 = org.apache.commons.lang3.ArrayUtils.add(floatArray41, (float) (-1));
        int int46 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray41, 0.0f, 100);
        float[] floatArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray41, (float) 0L);
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray48, 10, (int) (byte) 10);
        float[] floatArray54 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray48, (int) (byte) 1, (int) (byte) 10);
        float[] floatArray57 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray48, (int) (short) 10, 10);
        float[] floatArray58 = null;
        float[] floatArray59 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray48, floatArray58);
        float[] floatArray61 = new float[] { (byte) 10 };
        float[] floatArray63 = org.apache.commons.lang3.ArrayUtils.add(floatArray61, (float) (-1));
        float[] floatArray64 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray61);
        float[] floatArray67 = org.apache.commons.lang3.ArrayUtils.add(floatArray64, (int) (short) 0, (float) (short) -1);
        boolean boolean68 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray64);
        float[] floatArray69 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray48, floatArray64);
        float[] floatArray72 = org.apache.commons.lang3.ArrayUtils.add(floatArray64, 1, (float) 99);
        float[] floatArray73 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray27, floatArray72);
        float[] floatArray74 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray19, floatArray72);
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray19, (float) 244);
        int int79 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray19, (float) 93, 99);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray17), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray43), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray48), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[]");
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray54), "[]");
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray57), "[]");
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray59), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray61), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray63), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray64), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray67), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray69), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[10.0, 99.0]");
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray73), "[10.0, -1.0, 52.0, 10.0, 99.0]");
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[10.0, 10.0, 99.0]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0.0A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0A" + "'", str1, "0.0A");
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HIHIH######################", " 0.001 0.1 0.0H!ih 0.001 0.1 0.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("falsefalsetruetruefalsetrue", (int) (short) -1, "aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAAaaahihi... aAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "falsefalsetruetruefalsetrue" + "'", str3, "falsefalsetruetruefalsetrue");
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17, (short) (byte) 0);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray19, (short) 1);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray21, (short) (byte) 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray5 = null;
        float[] floatArray6 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray1, floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray1, (float) 19);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray1, 10.0f, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, 445, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 445, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "100", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                ...", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                ..." + "'", str2, "                ...");
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444aaa444444444444444444444444444444", "                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 14, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0.0a", 516);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a");
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("-1 Hihih 1 1HihihHihih 1", "-1011001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hihih 1 1HihihHihih 1" + "'", str2, " Hihih 1 1HihihHihih 1");
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.contains(longArray24, (long) 5);
        java.lang.Long[] longArray28 = org.apache.commons.lang3.ArrayUtils.toObject(longArray24);
        long[] longArray30 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray28, (long) 2);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray32 = org.apache.commons.lang3.ArrayUtils.remove(longArray30, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 99, Length: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray30), "[97, 0, 1, 100, 0]");
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray4);
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray14);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.contains(floatArray14, (float) 10);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray14, 10.0f, (int) (byte) 10);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray14, (float) (short) 1, 0);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray4, floatArray14);
        java.lang.Float[] floatArray31 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray31, 1.0f);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray4, floatArray33);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            float[] floatArray37 = org.apache.commons.lang3.ArrayUtils.remove(floatArray4, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi.." + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..");
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        byte[][][][][] byteArray0 = new byte[][][][][] {};
        // The following exception was thrown during execution in test generation
        try {
            byte[][][][][] byteArray2 = org.apache.commons.lang3.ArrayUtils.remove(byteArray0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(longArray24, (long) (byte) 100);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        java.lang.Class<?> wildcardClass28 = longArray24.getClass();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        short[] shortArray19 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) (byte) 0, (-1));
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) (byte) -1);
        short[] shortArray26 = org.apache.commons.lang3.ArrayUtils.add(shortArray19, (short) (byte) 1);
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) (byte) 10);
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray12, shortArray19);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray12);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray12, (short) (byte) 0, 93);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[0, 0, 10, 1, 10, 0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aAAaaahihi... aAAaaah...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaHihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAaaahihi... aAAaaah..." + "'", str2, "aAAaaahihi... aAAaaah...");
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-10110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "{-1,10,0,10,1,10,0,0}", 4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("aAA", "{97,0,1,100,0}", 25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny("10.0a", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                 aaa                                                            aaaA", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HIHIH                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "                             aaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("false0false0true0true0false0true", "-1a10a0.0-------------------------------------------------", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "{-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray17, false);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray17);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.add(booleanArray17, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("truetruetruefalse", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "truetruetruefalse" + "'", str2, "truetruetruefalse");
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray6, (short) (byte) 0, (-1));
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray6);
        short[] shortArray12 = org.apache.commons.lang3.ArrayUtils.clone(shortArray6);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(shortArray6, (short) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.add(shortArray6, 23, (short) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 23, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray12), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(",", "aAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("      AAAA1      A", "{0,10,1,1,0}", 3, 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   {0,10,1,1,0}" + "'", str4, "   {0,10,1,1,0}");
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "hi!");
        int int4 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) (short) -1);
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) strArray2);
        double[] doubleArray6 = new double[] {};
        int int9 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) '4', (double) (byte) -1);
        double[] doubleArray14 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray6, doubleArray14);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray6, (double) 100, (double) 100);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray6, 0, 0);
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray6, (double) 1L);
        double[] doubleArray24 = new double[] {};
        int int27 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray24, (double) '4', (double) (byte) -1);
        double[] doubleArray32 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean33 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray24, doubleArray32);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray24, (double) 100, (double) 100);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray6, doubleArray24);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray24, (double) (-1L));
        int int42 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray24, (double) (short) 10, 0);
        int int43 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray2, (java.lang.Object) doubleArray24);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray46 = org.apache.commons.lang3.ArrayUtils.add(doubleArray24, 5, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 5, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray8);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray8, '4');
        int int13 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '#');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.remove(charArray11, 0);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray15);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a4444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a4444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a, 4, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1.0a0.0", "RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRaaaRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0a0.0" + "'", str2, "1.0a0.0");
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) 'a', 35, (double) 28);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 10.0f, 0.0d);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray1, 0.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 1, 516);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hiaaaaaaaa", "10               HIHIH               1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiaaaaaaaa" + "'", str2, "hiaaaaaaaa");
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0.0 1.0 100.0 10.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.01.0100.010.010.0-1.0" + "'", str1, "0.01.0100.010.010.0-1.0");
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("... AA-11001011000-11001011000-11001011000-11 AAAHIHI...  ", "-1AAA                            AAAA0AAA                            AAAA1AAA                            AAAA100AAA                            AAAA1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... AA-11001011000-11001011000-11001011000-11 AAAHIHI..." + "'", str2, "... AA-11001011000-11001011000-11001011000-11 AAAHIHI...");
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        char[] charArray5 = new char[] { '4', '#', '4', ' ', ' ' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.add(charArray5, '4');
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.subarray(charArray7, 42, 100);
        java.lang.Character[] charArray11 = org.apache.commons.lang3.ArrayUtils.toObject(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray13 = org.apache.commons.lang3.ArrayUtils.remove(charArray10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4#4  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4#4  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #, 4,  ,  ]");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4#4  4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4#4  4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, #, 4,  ,  , 4]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertNotNull(charArray11);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray4);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.add(shortArray4, (short) 1);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray19, (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[10, -1]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[10, -1, 1]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[10, 1]");
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " 4 aa4a", (java.lang.CharSequence) "{{ ,#},{ ,#},{ ,#},{ ,#}}");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                aaa", "        0.010.0        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0.0-------------------------------------------------", 13, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0-------------------------------------------------" + "'", str3, "0.0-------------------------------------------------");
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        int[] intArray0 = new int[] {};
        int[] intArray1 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.clone(intArray0);
        int[] intArray4 = new int[] {};
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (int) (short) 1);
        int[] intArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray4, (-1));
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        int int11 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 27);
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.addAll(intArray0, intArray4);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray12);
        java.lang.Integer[] intArray14 = org.apache.commons.lang3.ArrayUtils.toObject(intArray13);
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = org.apache.commons.lang3.ArrayUtils.add(intArray13, 93, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 93, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        java.lang.Short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray19, (short) (byte) 10);
        java.lang.Short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        java.lang.Short[] shortArray23 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertNotNull(shortArray23);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("93933393943", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "93933393943" + "'", str2, "93933393943");
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0                                  ", 106);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray5);
        java.lang.Boolean[] booleanArray23 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray5);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, false, false]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "11100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH011100     HIHIH0     HIHIH10     HIHIH1     HIHIH10     HIHIH01110", "{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,{-1,10,10,1,10,0,0}{-1,10,10,1,10,0,0}{-1,10,10,1,");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAA10.0-------------------------------------------------.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01", "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray2);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 10.0d, 1.0d };
        double[] doubleArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2, (double) 1);
        java.lang.Double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        java.lang.Double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray2);
        double[] doubleArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray6, 1.0d);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, 0.0d, 1);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 106, (double) 5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray16, (short) 10);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) 100);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray20, (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray6);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray6, true, (int) '#');
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray6, true);
        org.apache.commons.lang3.ArrayUtils.reverse(booleanArray6);
        int int24 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray6, false, 0);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, true, false, false, false, true]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     aaah1", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1" + "'", str3, "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1");
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0.01.0100.010.010.0-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray6, (byte) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray8, (byte) 0, 10);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray8);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 25);
        java.lang.Double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.add(doubleArray6, 18, (double) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 18, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        char[] charArray10 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray10, 'a');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.add(charArray10, ' ');
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray10);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray15, 'a', (int) (byte) 10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaahi", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "10.0a1.0", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("aaahihi...", charArray15);
        boolean boolean23 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray15);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray5, (java.lang.Object) '4');
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("-10110010");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) byteArray5, (java.lang.Object) strArray14);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("-1a10a0a10a1a10a0a0", "1.0A0.0                              hihih                                                      ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("{-", "                                 aaa                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{-" + "'", str2, "{-");
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", 14, "                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     AAAH", 33, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray25, (long) 0);
        double[] doubleArray29 = new double[] { 1.0f };
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray29);
        double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray29, (int) (short) 10, (int) ' ');
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray27, (java.lang.Object) doubleArray29);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray27);
        long[] longArray41 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.add(longArray41, (long) (short) 1);
        long[] longArray49 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.add(longArray49, (long) (short) 1);
        long[] longArray55 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.contains(longArray55, (long) ' ');
        long[] longArray58 = org.apache.commons.lang3.ArrayUtils.addAll(longArray51, longArray55);
        long[] longArray59 = org.apache.commons.lang3.ArrayUtils.addAll(longArray41, longArray55);
        long[] longArray60 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray55);
        java.lang.Long[] longArray61 = org.apache.commons.lang3.ArrayUtils.toObject(longArray55);
        long[] longArray62 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray61);
        long[] longArray63 = org.apache.commons.lang3.ArrayUtils.addAll(longArray27, longArray62);
        long[] longArray69 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray71 = org.apache.commons.lang3.ArrayUtils.add(longArray69, (long) (short) 1);
        long[] longArray77 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray79 = org.apache.commons.lang3.ArrayUtils.add(longArray77, (long) (short) 1);
        long[] longArray83 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean85 = org.apache.commons.lang3.ArrayUtils.contains(longArray83, (long) ' ');
        long[] longArray86 = org.apache.commons.lang3.ArrayUtils.addAll(longArray79, longArray83);
        long[] longArray87 = org.apache.commons.lang3.ArrayUtils.addAll(longArray69, longArray83);
        long[] longArray88 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray69);
        long[] longArray89 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray88);
        long[] longArray91 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray89, (long) 0);
        long[] longArray93 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray91, (long) 2);
        long[] longArray94 = org.apache.commons.lang3.ArrayUtils.clone(longArray91);
        long[] longArray95 = org.apache.commons.lang3.ArrayUtils.addAll(longArray63, longArray94);
        long[] longArray96 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray63);
        // The following exception was thrown during execution in test generation
        try {
            long[] longArray98 = org.apache.commons.lang3.ArrayUtils.remove(longArray96, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 27, Length: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray41), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray49), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray58), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray59), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray60), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray62), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray63), "[97, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray69), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray71), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray77), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray79), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray83), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray86), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray87), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray88), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray89), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray91), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray93), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray94), "[97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray95), "[97, 1, 100, 0, -1, -1, 0, 97, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray96), "[97, 1, 100, 0, -1, -1, 0]");
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("   {0,10,1,1,0}", "{true,false,false,false,true,false}", "                                aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   {0,10,1,1,0}" + "'", str3, "   {0,10,1,1,0}");
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   #" + "'", str2, "                                                   #");
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("trueaaahtrueaaahtrueaaahfalse                                ", "1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "trueaaahtrueaaahtrueaaahfalse                                " + "'", str2, "trueaaahtrueaaahtrueaaahfalse                                ");
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        char[] charArray6 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.add(charArray6, 'a');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.toObject(charArray8);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray8);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray8);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, a, a,  , 4,  ]");
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                {-1,10,10,1,10,0,0}                       ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        int[] intArray5 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray6 = org.apache.commons.lang3.ArrayUtils.toObject(intArray5);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray5, intArray7);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.clone(intArray7);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray16);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("   {0,10,1,1,0}", "                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "0.1A0.01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.1A0.01" + "'", str1, "0.1A0.01");
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("10.0a1.0");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("AaaaaaA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HIHIh", (java.lang.CharSequence) "... aa-11001011000-11001011000-11001011000-11 aaahihi...  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57 + "'", int2 == 57);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) (byte) -1);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(floatArray7);
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray7, (float) '#');
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray12, (int) (byte) 10, 27);
        java.lang.Float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray12);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray12, (float) 1L);
        float[] floatArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray19, (float) (byte) 1, 99);
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.contains(floatArray19, (float) 32);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[-1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray5);
        long[] longArray25 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray24);
        long[] longArray28 = org.apache.commons.lang3.ArrayUtils.subarray(longArray25, (int) (short) -1, 0);
        long[] longArray34 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.add(longArray34, (long) (short) 1);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray28, longArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray36);
        long[] longArray44 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.add(longArray44, (long) (short) 1);
        long[] longArray50 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains(longArray50, (long) ' ');
        long[] longArray53 = org.apache.commons.lang3.ArrayUtils.addAll(longArray46, longArray50);
        long[] longArray55 = org.apache.commons.lang3.ArrayUtils.add(longArray50, (long) (-1));
        long[] longArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray55);
        java.lang.Long[] longArray57 = org.apache.commons.lang3.ArrayUtils.toObject(longArray55);
        boolean boolean58 = org.apache.commons.lang3.ArrayUtils.isSameLength(longArray36, longArray55);
        int int60 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray55, (long) (byte) 100);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray25), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray34), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray44), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray50), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray53), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray55), "[-1, -1, 0, -1]");
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray56), "[-1, -1, 0, -1]");
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("{true,false,false,false,true,false}");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.0                                                                aaa                                 1.0                                                                aaa                                 100.0                                                                aaa                                 10.0                                                                aaa                                 10.0                                                                aaa                                 -1.0", (int) ' ', 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 115 + "'", int3 == 115);
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.0", "44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(",aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",aaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, ",aaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        java.lang.Double[] doubleArray2 = new java.lang.Double[] { 0.0d, 10.0d };
        double[] doubleArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray2);
        double[] doubleArray4 = new double[] {};
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray4, (double) '4', (double) (byte) -1);
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray12);
        double[] doubleArray19 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray19);
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray4, doubleArray19);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) 10.0f, (int) (byte) 10);
        double[] doubleArray27 = org.apache.commons.lang3.ArrayUtils.add(doubleArray19, 1, (double) 0.0f);
        double[] doubleArray28 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray27);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) (-1L), 28, (double) 99);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 10.0, -1.0, 0.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0.01.0100.010.010.0-1.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.01.0100.010.010.0-1.0" + "'", str1, "0.01.0100.010.010.0-1.0");
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hihi...                  ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 445);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, '#');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, (int) (short) 1, (int) (short) -1);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray11);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, ' ', (int) 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, ' ', (-1));
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray17);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray18, true);
        java.lang.Class<?> wildcardClass21 = booleanArray18.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) (-1L), (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, 100.0d, (double) 100.0f);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray1, (double) 139);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAA                                                                                               aaaA", "-1100100-10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                  aaahihi#..    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("10.0a1.", "hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA", 42, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...     aAA       aAA       aAA       a..." + "'", str3, "...     aAA       aAA       aAA       a...");
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAA1## AAAA1 ##1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAA1## AAAA1 ##1" + "'", str1, "aAAA1## AAAA1 ##1");
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa0.0--------------------0.0aaaaaaa110010aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "          a#a444          ", "hihi...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("10.01.0                                                                                                   ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.01.0                                                                                                   " + "'", str3, "10.01.0                                                                                                   ");
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        long[] longArray0 = null;
        long[] longArray6 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.add(longArray6, (long) (short) 1);
        long[] longArray12 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.contains(longArray12, (long) ' ');
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.addAll(longArray8, longArray12);
        long[] longArray16 = org.apache.commons.lang3.ArrayUtils.addAll(longArray0, longArray8);
        int int17 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) longArray8);
        long[] longArray19 = org.apache.commons.lang3.ArrayUtils.add(longArray8, (long) 10);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(longArray19, (long) 19, (int) (short) 1);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray12), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[97, 0, 1, 100, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI...", "       aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                 aaa", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str4, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str8, "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 " + "'", str1, "                 ");
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) (-1L), (double) 100);
        double[] doubleArray7 = new double[] { 1.0f };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray1, doubleArray7);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray1, (double) 9);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray1, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 17, Length: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("{35.0,0.0,100.0}", " Hihih 1 1HihihHihih 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{35.0,0.0,100.0}" + "'", str2, "{35.0,0.0,100.0}");
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi." + "'", str1, "hi.");
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  aaahi   ", "-1011001", "                                                                                             aaaeurt");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  aaahi   " + "'", str3, "  aaahi   ");
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "                                 aAAAa                                                                                               aaaaaA", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HIHIH######################", "Aaaaaa                                                                                               aAAAa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        boolean[] booleanArray0 = null;
        boolean[] booleanArray7 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray14 = new boolean[] { false, false, true, true, false, true };
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray7, booleanArray14);
        boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray14);
        boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray0, booleanArray14);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray14, false, 35);
        boolean[] booleanArray24 = org.apache.commons.lang3.ArrayUtils.add(booleanArray14, true);
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray24);
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray18), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(booleanArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray24), "[false, false, true, true, false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("10               HIHIH               1", "eslafeurteurteurteslafeslafeurteslafeslaf", 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("-1a10a0.0-------------------------------------------------");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1a10a0.0-------------------------------------------------" + "'", str1, "-1a10a0.0-------------------------------------------------");
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA" + "'", str2, "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1      AAAA1      AAAA", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("eslafeurteurteurteslafeslafeurteslafeslaf", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eslafeurteurteurteslafeslafeurteslafeslaf" + "'", str2, "eslafeurteurteurteslafeslafeurteslafeslaf");
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ahaaahaaahaaahaaahaaahaaa.1a0.01", "   ", "       aaa                  ", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ahaaahaaahaaahaaahaaahaaa.1a0.01" + "'", str4, "ahaaahaaahaaahaaahaaahaaa.1a0.01");
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents((java.lang.CharSequence) "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str1, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        float[] floatArray6 = new float[] { (byte) -1, 100L, 100.0f, 100L, 1, 10.0f };
        float[] floatArray8 = new float[] { (byte) 10 };
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (-1));
        int int13 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, 0.0f, 100);
        float[] floatArray15 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray8, (float) 0L);
        float[] floatArray16 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray6, floatArray8);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray16, (float) (byte) 1);
        float[] floatArray20 = new float[] { (byte) 10 };
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.add(floatArray20, (float) (-1));
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.add(floatArray22, (float) '4');
        boolean boolean25 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray24);
        float[] floatArray27 = org.apache.commons.lang3.ArrayUtils.add(floatArray24, (float) (-1L));
        float[] floatArray29 = new float[] { (byte) 10 };
        float[] floatArray31 = org.apache.commons.lang3.ArrayUtils.add(floatArray29, (float) (-1));
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.add(floatArray31, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray31);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray27, floatArray31);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray16, floatArray31);
        short[] shortArray43 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int46 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray43, (short) (byte) 0, (-1));
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) (byte) -1);
        short[] shortArray50 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray43);
        short[] shortArray52 = org.apache.commons.lang3.ArrayUtils.clone(shortArray43);
        java.lang.Short[] shortArray55 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray55, (short) 1);
        short[] shortArray64 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int67 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray64, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray64);
        short[] shortArray69 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray57, shortArray64);
        java.lang.Short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray69);
        java.lang.Short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray70);
        short[] shortArray72 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray71);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.add(shortArray72, (short) 0);
        boolean boolean75 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray72);
        short[] shortArray76 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray52, shortArray72);
        short[] shortArray79 = org.apache.commons.lang3.ArrayUtils.add(shortArray76, (int) (byte) 0, (short) (byte) 100);
        int int81 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray76, (short) 0);
        short[] shortArray83 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray76, (short) (byte) 1);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) floatArray31, (java.lang.Object) shortArray83);
        int int87 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray83, (short) (byte) 10, 25);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray29), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[-1.0, 100.0, 100.0, 100.0, 1.0, 10.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray50), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray52), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray69), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray72), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray76), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray79), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 13 + "'", int81 == 13);
        org.junit.Assert.assertNotNull(shortArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray83), "[0, 10, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("AAAA1      AAAA", "      aaaA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0.0-------------------------------------------------");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("eslafeurteurteurteslafeslafeurteslafeslaf", "0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.ArrayUtils.subarray(strArray1, (int) 'a', (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaa");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny(" 4 aa4a", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaahihi#..", "444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", 244);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "trueaaah      aaaAhifalse");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH" + "'", str1, "IH");
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        java.lang.Short[] shortArray4 = new java.lang.Short[] { (short) 1, (short) 1, (short) 10 };
        short[] shortArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray4, (short) (byte) 100);
        short[] shortArray8 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray6, (short) (byte) 1);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray8, (short) 100);
        boolean boolean11 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) "100#############################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.Object) int10);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 10]");
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray8), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 10L);
        double[] doubleArray8 = new double[] {};
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) '4', (double) (byte) -1);
        double[] doubleArray16 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray8, doubleArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray8, (double) 100, (double) 100);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray8, 0, 0);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray8, (double) 1L);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray3, doubleArray8);
        double[] doubleArray27 = new double[] {};
        int int30 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray27, (double) '4', (double) (byte) -1);
        double[] doubleArray35 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray27, doubleArray35);
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray27, (double) 10.0f, (int) '4');
        double[] doubleArray41 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) (byte) -1);
        double[] doubleArray43 = new double[] { 1.0f };
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray43);
        double[] doubleArray45 = new double[] {};
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray43, doubleArray45);
        double[] doubleArray48 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) (short) -1);
        double[] doubleArray49 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray27, doubleArray43);
        double[] doubleArray51 = org.apache.commons.lang3.ArrayUtils.add(doubleArray43, (double) 3);
        double[] doubleArray54 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray51, 10, (int) (byte) 10);
        double[] doubleArray55 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray3, doubleArray54);
        double[] doubleArray58 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray3, 33, (int) 'a');
        int int61 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray58, 100.0d, (double) 10L);
        double[] doubleArray64 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray58, 98, 516);
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray58, (double) 94, 28, (double) 139);
        int int70 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray58, (double) 99);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 3.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray2, (byte) 10);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray2, (int) '4', 35);
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray11);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[10, 1]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("1     HIHIH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                aaa                                 ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "       aAA");
        double[] doubleArray5 = new double[] { 1.0f };
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray5);
        double[] doubleArray7 = new double[] {};
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray5, doubleArray7);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) strArray3, (java.lang.Object) doubleArray5, (int) (short) 1);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray5);
        double[] doubleArray15 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray15, (double) 100);
        int int20 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray17, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray17);
        double[] doubleArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray17, (double) 10L);
        double[] doubleArray27 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray29 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray27, (double) 100);
        int int32 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray29, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray33 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray29);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray17, doubleArray29);
        double[] doubleArray35 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray11, doubleArray17);
        java.lang.Double[] doubleArray36 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray11);
        java.lang.Class<?> wildcardClass37 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{true,false,false,f   h", "              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        char[] charArray16 = new char[] { '4', '#', ' ' };
        java.lang.Character[] charArray17 = org.apache.commons.lang3.ArrayUtils.toObject(charArray16);
        char[] charArray18 = org.apache.commons.lang3.ArrayUtils.clone(charArray16);
        int int20 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, '4');
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.isSameLength(charArray7, charArray18);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray18);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray18, '#', (int) 'a');
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "false", charArray18);
        char[] charArray33 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray35 = org.apache.commons.lang3.ArrayUtils.add(charArray33, 'a');
        char[] charArray37 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray33, '#');
        char[] charArray40 = org.apache.commons.lang3.ArrayUtils.subarray(charArray37, (int) (short) 1, (int) (short) -1);
        char[] charArray41 = org.apache.commons.lang3.ArrayUtils.addAll(charArray18, charArray37);
        boolean boolean42 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray18);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "4# ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "4# ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[4, #,  ]");
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " #4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " #4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , #, 4]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), " #4 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), " #4 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[ , #, 4,  , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                 AAAAA                                                                                               AAAAAA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                   #", 57, 244);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   #" + "'", str3, "                                                   #");
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        byte[][][] byteArray0 = new byte[][][] {};
        double[] doubleArray4 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray4, (double) 100);
        byte[][][] byteArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray0, (java.lang.Object) 100);
        byte[][][] byteArray10 = org.apache.commons.lang3.ArrayUtils.subarray(byteArray0, (int) ' ', (int) (short) 0);
        int int12 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) byteArray0, (java.lang.Object) "aaa");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        byte[][] byteArray19 = new byte[][] { byteArray18 };
        byte[][] byteArray20 = org.apache.commons.lang3.ArrayUtils.toArray(byteArray19);
        byte[][][] byteArray21 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, byteArray20);
        java.io.Serializable[][] serializableArray22 = org.apache.commons.lang3.ArrayUtils.clone((java.io.Serializable[][]) byteArray21);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       aAA", "hi");
        byte[][][] byteArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray21, (java.lang.Object) "       aAA");
        java.lang.Integer[] intArray27 = new java.lang.Integer[] {};
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, 35);
        java.lang.Integer[] intArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray27);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray27, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray33 = org.apache.commons.lang3.ArrayUtils.add((java.lang.Object[][]) byteArray26, (java.lang.Object[]) intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: [Ljava.lang.Integer;");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, -1, 0, 100]");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(serializableArray22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 1, (int) (short) 10);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (byte) 0, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray7, "aaaA");
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7, (byte) 10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        byte[] byteArray15 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray15, (byte) 1, (int) (short) 10);
        byte[] byteArray21 = org.apache.commons.lang3.ArrayUtils.add(byteArray15, (int) (byte) 0, (byte) -1);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 1 };
        int int27 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray24, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray28 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray24);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray24);
        int int31 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray24, (byte) 100);
        boolean boolean32 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray15, byteArray24);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1 };
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray35, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray39 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray35);
        byte[] byteArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray35);
        boolean boolean41 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray35);
        byte[] byteArray42 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray24, byteArray35);
        java.lang.Byte[] byteArray43 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray42);
        boolean boolean44 = org.apache.commons.lang3.ArrayUtils.isEmpty((java.lang.Object[]) byteArray43);
        byte[] byteArray46 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray43, (byte) 10);
        byte[] byteArray47 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray0, byteArray46);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray50 = org.apache.commons.lang3.ArrayUtils.add(byteArray47, 106, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 106, Length: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[-1]");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray24), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray35), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray40), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray46), "[10, 1, 10, 1]");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[10, 1, 10, 1]");
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "AAA4444444444-1A10A0A10...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace("1      AAAA1      AAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("       ", "00000AAAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        float[] floatArray3 = new float[] { 2, '4', (byte) -1 };
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '#');
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray3, 2, (int) (short) -1);
        java.lang.Float[] floatArray9 = org.apache.commons.lang3.ArrayUtils.toObject(floatArray3);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray3);
        java.lang.Class<?> wildcardClass11 = floatArray10.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[2.0, 52.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[2.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444                                AAA44444444hiaaaaaaaa", "1.0a0.0");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap3 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '44444444444444444444444444444                                AAA44444444hi', is neither of type Map.Entry nor an Array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("false4false4true4true4false4true4false", "       ", "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a1A10A0A0", "10               HIHIH               1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a1A10A0A0" + "'", str2, "a1A10A0A0");
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#                              HIHIH                                                        aaa#                              HIHIH                                                        aaa4                              HIHIH                                                        aaaa                              HIHIH                                                        aaa#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(".0 AAA 100.0 AAA 10.0 AAA 10.0 A", "true4true4true4false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0.1A0.01", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.1A0.01                                                                          " + "'", str2, "0.1A0.01                                                                          ");
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        java.lang.Boolean[] booleanArray16 = org.apache.commons.lang3.ArrayUtils.toObject(booleanArray15);
        java.lang.Boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray16);
        java.lang.Boolean[] booleanArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray17);
        java.lang.Boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray18);
        java.lang.Boolean[] booleanArray20 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertNotNull(booleanArray18);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertNotNull(booleanArray20);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("-1#-1#0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1#-1#0" + "'", str1, "-1#-1#0");
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  ...ihihaaa 11-00011010011-00011010011-00011010011-", "aaa                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ...ihihaaa 11-00011010011-00011010011-00011010011-" + "'", str2, "  ...ihihaaa 11-00011010011-00011010011-00011010011-");
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("444                                aaa444444444444444444444444444444AAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAAAAAAAAAHIHI...AAAAAAAAAAAAAAAAAAAAA", "       AAA                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..", "                                                                 aAAAa                                                                                               aaaaaAeaaahfalse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi.." + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..");
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                             aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             aaaA" + "'", str1, "                             aaaA");
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        java.lang.Short[] shortArray0 = null;
        short[] shortArray1 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray0);
        org.junit.Assert.assertNull(shortArray1);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray23 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray23, (short) (byte) 0, (-1));
        short[] shortArray27 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray23);
        short[] shortArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray23);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.contains(shortArray28, (short) -1);
        short[] shortArray37 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int40 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray37, (short) (byte) 0, (-1));
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.add(shortArray37, (short) (byte) -1);
        short[] shortArray44 = org.apache.commons.lang3.ArrayUtils.add(shortArray37, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray37);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.clone(shortArray37);
        java.lang.Short[] shortArray49 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray51 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray49, (short) 1);
        short[] shortArray58 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int61 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray58, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray58);
        short[] shortArray63 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray51, shortArray58);
        java.lang.Short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray63);
        java.lang.Short[] shortArray65 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray64);
        short[] shortArray66 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray65);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.add(shortArray66, (short) 0);
        boolean boolean69 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray66);
        short[] shortArray70 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray46, shortArray66);
        short[] shortArray73 = org.apache.commons.lang3.ArrayUtils.add(shortArray70, (int) (byte) 0, (short) (byte) 100);
        boolean boolean74 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray28, shortArray70);
        int int77 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray28, (short) 1, 4);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray23), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray27), "[-1, 10, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray44), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray51), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray58), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray63), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray66), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray73), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                ...", 25, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444                ..." + "'", str3, "444444                ...");
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI...", "AAAA1      AAAA             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI..." + "'", str2, "HI...");
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                      4!iha!iha!ih !ih4!ih                      ", "-{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}{-1,-1,0}aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", 52);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI                        ", "AAAA1      AAAA            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        float[] floatArray0 = new float[] {};
        float[] floatArray1 = new float[] {};
        float[] floatArray2 = new float[] {};
        float[] floatArray3 = new float[] {};
        float[] floatArray4 = new float[] {};
        float[][] floatArray5 = new float[][] { floatArray0, floatArray1, floatArray2, floatArray3, floatArray4 };
        float[] floatArray6 = new float[] {};
        float[] floatArray7 = new float[] {};
        float[] floatArray8 = new float[] {};
        float[] floatArray9 = new float[] {};
        float[] floatArray10 = new float[] {};
        float[][] floatArray11 = new float[][] { floatArray6, floatArray7, floatArray8, floatArray9, floatArray10 };
        float[] floatArray12 = new float[] {};
        float[] floatArray13 = new float[] {};
        float[] floatArray14 = new float[] {};
        float[] floatArray15 = new float[] {};
        float[] floatArray16 = new float[] {};
        float[][] floatArray17 = new float[][] { floatArray12, floatArray13, floatArray14, floatArray15, floatArray16 };
        float[] floatArray18 = new float[] {};
        float[] floatArray19 = new float[] {};
        float[] floatArray20 = new float[] {};
        float[] floatArray21 = new float[] {};
        float[] floatArray22 = new float[] {};
        float[][] floatArray23 = new float[][] { floatArray18, floatArray19, floatArray20, floatArray21, floatArray22 };
        float[] floatArray24 = new float[] {};
        float[] floatArray25 = new float[] {};
        float[] floatArray26 = new float[] {};
        float[] floatArray27 = new float[] {};
        float[] floatArray28 = new float[] {};
        float[][] floatArray29 = new float[][] { floatArray24, floatArray25, floatArray26, floatArray27, floatArray28 };
        float[] floatArray30 = new float[] {};
        float[] floatArray31 = new float[] {};
        float[] floatArray32 = new float[] {};
        float[] floatArray33 = new float[] {};
        float[] floatArray34 = new float[] {};
        float[][] floatArray35 = new float[][] { floatArray30, floatArray31, floatArray32, floatArray33, floatArray34 };
        float[][][] floatArray36 = new float[][][] { floatArray5, floatArray11, floatArray17, floatArray23, floatArray29, floatArray35 };
        float[] floatArray37 = new float[] {};
        float[] floatArray38 = new float[] {};
        float[] floatArray39 = new float[] {};
        float[] floatArray40 = new float[] {};
        float[] floatArray41 = new float[] {};
        float[] floatArray42 = new float[] {};
        float[][] floatArray43 = new float[][] { floatArray37, floatArray38, floatArray39, floatArray40, floatArray41, floatArray42 };
        float[][] floatArray44 = org.apache.commons.lang3.ArrayUtils.toArray(floatArray43);
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) floatArray44);
        float[][][] floatArray46 = org.apache.commons.lang3.ArrayUtils.add(floatArray36, floatArray44);
        float[] floatArray49 = new float[] { (byte) 10 };
        float[] floatArray51 = org.apache.commons.lang3.ArrayUtils.add(floatArray49, (float) (-1));
        float[] floatArray52 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray49);
        float[] floatArray55 = org.apache.commons.lang3.ArrayUtils.add(floatArray52, (int) (short) 0, (float) (short) -1);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray52);
        float[] floatArray58 = new float[] { (byte) 10 };
        float[] floatArray60 = org.apache.commons.lang3.ArrayUtils.add(floatArray58, (float) (-1));
        float[] floatArray62 = org.apache.commons.lang3.ArrayUtils.add(floatArray60, (float) '4');
        boolean boolean63 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray62);
        boolean boolean65 = org.apache.commons.lang3.ArrayUtils.contains(floatArray62, (float) 10);
        int int68 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray62, 10.0f, (int) (byte) 10);
        int int71 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray62, (float) (short) 1, 0);
        float[] floatArray72 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray52, floatArray62);
        float[] floatArray74 = new float[] { (byte) 10 };
        float[] floatArray76 = org.apache.commons.lang3.ArrayUtils.add(floatArray74, (float) (-1));
        float[] floatArray77 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray74);
        float[] floatArray80 = org.apache.commons.lang3.ArrayUtils.add(floatArray77, (int) (short) 0, (float) (short) -1);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray77);
        float[] floatArray82 = org.apache.commons.lang3.ArrayUtils.addAll(floatArray52, floatArray77);
        boolean boolean84 = org.apache.commons.lang3.ArrayUtils.contains(floatArray77, (float) 2);
        float[] floatArray86 = org.apache.commons.lang3.ArrayUtils.add(floatArray77, (float) ' ');
        // The following exception was thrown during execution in test generation
        try {
            float[][] floatArray87 = org.apache.commons.lang3.ArrayUtils.add(floatArray44, 25, floatArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 25, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[]");
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[]");
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[]");
        org.junit.Assert.assertNotNull(floatArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray9), "[]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[]");
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[]");
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[]");
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray16), "[]");
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[]");
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray19), "[]");
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray20), "[]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[]");
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray26), "[]");
        org.junit.Assert.assertNotNull(floatArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray27), "[]");
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray28), "[]");
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray30), "[]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray31), "[]");
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray32), "[]");
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[]");
        org.junit.Assert.assertNotNull(floatArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray34), "[]");
        org.junit.Assert.assertNotNull(floatArray35);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray37), "[]");
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray38), "[]");
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray39), "[]");
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray40), "[]");
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray41), "[]");
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray42), "[]");
        org.junit.Assert.assertNotNull(floatArray43);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray49), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray51), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray52), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray55), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray58), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray60), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray62), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray72), "[10.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray74), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray76), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray77), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray80), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray82), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(floatArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray86), "[10.0, 32.0]");
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0.0 1.0 100.0 hi!H0.0 1.0 100.0 ", "{-1.0,10.0}");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0.0 1.0 100.0 hi!H0.0 1.0 100.0 " + "'", str2, "0.0 1.0 100.0 hi!H0.0 1.0 100.0 ");
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray13 = new boolean[] { false, false, true, true, false, true };
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray6, booleanArray13);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray13);
        boolean[] booleanArray17 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray13, false);
        int int21 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray13, true);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray17), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, true, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        boolean boolean10 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray6);
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(byteArray11, (byte) 1);
        java.lang.Byte[] byteArray14 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray11);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray11, (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[-1, 0, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("{true,true,true,false}  ", "10HI1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{true,true,true,false}  " + "'", str2, "{true,true,true,false}  ");
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("444444444444444444444444444444444444444444{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", "aaahihi..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("  HIHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hihih" + "'", str1, "  hihih");
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, '#');
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray13, ' ', 18);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "                              HIHIH                                                        aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444true4true4true4false4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray19, (short) -1);
        short[] shortArray24 = org.apache.commons.lang3.ArrayUtils.subarray(shortArray19, 33, (-1));
        java.lang.Short[] shortArray27 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray29 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray27, (short) 1);
        short[] shortArray36 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int39 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray36, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray36);
        short[] shortArray41 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray29, shortArray36);
        short[] shortArray43 = org.apache.commons.lang3.ArrayUtils.add(shortArray41, (short) 10);
        short[] shortArray45 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) 100);
        short[] shortArray46 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray43);
        short[] shortArray48 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) 100);
        short[] shortArray49 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray24, shortArray43);
        int int51 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray43, (short) (byte) 1);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.add(shortArray43, (short) (byte) 10);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray24), "[]");
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray29), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray36), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray41), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray43), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray46), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 10]");
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("{35.0,0.0,100.0}", "HIHIH                                                        aaa##################", "AAAA10.0-------------------------------------------------.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{35.0,0.0,100.0}" + "'", str3, "{35.0,0.0,100.0}");
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}", "0.0A", 5, 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}" + "'", str4, "{97,00.0A100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}-1 0 1 100 1{97,0,1,100,0}");
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                       aaa##################", "      AAAA1      A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0", "AAAA1######AAAA#############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0" + "'", str2, "aa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("    aAAaaahihi... aAAaaah...    ", "                       false4false4true4true4false4true4false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA" + "'", str1, "AAA");
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                 AAAAA                                                                                               AAAAAA", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    ..." + "'", str2, "                    ...");
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                       flse4flse4true4true4flse4true4flse");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "flse4flse4true4true4flse4true4flse" + "'", str1, "flse4flse4true4true4flse4true4flse");
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAA", 65, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA44444444444444444444444444444444444444444444444444444444444444" + "'", str3, "AAA44444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        java.lang.Character[] charArray5 = new java.lang.Character[] { '#', '#', '4', 'a', '#' };
        char[] charArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, ' ');
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray5);
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.clone(charArray11);
        char[] charArray19 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.add(charArray19, 'a');
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray19, '#');
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isEmpty(charArray23);
        char[] charArray25 = org.apache.commons.lang3.ArrayUtils.addAll(charArray12, charArray23);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray27 = org.apache.commons.lang3.ArrayUtils.remove(charArray23, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 13, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "##4a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, #, 4, a, #]");
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "##4a# 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "##4a# 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, #, 4, a, #,  , 4,  , a, a, 4]");
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaa1      aaaa            ", "1.0a0.0                              HIHIH                                                        aaa1.0a0.0                              HIHIH                                                        aaa1.0a0.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        java.lang.Double[] doubleArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY;
        java.lang.Double[] doubleArray1 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        char[] charArray8 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.add(charArray8, 'a');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.add(charArray8, ' ');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray8);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf((java.lang.Object[]) doubleArray0, (java.lang.Object) charArray8);
        java.lang.Double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray0);
        java.lang.Double[] doubleArray17 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(doubleArray16);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17, (double) 33);
        double[] doubleArray21 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray17, (double) 14);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...", "                                                                                                 aaa");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.concat((java.lang.Object[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                aaa                                 ", strArray4, strArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny("10.01.0", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                aaa                                 " + "'", str11, "                                                                aaa                                 ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("{100,1,-1,0,1,");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{100,1,-1,0,1," + "'", str1, "{100,1,-1,0,1,");
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray8);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.remove(byteArray8, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[0, 1, 100, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("{true,true,true,false}  ", "hihiH", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{true,true,true,false}  hihiH{true,true,true,false}  " + "'", str3, "{true,true,true,false}  hihiH{true,true,true,false}  ");
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        org.apache.commons.lang3.StringUtils[][] stringUtilsArray0 = new org.apache.commons.lang3.StringUtils[][] {};
        org.apache.commons.lang3.StringUtils stringUtils2 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils3 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils4 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray5 = new org.apache.commons.lang3.StringUtils[] { stringUtils2, stringUtils3, stringUtils4 };
        org.apache.commons.lang3.StringUtils[] stringUtilsArray6 = org.apache.commons.lang3.ArrayUtils.toArray(stringUtilsArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.StringUtils[][] stringUtilsArray7 = org.apache.commons.lang3.ArrayUtils.add(stringUtilsArray0, 115, stringUtilsArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 115, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringUtilsArray0);
        org.junit.Assert.assertNotNull(stringUtilsArray5);
        org.junit.Assert.assertNotNull(stringUtilsArray6);
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.subarray(intArray0, (int) (short) 0, (int) (short) -1);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.add(intArray0, 3);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, 516);
        int int11 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray9, 35);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray9, 27);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray9);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[3]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[3]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[3]");
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        int[] intArray0 = null;
        java.lang.Long[] longArray7 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray7);
        long[] longArray9 = org.apache.commons.lang3.ArrayUtils.clone(longArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(longArray9, 0L, (int) (byte) 1);
        long[] longArray18 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray20 = org.apache.commons.lang3.ArrayUtils.add(longArray18, (long) (short) 1);
        long[] longArray24 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(longArray24, (long) ' ');
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.addAll(longArray20, longArray24);
        java.lang.Long[] longArray34 = new java.lang.Long[] { 100L, 1L, (-1L), 0L, 1L, 0L };
        long[] longArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray34);
        long[] longArray36 = org.apache.commons.lang3.ArrayUtils.addAll(longArray27, longArray35);
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(longArray27);
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray9, longArray27);
        int[] intArray44 = new int[] { (byte) 0, (byte) 10, (short) 1, (byte) 1, (byte) 0 };
        java.lang.Integer[] intArray45 = org.apache.commons.lang3.ArrayUtils.toObject(intArray44);
        int[] intArray46 = new int[] {};
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray46, (int) (short) 1);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray46, (-1));
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.contains(intArray46, 0);
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray46);
        int[] intArray54 = org.apache.commons.lang3.ArrayUtils.addAll(intArray44, intArray46);
        int[] intArray55 = org.apache.commons.lang3.ArrayUtils.clone(intArray46);
        boolean boolean56 = org.apache.commons.lang3.ArrayUtils.isEquals((java.lang.Object) longArray38, (java.lang.Object) intArray55);
        boolean boolean57 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray0, intArray55);
        int[] intArray59 = org.apache.commons.lang3.ArrayUtils.add(intArray55, 58);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray9), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray18), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray20), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray36), "[97, 0, 1, 100, 0, 1, -1, -1, 0, 100, 1, -1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[100, 1, -1, 0, 1, 0, 97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 10, 1, 1, 0]");
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[58]");
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      aaaA", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        double[] doubleArray2 = new double[] { (short) 0, 'a' };
        boolean boolean5 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray2, (double) 1, (double) 2);
        double[] doubleArray7 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray2, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = org.apache.commons.lang3.ArrayUtils.add(doubleArray2, 244, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 244, Length: 2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 97.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, 97.0]");
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0.0-------------------------------------------------");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0.0-------------------------------------------------" + "'", str1, "0.0-------------------------------------------------");
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                            aAAaaahihi... aAAaaah...", "                       false4false4true4true4false4true4false");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("10               HIHIH               1", " 1      AAAA1      AAAA1", "{10.0}");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1" + "'", str3, "10{{{{{{{{{{{{{{{HIHIH{{{{{{{{{{{{{{{1");
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444aaah1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1      AAAA1      AAAA10", "aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        java.lang.Short[] shortArray5 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray5, (short) 1);
        short[] shortArray14 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int17 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray14, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray14);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray7, shortArray14);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.clone(shortArray7);
        short[] shortArray28 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray28, (short) (byte) 0, (-1));
        short[] shortArray33 = org.apache.commons.lang3.ArrayUtils.add(shortArray28, (short) (byte) -1);
        short[] shortArray35 = org.apache.commons.lang3.ArrayUtils.add(shortArray28, (short) (byte) 1);
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray28);
        short[] shortArray37 = org.apache.commons.lang3.ArrayUtils.clone(shortArray28);
        java.lang.Short[] shortArray40 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray40, (short) 1);
        short[] shortArray49 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int52 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray49, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray49);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray42, shortArray49);
        java.lang.Short[] shortArray55 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray54);
        java.lang.Short[] shortArray56 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray55);
        short[] shortArray57 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray56);
        short[] shortArray59 = org.apache.commons.lang3.ArrayUtils.add(shortArray57, (short) 0);
        boolean boolean60 = org.apache.commons.lang3.ArrayUtils.isEmpty(shortArray57);
        short[] shortArray61 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray37, shortArray57);
        short[] shortArray64 = org.apache.commons.lang3.ArrayUtils.add(shortArray61, (int) (byte) 0, (short) (byte) 100);
        int int66 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray61, (short) 0);
        short[] shortArray68 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray61, (short) (byte) 1);
        short[] shortArray71 = org.apache.commons.lang3.ArrayUtils.add(shortArray61, (int) (short) 0, (short) 1);
        boolean boolean72 = org.apache.commons.lang3.ArrayUtils.isSameLength(shortArray21, shortArray71);
        short[] shortArray74 = org.apache.commons.lang3.ArrayUtils.removeElement(shortArray21, (short) (byte) 1);
        int int76 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) shortArray21, 106);
        boolean boolean78 = org.apache.commons.lang3.ArrayUtils.contains(shortArray21, (short) (byte) 1);
        int int81 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray21, (short) 10, 24);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray7), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray14), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray28), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray33), "[0, 0, 10, 1, 10, 0, -1]");
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray35), "[0, 0, 10, 1, 10, 0, 1]");
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray37), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray42), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray49), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray57), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray59), "[-1, 10, 0, 10, 1, 10, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray61), "[0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray64), "[100, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 13 + "'", int66 == 13);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray68), "[0, 10, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray71), "[1, 0, 10, 1, 10, 0, 0, -1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray74), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray11 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(longArray11, (long) ' ');
        long[] longArray14 = org.apache.commons.lang3.ArrayUtils.addAll(longArray7, longArray11);
        org.apache.commons.lang3.ArrayUtils.reverse(longArray14);
        long[] longArray21 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.add(longArray21, (long) (short) 1);
        long[] longArray29 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray31 = org.apache.commons.lang3.ArrayUtils.add(longArray29, (long) (short) 1);
        long[] longArray35 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean37 = org.apache.commons.lang3.ArrayUtils.contains(longArray35, (long) ' ');
        long[] longArray38 = org.apache.commons.lang3.ArrayUtils.addAll(longArray31, longArray35);
        long[] longArray39 = org.apache.commons.lang3.ArrayUtils.addAll(longArray21, longArray35);
        long[] longArray40 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray35);
        java.lang.Long[] longArray41 = org.apache.commons.lang3.ArrayUtils.toObject(longArray35);
        long[] longArray42 = org.apache.commons.lang3.ArrayUtils.toPrimitive(longArray41);
        long[] longArray43 = org.apache.commons.lang3.ArrayUtils.addAll(longArray14, longArray42);
        long[] longArray46 = org.apache.commons.lang3.ArrayUtils.subarray(longArray43, 164, (int) (short) 100);
        long[] longArray48 = org.apache.commons.lang3.ArrayUtils.add(longArray43, (long) 93);
        long[] longArray51 = org.apache.commons.lang3.ArrayUtils.subarray(longArray48, 0, 13);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray11), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray14), "[0, -1, -1, 1, 0, 100, 1, 0, 97]");
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray21), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray29), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray31), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray35), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray38), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray39), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray40), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray42), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray43), "[0, -1, -1, 1, 0, 100, 1, 0, 97, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray46), "[]");
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray48), "[0, -1, -1, 1, 0, 100, 1, 0, 97, -1, -1, 0, 93]");
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray51), "[0, -1, -1, 1, 0, 100, 1, 0, 97, -1, -1, 0, 93]");
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("-1 Hihih 1 1HihihHihih 1", "                        ", 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1 Hihih 1 1HihihHihih 1" + "'", str3, "-1 Hihih 1 1HihihHihih 1");
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                       AAa       ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                       AAa       " + "'", str3, "                                                       AAa       ");
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "00000AAAH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("flse4flse4true4true4flse4true4flse", "      AAAA1      A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "flse4flse4true4true4flse4true4flse" + "'", str2, "flse4flse4true4true4flse4true4flse");
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0" + "'", str1, "1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444hihih44444444444444444444444444444444444444444444444444444444aaa1.0a0.0");
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("-1a10a0.0-------------------------------------------------", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        boolean[] booleanArray5 = new boolean[] { false, false, true, false, false };
        java.lang.Boolean[] booleanArray10 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray10, false);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray12);
        boolean[] booleanArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray12);
        boolean[] booleanArray15 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray5);
        boolean[] booleanArray19 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, (int) (short) 1, false);
        float[] floatArray21 = new float[] { (byte) 10 };
        float[] floatArray23 = org.apache.commons.lang3.ArrayUtils.add(floatArray21, (float) (-1));
        float[] floatArray25 = org.apache.commons.lang3.ArrayUtils.add(floatArray23, (float) '4');
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.isSameType((java.lang.Object) booleanArray19, (java.lang.Object) '4');
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.removeElement(booleanArray19, false);
        java.lang.Boolean[] booleanArray33 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray35 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray33, false);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray35);
        boolean[] booleanArray37 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray35);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray37);
        boolean[] booleanArray45 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray52 = new boolean[] { false, false, true, true, false, true };
        boolean boolean53 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray45, booleanArray52);
        boolean boolean55 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray52, false);
        int int58 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray52, false, (int) (short) 0);
        boolean[] booleanArray59 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray37, booleanArray52);
        int int62 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray59, false, 13);
        boolean[] booleanArray63 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray59);
        boolean boolean64 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray59);
        boolean boolean66 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray59, false);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertNotNull(booleanArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray12), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(booleanArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray14), "[true, true, true, false]");
        org.junit.Assert.assertNotNull(booleanArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray15), "[false, false, true, false, false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[false, false, false, true, false, false]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray25), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, false, false]");
        org.junit.Assert.assertNotNull(booleanArray33);
        org.junit.Assert.assertNotNull(booleanArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray35), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(booleanArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray37), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(booleanArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray45), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray52), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(booleanArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray59), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(booleanArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray63), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.add(shortArray16, (short) 10);
        short[] shortArray20 = org.apache.commons.lang3.ArrayUtils.add(shortArray18, (short) 100);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray18);
        int int23 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray18, (short) (byte) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray18), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray20), "[-1, 10, 0, 10, 1, 10, 0, 0, 10, 100]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 0, 10, 1, 10, 0, 0, 10]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        int[] intArray4 = new int[] { (-1), '4', (byte) 10, 1 };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray4, (int) (short) 100, 100);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.subarray(intArray8, (int) (short) 0, (int) (short) -1);
        boolean boolean14 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray4, intArray8);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.add(intArray4, 0);
        int[] intArray17 = new int[] {};
        int[] intArray19 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray17, (int) (short) 1);
        int int21 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray17, 100);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray17, (int) '#', 0);
        int[] intArray29 = new int[] { (-1), '4', (byte) 10, 1 };
        int int32 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray29, (int) (short) 100, 100);
        int[] intArray33 = new int[] {};
        int[] intArray35 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray33, (int) (short) 1);
        int[] intArray38 = org.apache.commons.lang3.ArrayUtils.subarray(intArray33, (int) (short) 0, (int) (short) -1);
        boolean boolean39 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray29, intArray33);
        int[] intArray41 = org.apache.commons.lang3.ArrayUtils.add(intArray29, 0);
        int int44 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray29, (int) 'a', 0);
        int[] intArray45 = org.apache.commons.lang3.ArrayUtils.addAll(intArray17, intArray29);
        boolean boolean46 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray16, intArray17);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray17);
        boolean boolean48 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray17);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.add(charArray7, ' ');
        char[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihi...", charArray12);
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.clone(charArray12);
        char[] charArray15 = org.apache.commons.lang3.ArrayUtils.clone(charArray14);
        char[] charArray16 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray14);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = org.apache.commons.lang3.ArrayUtils.remove(charArray16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " 4 aa4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , 4,  , a, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[ , 4,  , a, a, 4]");
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "{100,1,-1,0,1,0,97,0,1,100,0}", "0.0 AAA 1.0 AAA 100.0 AAA 10.0 AAA 10.0 AAA -1.0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("trueaaahtrueaaahtrueaaahfalse", "0.0A", "aaaA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa", "{}0.0----------------------------------------------------------------aaa----------------------", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0.0       ", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                 aAAAa                                                                                               aaaaaA", "{-1,10,0,10,1,10,0,0}");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        java.lang.String[] strArray2 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("10110010");
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf((java.lang.Object[]) strArray2, (java.lang.Object) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444444444444444444444...");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                           ", "1", 23);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..", strArray4, strArray11);
        java.lang.String[] strArray14 = null;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("       aaa", strArray11, strArray14);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi.." + "'", str13, "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi.Haaahihi...aaahihi...aaahihi...aaahihi...aaahihi..");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "       aaa" + "'", str15, "       aaa");
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAA1-1.0 AAAA1 AAAA110.01 AAAA1 AAAA110.01 AAAA1 AAAA1100.01 AAAA1 AAAA11.01 AAAA1 0.01", "trueaaa                            aaaAtrueaaa                            aaaAtrueaaa                            aaaAfalse");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        long[] longArray5 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray7 = org.apache.commons.lang3.ArrayUtils.add(longArray5, (long) (short) 1);
        long[] longArray13 = new long[] { 'a', (byte) 0, (short) 1, 100L, 0L };
        long[] longArray15 = org.apache.commons.lang3.ArrayUtils.add(longArray13, (long) (short) 1);
        long[] longArray19 = new long[] { (short) -1, (-1), (short) 0 };
        boolean boolean21 = org.apache.commons.lang3.ArrayUtils.contains(longArray19, (long) ' ');
        long[] longArray22 = org.apache.commons.lang3.ArrayUtils.addAll(longArray15, longArray19);
        long[] longArray23 = org.apache.commons.lang3.ArrayUtils.addAll(longArray5, longArray19);
        long[] longArray24 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray19);
        long[] longArray26 = org.apache.commons.lang3.ArrayUtils.remove(longArray24, (int) (byte) 1);
        long[] longArray27 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(longArray26);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isEmpty(longArray27);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray7), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray13), "[97, 0, 1, 100, 0]");
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray15), "[97, 0, 1, 100, 0, 1]");
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray19), "[-1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray22), "[97, 0, 1, 100, 0, 1, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray23), "[97, 0, 1, 100, 0, -1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray24), "[-1, -1, 0]");
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray26), "[-1, 0]");
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray27), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                               AAA                                                                                               aaa", "aaaaaa...", ",aaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAAA1## AAAA1 ##1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaa4444444444-1a10a0a10a1a10a0a0", "-1a10a0.0-------------------------------------------------");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray2, (byte) -1, (int) 'a');
        java.lang.Byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toObject(byteArray2);
        byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray2);
        int int10 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray7, (byte) 100, 0);
        byte[] byteArray11 = null;
        byte[] byteArray12 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray7, byteArray11);
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray11);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[10, 1]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0.1A0.01                                                                          ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "            hI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1," + "'", str1, "{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,");
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("  aaaa10", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  aaaa10" + "'", str2, "  aaaa10");
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        double[] doubleArray15 = new double[] { (-1), 100.0f, (-1), (byte) 1, 10 };
        double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray15);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray15);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray0);
        double[] doubleArray19 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, 0.0d, 516);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray19, (double) (short) 100, (double) ' ');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("{true,false,false,false,true,false}");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{true,false,false,false,true,false}" + "'", str1, "{true,false,false,false,true,false}");
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                   #", "                              HIHIH", "1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA1      AAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   #" + "'", str3, "                                                   #");
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444tru", "AAA                                                                                               aaa   h   h   h   h   h   h   h   h   h  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                        ", "hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..hihi...hi..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("{{{              1110               ,100,                              HIHIH}},{{              1110               ,100,                              HIHIH}}}", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                0.0a", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("{#,4}", "aaa                            aaaA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,", 82);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "");
        org.apache.commons.lang3.ArrayUtils.reverse((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaa");
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = org.apache.commons.lang3.ArrayUtils.clone((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Map<java.lang.Object, java.lang.Object> objMap8 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertNotNull(objMap8);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  aaaa10", ",4,4,4}a,#,a{", "      AAAA1      A", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  aaaa10" + "'", str4, "  aaaa10");
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAA1## AAAA1 ##1", "AAAHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAA1## AAAA1 ##1" + "'", str2, "AAAA1## AAAA1 ##1");
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        double[] doubleArray0 = new double[] {};
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray0, (double) '4', (double) (byte) -1);
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0f), 10, '#' };
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray0, doubleArray8);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray0, (double) 100, (double) 100);
        double[] doubleArray15 = org.apache.commons.lang3.ArrayUtils.subarray(doubleArray0, 0, 0);
        int int18 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray15, (double) 27, (double) 'a');
        double[] doubleArray20 = org.apache.commons.lang3.ArrayUtils.add(doubleArray15, (double) 10L);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray20, (double) (short) 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, (double) 7, (int) (byte) 10, (double) 516);
        int int29 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray20, 0.0d, (double) 13);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, -1.0, 10.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                 AAA                                                                                               aaa", 93, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 " + "'", str3, "                                                                 ");
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...aaahihi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa", 0, "                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa" + "'", str3, "aaahaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaahiaaa");
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihia444#aaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihiaaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        int int5 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray1, (double) (-1L), (double) 100);
        double[] doubleArray7 = new double[] { 1.0f };
        boolean boolean8 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray7);
        double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.addAll(doubleArray1, doubleArray7);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray7, (double) 1L);
        int int14 = org.apache.commons.lang3.ArrayUtils.indexOf(doubleArray11, (double) 28, (double) 98);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = org.apache.commons.lang3.ArrayUtils.remove(doubleArray11, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                    ##1      AAAA1      AAAA1##                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##1      AAAA1      AAAA1##" + "'", str1, "##1      AAAA1      AAAA1##");
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1      AAAA1      AAAA", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        boolean[] booleanArray5 = new boolean[] { true, false, false, true, false };
        boolean[] booleanArray7 = org.apache.commons.lang3.ArrayUtils.add(booleanArray5, true);
        boolean[] booleanArray9 = new boolean[] { true };
        boolean[] booleanArray10 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray9);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true);
        boolean[] booleanArray19 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray26 = new boolean[] { false, false, true, true, false, true };
        boolean boolean27 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray19, booleanArray26);
        boolean[] booleanArray28 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray26);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray28, false, 93);
        int int33 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray28, true);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray5, booleanArray28);
        int int36 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray7), "[true, false, false, true, false, true]");
        org.junit.Assert.assertNotNull(booleanArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray9), "[true]");
        org.junit.Assert.assertNotNull(booleanArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray10), "[true, false, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(booleanArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray19), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray26), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(booleanArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray28), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, false, false, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        double[] doubleArray0 = null;
        boolean boolean1 = org.apache.commons.lang3.ArrayUtils.isEmpty(doubleArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        int[] intArray0 = new int[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray0, (int) (short) 1);
        int[] intArray4 = org.apache.commons.lang3.ArrayUtils.add(intArray2, 0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.clone(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray5);
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.subarray(intArray6, 0, 0);
        java.lang.Integer[] intArray10 = new java.lang.Integer[] {};
        int[] intArray12 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10, 35);
        int[] intArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray10);
        java.lang.Integer[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray10);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14);
        int[] intArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14);
        int[] intArray17 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray14);
        int[] intArray18 = new int[] {};
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray18, (int) (short) 1);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray18, 100);
        int int25 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray18, (int) '#', 0);
        int[] intArray30 = new int[] { (-1), '4', (byte) 10, 1 };
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray30, (int) (short) 100, 100);
        int[] intArray34 = new int[] {};
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray34, (int) (short) 1);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.subarray(intArray34, (int) (short) 0, (int) (short) -1);
        boolean boolean40 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray30, intArray34);
        int[] intArray42 = org.apache.commons.lang3.ArrayUtils.add(intArray30, 0);
        int int45 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray30, (int) 'a', 0);
        int[] intArray46 = org.apache.commons.lang3.ArrayUtils.addAll(intArray18, intArray30);
        int[] intArray47 = org.apache.commons.lang3.ArrayUtils.addAll(intArray17, intArray46);
        int[] intArray48 = org.apache.commons.lang3.ArrayUtils.clone(intArray46);
        int[] intArray50 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray46, 32);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray9, intArray46);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray46);
        int[] intArray53 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray46);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[1, 10, 52, -1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[1, 10, 52, -1]");
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        long[] longArray0 = new long[] {};
        long[][] longArray1 = new long[][] { longArray0 };
        long[] longArray2 = new long[] {};
        long[][] longArray3 = new long[][] { longArray2 };
        long[] longArray4 = new long[] {};
        long[][] longArray5 = new long[][] { longArray4 };
        long[] longArray6 = new long[] {};
        long[][] longArray7 = new long[][] { longArray6 };
        long[] longArray8 = new long[] {};
        long[][] longArray9 = new long[][] { longArray8 };
        long[] longArray10 = new long[] {};
        long[][] longArray11 = new long[][] { longArray10 };
        long[][][] longArray12 = new long[][][] { longArray1, longArray3, longArray5, longArray7, longArray9, longArray11 };
        long[][][] longArray14 = org.apache.commons.lang3.ArrayUtils.removeElement(longArray12, (java.lang.Object) "Aaa                            aaaA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.Object, java.lang.Object> objMap15 = org.apache.commons.lang3.ArrayUtils.toMap((java.lang.Object[]) longArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array element 0, '[[J@7bc40a2a', has a length less than 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[]");
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[]");
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[]");
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray8), "[]");
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray10), "[]");
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertNotNull(longArray14);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aAAaaahihi... aAAaaah...", "", "hihi...                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAaaahihi... aAAaaah..." + "'", str3, "aAAaaahihi... aAAaaah...");
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                    ...", "AAAA1######AAAA#############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    ..." + "'", str2, "                    ...");
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        float[] floatArray0 = null;
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.contains(floatArray0, (float) 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        char[] charArray7 = new char[] { ' ', '4', ' ', 'a', 'a', '4' };
        char[] charArray9 = org.apache.commons.lang3.ArrayUtils.add(charArray7, 'a');
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(charArray7, '#');
        char[] charArray14 = org.apache.commons.lang3.ArrayUtils.subarray(charArray11, (int) (short) 1, (int) (short) -1);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray11);
        int int18 = org.apache.commons.lang3.ArrayUtils.indexOf(charArray11, ' ', (int) 'a');
        org.apache.commons.lang3.ArrayUtils.reverse(charArray11);
        int int22 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray11, '4', 106);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4 aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4,  , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4 aa4a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4,  , a, a, 4, a]");
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4aa 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4aa 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, a, a,  , 4,  ]");
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("     HIHIH", 23, "falsefalsetruefalsefalsetruetruetruefalse");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     HIHIHfalsefalsetru" + "'", str3, "     HIHIHfalsefalsetru");
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444aaa1.0a0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0" + "'", str1, "1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0444444444444444444444444444444HIHIH44444444444444444444444444444444444444444444444444444444AAA1.0A0.0");
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa", "true   hitrue   hitrue   hif lse");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444                                AAA444444444444444444444444444444aaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaaaaaaaaahihi...aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("            Hi             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        double[] doubleArray1 = new double[] { 1.0f };
        boolean boolean2 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(doubleArray1);
        double[] doubleArray3 = new double[] {};
        boolean boolean4 = org.apache.commons.lang3.ArrayUtils.isSameLength(doubleArray1, doubleArray3);
        double[] doubleArray6 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 25);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray3, (double) 10, 10, (double) 0.0f);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.clone(doubleArray3);
        java.lang.Double[] doubleArray12 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        int[] intArray4 = new int[] { (byte) 100, 1, 35, (short) 10 };
        int int6 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray4, 100);
        int[] intArray7 = new int[] {};
        int[] intArray9 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (int) (short) 1);
        int[] intArray11 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray7, (-1));
        boolean boolean13 = org.apache.commons.lang3.ArrayUtils.contains(intArray7, 0);
        int[] intArray14 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        int[] intArray15 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray7);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        boolean boolean17 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray4);
        java.lang.Integer[] intArray18 = new java.lang.Integer[] {};
        int[] intArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray18, 35);
        org.apache.commons.lang3.ArrayUtils.reverse(intArray20);
        int[] intArray24 = org.apache.commons.lang3.ArrayUtils.subarray(intArray20, 28, (int) ' ');
        int[] intArray25 = org.apache.commons.lang3.ArrayUtils.EMPTY_INT_ARRAY;
        int int28 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray25, (int) (byte) 0, 100);
        boolean boolean29 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(intArray25);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray24, intArray25);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray24, (int) (byte) -1, 10);
        int[] intArray34 = org.apache.commons.lang3.ArrayUtils.addAll(intArray4, intArray24);
        int int37 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray34, 17, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[100, 1, 35, 10]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("       aaa", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              aaa        " + "'", str2, "              aaa        ");
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi", "1.0a0.0                              HIHIH                                                      ...", 28);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("10.0a1.", "aaa                  ...", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.0", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444444                                aaa444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        int int22 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray20, (byte) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                 aAAAa                                                                                               aaaaaA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA", "101101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA" + "'", str2, "aaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaAaaaA");
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("RRRRRR1.0a0.0RRRRRR", 0, "h aaahihi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "RRRRRR1.0a0.0RRRRRR" + "'", str3, "RRRRRR1.0a0.0RRRRRR");
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("eslafihaaaeurtihaaaeurtihaaaeurt", "                                 aaa                                                            aaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eslafihaaaeurtihaaaeurtihaaaeurt" + "'", str2, "eslafihaaaeurtihaaaeurtihaaaeurt");
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("trueaaahtru   eaaahfalse", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eaaahfalse trueaaahtru" + "'", str2, "eaaahfalse trueaaahtru");
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH", "0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a                                                                aaa                                 0.0a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAAH");
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa" + "'", str1, "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa");
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE" + "'", str1, "FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE");
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("-1 0 1 100 1", "-1Aaa                                                                   aAAAa                                                                                               aaaaaA            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA1", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA" + "'", str1, "-1Aaa                            aaaA0Aaa                            aaaA1Aaa                            aaaA100Aaa                            aaaA");
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        java.lang.Boolean[] booleanArray4 = new java.lang.Boolean[] { true, true, true, false };
        boolean[] booleanArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(booleanArray4, false);
        boolean boolean7 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(booleanArray6);
        boolean[] booleanArray8 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(booleanArray6);
        boolean boolean9 = org.apache.commons.lang3.ArrayUtils.isEmpty(booleanArray8);
        boolean[] booleanArray16 = new boolean[] { true, false, false, false, true, false };
        boolean[] booleanArray23 = new boolean[] { false, false, true, true, false, true };
        boolean boolean24 = org.apache.commons.lang3.ArrayUtils.isSameLength(booleanArray16, booleanArray23);
        boolean boolean26 = org.apache.commons.lang3.ArrayUtils.contains(booleanArray23, false);
        int int29 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray23, false, (int) (short) 0);
        boolean[] booleanArray30 = org.apache.commons.lang3.ArrayUtils.addAll(booleanArray8, booleanArray23);
        int int33 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray30, false, 13);
        boolean[] booleanArray34 = org.apache.commons.lang3.ArrayUtils.clone(booleanArray30);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray30, true);
        boolean[] booleanArray39 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray30, 82, 26);
        // The following exception was thrown during execution in test generation
        try {
            boolean[] booleanArray42 = org.apache.commons.lang3.ArrayUtils.add(booleanArray39, 28, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 28, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(booleanArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray8), "[true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(booleanArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray16), "[true, false, false, false, true, false]");
        org.junit.Assert.assertNotNull(booleanArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray23), "[false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(booleanArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray30), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(booleanArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray34), "[true, true, true, false, false, false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNotNull(booleanArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray39), "[]");
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray5 = org.apache.commons.lang3.ArrayUtils.add(floatArray3, (float) '4');
        boolean boolean6 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray5);
        float[] floatArray8 = org.apache.commons.lang3.ArrayUtils.add(floatArray5, (float) (-1L));
        float[] floatArray10 = new float[] { (byte) 10 };
        float[] floatArray12 = org.apache.commons.lang3.ArrayUtils.add(floatArray10, (float) (-1));
        float[] floatArray14 = org.apache.commons.lang3.ArrayUtils.add(floatArray12, (float) '4');
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray12);
        boolean boolean16 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray8, floatArray12);
        int int19 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray8, (float) 35, (-1));
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.add(floatArray8, (float) (byte) 100);
        float[] floatArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray21);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray21, (float) (byte) -1);
        java.lang.Float[] floatArray31 = new java.lang.Float[] { 0.0f, 1.0f, 100.0f, 10.0f, 10.0f, (-1.0f) };
        float[] floatArray33 = org.apache.commons.lang3.ArrayUtils.toPrimitive(floatArray31, 1.0f);
        boolean boolean34 = org.apache.commons.lang3.ArrayUtils.isEmpty(floatArray33);
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray24, floatArray33);
        float[] floatArray36 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray24);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(floatArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray8), "[10.0, -1.0, 52.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray12), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray14), "[10.0, -1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray22), "[10.0, -1.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray33), "[0.0, 1.0, 100.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray36), "[10.0, 52.0, -1.0, 100.0]");
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aAa       ", "hihi...hiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahiaaaaaaaahia", "a       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAA       aAAa", 244);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aAa       " + "'", str4, "aAa       ");
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE", "aAa       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        java.lang.Integer[] intArray0 = new java.lang.Integer[] {};
        int[] intArray2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0, 35);
        int[] intArray3 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray0);
        java.lang.Integer[] intArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray0);
        int[] intArray5 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray7 = org.apache.commons.lang3.ArrayUtils.toPrimitive(intArray4);
        int[] intArray8 = new int[] {};
        int[] intArray10 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray8, (int) (short) 1);
        int int12 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray8, 100);
        int int15 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray8, (int) '#', 0);
        int[] intArray20 = new int[] { (-1), '4', (byte) 10, 1 };
        int int23 = org.apache.commons.lang3.ArrayUtils.indexOf(intArray20, (int) (short) 100, 100);
        int[] intArray24 = new int[] {};
        int[] intArray26 = org.apache.commons.lang3.ArrayUtils.removeElement(intArray24, (int) (short) 1);
        int[] intArray29 = org.apache.commons.lang3.ArrayUtils.subarray(intArray24, (int) (short) 0, (int) (short) -1);
        boolean boolean30 = org.apache.commons.lang3.ArrayUtils.isSameLength(intArray20, intArray24);
        int[] intArray32 = org.apache.commons.lang3.ArrayUtils.add(intArray20, 0);
        int int35 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(intArray20, (int) 'a', 0);
        int[] intArray36 = org.apache.commons.lang3.ArrayUtils.addAll(intArray8, intArray20);
        int[] intArray37 = org.apache.commons.lang3.ArrayUtils.addAll(intArray7, intArray36);
        boolean boolean38 = org.apache.commons.lang3.ArrayUtils.isEmpty(intArray7);
        int[] intArray39 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray42 = org.apache.commons.lang3.ArrayUtils.add(intArray7, (-1), 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[-1, 52, 10, 1, 0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[-1, 52, 10, 1]");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[-1, 52, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        java.lang.Byte[] byteArray5 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray5);
        byte[] byteArray8 = org.apache.commons.lang3.ArrayUtils.add(byteArray6, (byte) 0);
        byte[] byteArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray6);
        java.lang.Byte[] byteArray15 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray15);
        byte[] byteArray18 = org.apache.commons.lang3.ArrayUtils.add(byteArray16, (byte) 0);
        boolean boolean19 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(byteArray18);
        byte[] byteArray20 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray9, byteArray18);
        java.lang.Byte[] byteArray26 = new java.lang.Byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        byte[] byteArray27 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray26);
        byte[] byteArray29 = org.apache.commons.lang3.ArrayUtils.add(byteArray27, (byte) 0);
        byte[] byteArray30 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(byteArray27);
        boolean boolean31 = org.apache.commons.lang3.ArrayUtils.isEmpty(byteArray27);
        byte[] byteArray32 = org.apache.commons.lang3.ArrayUtils.addAll(byteArray20, byteArray27);
        byte[] byteArray33 = org.apache.commons.lang3.ArrayUtils.clone(byteArray27);
        int int36 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(byteArray27, (byte) 0, (int) (short) 0);
        org.apache.commons.lang3.ArrayUtils.reverse(byteArray27);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray27), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[-1, 0, 1, 100, 1, 0]");
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 100, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray32), "[-1, 0, 1, 100, 1, -1, 0, 1, 100, 1, 0, -1, 0, 1, 100, 1]");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray33), "[-1, 0, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0.1----------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.01---------------------------------aaa----------------------------------------------------------------0.001---------------------------------aaa----------------------------------------------------------------0.1---------------------------------aaa----------------------------------------------------------------0.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAAH", "-10110010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        char[] charArray10 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6);
        org.apache.commons.lang3.ArrayUtils.reverse(charArray10);
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(charArray10, 'a', (int) (short) 10);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(charArray10);
        java.lang.String str17 = org.apache.commons.lang3.ArrayUtils.toString((java.lang.Object) boolean15, "Aaa4444444444444444444444444444444441.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444100.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa44444444444444444444444444444444410.04444444444444444444444444444444444444444444444444444444444444444aaa444444444444444444444444444444444-1.0");
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "444a#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "444a#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, 4, a, #, a]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "true" + "'", str17, "true");
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a#a444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#a444" + "'", str1, "a#a444");
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("FALSE4FALSE4TRUE4TRUE4FALSE4TRUE4FALSE", "10.01.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        java.lang.Character[] charArray6 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray8 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray6, '4');
        java.lang.Character[] charArray9 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray6);
        java.lang.Character[] charArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray10);
        java.lang.Character[] charArray18 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray20 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray18, '4');
        char[] charArray21 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        char[] charArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray20);
        char[] charArray23 = org.apache.commons.lang3.ArrayUtils.addAll(charArray11, charArray20);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray26 = org.apache.commons.lang3.ArrayUtils.add(charArray20, 52, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "a#a444a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[a, #, a, 4, 4, 4, a, #, a, 4, 4, 4]");
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("-11001011000", "aAAAa                                                                                               aaaaaA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-11001011000" + "'", str2, "-11001011000");
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        java.lang.CharSequence charSequence1 = null;
        java.lang.Character[] charArray9 = new java.lang.Character[] { 'a', '#', 'a', '4', '4', '4' };
        char[] charArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9, '4');
        java.lang.Character[] charArray12 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(charArray9);
        char[] charArray13 = org.apache.commons.lang3.ArrayUtils.toPrimitive(charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAA", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011000-11001011{0,0,10,1,10,0}", charArray13);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray18 = org.apache.commons.lang3.ArrayUtils.remove(charArray13, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 65, Length: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a#a444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, #, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(",", "aaahihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("10.0a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0a" + "'", str1, "10.0a");
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        double[] doubleArray3 = new double[] { '#', (byte) 0, (byte) 100 };
        double[] doubleArray5 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray3, (double) 100);
        int int8 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray5, (double) 100, (double) (-1));
        java.lang.Double[] doubleArray9 = org.apache.commons.lang3.ArrayUtils.toObject(doubleArray5);
        double[] doubleArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(doubleArray9, (double) 10.0f);
        double[] doubleArray13 = org.apache.commons.lang3.ArrayUtils.add(doubleArray11, 100.0d);
        int int16 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(doubleArray13, (double) 35, (double) 99);
        double[] doubleArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(doubleArray13, (double) (short) 10);
        boolean boolean20 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray18, (double) 0.0f);
        boolean boolean22 = org.apache.commons.lang3.ArrayUtils.contains(doubleArray18, (double) 432);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[35.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[35.0, 0.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        boolean[] booleanArray5 = new boolean[] { false, false, false, true, true };
        int int7 = org.apache.commons.lang3.ArrayUtils.indexOf(booleanArray5, true);
        int int10 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(booleanArray5, true, (int) ' ');
        boolean[] booleanArray13 = org.apache.commons.lang3.ArrayUtils.subarray(booleanArray5, 18, 13);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = org.apache.commons.lang3.ArrayUtils.getLength((java.lang.Object) 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, false, true, true]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(booleanArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray13), "[]");
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = org.apache.commons.lang3.ArrayUtils.add(intArray0, (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Length: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10.0A1.10.0A1.10.0A1.10.0A1.10HI...", "AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...AAAHIHI...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("itrueaaah");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "itrueaaah" + "'", str1, "itrueaaah");
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                   ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa{-1,-1,0}{-1,-1,0}{-1,-1100{-1,-1,0}{-1,-1,0}{-1,-1,aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaa1aaaa", 445);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        java.lang.Short[] shortArray2 = new java.lang.Short[] { (short) -1, (short) 10 };
        short[] shortArray4 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray2, (short) 1);
        short[] shortArray11 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int14 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray11, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray11);
        short[] shortArray16 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray4, shortArray11);
        java.lang.Short[] shortArray17 = org.apache.commons.lang3.ArrayUtils.toObject(shortArray16);
        java.lang.Short[] shortArray18 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray17);
        short[] shortArray19 = org.apache.commons.lang3.ArrayUtils.toPrimitive(shortArray17);
        short[] shortArray21 = org.apache.commons.lang3.ArrayUtils.remove(shortArray19, 2);
        short[] shortArray22 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(shortArray19);
        int int24 = org.apache.commons.lang3.ArrayUtils.indexOf(shortArray19, (short) (byte) 0);
        short[] shortArray31 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int34 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) (byte) 0, (-1));
        boolean boolean35 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray31);
        boolean boolean36 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray31);
        int int38 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) -1);
        short[] shortArray45 = new short[] { (byte) 0, (short) 0, (short) 10, (byte) 1, (short) 10, (byte) 0 };
        int int48 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray45, (short) (byte) 0, (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(shortArray45);
        boolean boolean51 = org.apache.commons.lang3.ArrayUtils.contains(shortArray45, (short) 0);
        boolean boolean52 = org.apache.commons.lang3.ArrayUtils.isNotEmpty(shortArray45);
        short[] shortArray53 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray31, shortArray45);
        short[] shortArray54 = org.apache.commons.lang3.ArrayUtils.addAll(shortArray19, shortArray31);
        int int56 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(shortArray31, (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10]");
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray11), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray16), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray21), "[-1, 10, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray22), "[-1, 10, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray45), "[0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray53), "[0, 0, 10, 1, 10, 0, 0, 10, 1, 10, 0, 0]");
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray54), "[-1, 10, 0, 10, 1, 10, 0, 0, 0, 0, 10, 1, 10, 0]");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        byte[] byteArray0 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_ARRAY;
        int int3 = org.apache.commons.lang3.ArrayUtils.indexOf(byteArray0, (byte) 1, (int) (short) 10);
        byte[] byteArray6 = org.apache.commons.lang3.ArrayUtils.add(byteArray0, (int) (byte) 0, (byte) -1);
        java.lang.Byte[] byteArray7 = org.apache.commons.lang3.ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) byteArray7, "aaaA");
        byte[] byteArray11 = org.apache.commons.lang3.ArrayUtils.toPrimitive(byteArray7, (byte) 10);
        boolean boolean12 = org.apache.commons.lang3.ArrayUtils.isSameLength(byteArray0, byteArray11);
        byte[] byteArray13 = org.apache.commons.lang3.ArrayUtils.clone(byteArray0);
        boolean boolean15 = org.apache.commons.lang3.ArrayUtils.contains(byteArray13, (byte) 100);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1]");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray7, (float) 1L);
        float[] floatArray10 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray7);
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray7);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray10), "[10.0, -1.0]");
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("##                                                                                                 ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##                                                                                                 " + "'", str2, "##                                                                                                 ");
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 25, "eslafeurteurteurteslafeslafeurteslafeslaf");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "eslafeurteurteurteslafesl" + "'", str3, "eslafeurteurteurteslafesl");
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "0.0 1.0 100.0 hi!H0.0 1.0 100.0 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1 0 1 100 1", "{                                                                                              }");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        float[] floatArray1 = new float[] { (byte) 10 };
        float[] floatArray3 = org.apache.commons.lang3.ArrayUtils.add(floatArray1, (float) (-1));
        float[] floatArray4 = org.apache.commons.lang3.ArrayUtils.nullToEmpty(floatArray1);
        float[] floatArray7 = org.apache.commons.lang3.ArrayUtils.add(floatArray4, (int) (short) 0, (float) (short) -1);
        int int9 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) (byte) 0);
        float[] floatArray11 = new float[] { (byte) 10 };
        float[] floatArray13 = org.apache.commons.lang3.ArrayUtils.add(floatArray11, (float) (-1));
        int int16 = org.apache.commons.lang3.ArrayUtils.indexOf(floatArray11, 0.0f, 100);
        float[] floatArray18 = org.apache.commons.lang3.ArrayUtils.removeElement(floatArray11, (float) 0L);
        float[] floatArray21 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray18, 10, (int) (byte) 10);
        float[] floatArray24 = org.apache.commons.lang3.ArrayUtils.subarray(floatArray18, (int) (byte) 1, (int) (byte) 10);
        int int26 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray24, (float) (-1));
        org.apache.commons.lang3.ArrayUtils.reverse(floatArray24);
        boolean boolean28 = org.apache.commons.lang3.ArrayUtils.isSameLength(floatArray4, floatArray24);
        int int31 = org.apache.commons.lang3.ArrayUtils.lastIndexOf(floatArray4, (float) 96, (int) '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray7), "[-1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray11), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray13), "[10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray18), "[10.0]");
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray21), "[]");
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray24), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "false{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false{{ ,#},{ ,#},{ ,#},{ ,#}}true{{ ,#},{ ,#},{ ,#},{ ,#}}false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA", "-11001011000-11001011000-11001011000-11 aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA     AAA");
    }
}

