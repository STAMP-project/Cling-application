import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = null;
        label0.info = obj15;
        java.lang.String str17 = label0.toString();
        java.lang.Object obj18 = label0.info;
        java.lang.Object obj19 = label0.info;
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("L1551169447");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong(1L);
        label0.info = 1L;
        java.lang.Object obj33 = label0.info;
        java.lang.String str34 = label0.toString();
        java.lang.String str35 = label0.toString();
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putShort(10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putInt(100);
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong((long) (byte) 100);
        label0.info = byteVector58;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L83369194" + "'", str1, "L83369194");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L83369194" + "'", str17, "L83369194");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 1L + "'", obj33, 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L83369194" + "'", str34, "L83369194");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L83369194" + "'", str35, "L83369194");
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = null;
        label0.info = obj15;
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong(10L);
        label0.info = byteVector25;
        java.lang.Object obj27 = label0.info;
        java.lang.String str28 = label0.toString();
        java.lang.Object obj29 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L246603514" + "'", str1, "L246603514");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(obj27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L246603514" + "'", str28, "L246603514");
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        label0.info = byteVector17;
        java.lang.String str19 = label0.toString();
        label0.info = '4';
        java.lang.String str22 = label0.toString();
        java.lang.Object obj23 = label0.info;
        java.lang.String str24 = label0.toString();
        java.lang.Object obj25 = label0.info;
        label0.info = "L56937410";
        org.mockito.asm.Label label28 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort((-1));
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        label28.info = byteVector35;
        java.lang.Object obj37 = label28.info;
        java.lang.Object obj38 = label28.info;
        java.lang.Object obj39 = label28.info;
        label0.info = label28;
        java.lang.Object obj41 = label28.info;
        java.lang.Object obj42 = label28.info;
        java.lang.Object obj43 = label28.info;
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort((-1));
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt(1);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putUTF8("");
        org.mockito.asm.ByteVector byteVector66 = byteVector60.putShort((int) ' ');
        label28.info = ' ';
        java.lang.String str68 = label28.toString();
        label28.info = "L2033440667";
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1150767405" + "'", str10, "L1150767405");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1150767405" + "'", str19, "L1150767405");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1150767405" + "'", str22, "L1150767405");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1150767405" + "'", str24, "L1150767405");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + '4' + "'", obj25, '4');
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "L1790597935" + "'", str68, "L1790597935");
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 100);
        label0.info = byteVector10;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = label0.info;
        label0.info = "L963025893";
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putUTF8("");
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putLong(10L);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("L1216780350");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(100);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putShort(10);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte((int) (short) 10);
        label0.info = byteVector32;
        java.lang.Object obj36 = label0.info;
        java.lang.String str37 = label0.toString();
        label0.info = "L1837044860";
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1392479656" + "'", str1, "L1392479656");
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(obj36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1392479656" + "'", str37, "L1392479656");
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.String str15 = label0.toString();
        java.lang.String str16 = label0.toString();
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        label17.info = byteVector24;
        java.lang.String str26 = label17.toString();
        label0.info = str26;
        java.lang.Object obj28 = label0.info;
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort((-1));
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong(1L);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putShort((-1));
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("L1150804603");
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte((int) '#');
        label0.info = byteVector53;
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector61 = byteVector55.putUTF8("");
        org.mockito.asm.ByteVector byteVector63 = byteVector55.putLong((long) 'a');
        label0.info = 'a';
        java.lang.Object obj65 = label0.info;
        java.lang.String str66 = label0.toString();
        org.mockito.asm.Label label67 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector68 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector72 = byteVector68.putShort((-1));
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("hi!");
        label67.info = byteVector74;
        org.mockito.asm.ByteVector byteVector76 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector80 = byteVector76.putShort((-1));
        org.mockito.asm.ByteVector byteVector82 = byteVector80.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector84 = byteVector82.putLong((long) 100);
        label67.info = byteVector82;
        org.mockito.asm.ByteVector byteVector87 = byteVector82.putShort(1);
        org.mockito.asm.ByteVector byteVector89 = byteVector82.putUTF8("");
        org.mockito.asm.ByteVector byteVector91 = byteVector82.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector93 = byteVector91.putShort((int) 'a');
        label0.info = byteVector93;
        // The following exception was thrown during execution in test generation
        try {
            int int95 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1515650461" + "'", str1, "L1515650461");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1515650461" + "'", str15, "L1515650461");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1515650461" + "'", str16, "L1515650461");
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1761335828" + "'", str26, "L1761335828");
// flaky:         org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "L1761335828" + "'", obj28, "L1761335828");
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertEquals("'" + obj65 + "' != '" + 'a' + "'", obj65, 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "L1515650461" + "'", str66, "L1515650461");
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector89);
        org.junit.Assert.assertNotNull(byteVector91);
        org.junit.Assert.assertNotNull(byteVector93);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.Object obj10 = label0.info;
        java.lang.String str11 = label0.toString();
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt(1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("L379798012");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putUTF8("L190384593");
        label0.info = byteVector34;
        java.lang.String str36 = label0.toString();
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putShort((-1));
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putLong(0L);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte((int) '#');
        label0.info = byteVector51;
        org.mockito.asm.ByteVector byteVector56 = byteVector51.putUTF8("L334258890");
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("L1757284484");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putShort(100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L245128980" + "'", str11, "L245128980");
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L245128980" + "'", str36, "L245128980");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.String str2 = label0.toString();
        java.lang.Object obj3 = label0.info;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("L90138980");
        label5.info = byteVector16;
        java.lang.Object obj18 = label5.info;
        java.lang.Object obj19 = label5.info;
        java.lang.String str20 = label5.toString();
        java.lang.String str21 = label5.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("");
        label22.info = byteVector29;
        java.lang.String str31 = label22.toString();
        label5.info = str31;
        label0.info = label5;
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putUTF8("");
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector44 = byteVector34.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putByte(1);
        org.mockito.asm.ByteVector byteVector52 = byteVector46.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putByte((int) (short) 0);
        label5.info = byteVector54;
        java.lang.Object obj60 = label5.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1633080423" + "'", str1, "L1633080423");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1633080423" + "'", str2, "L1633080423");
        org.junit.Assert.assertNull(obj3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1633080423" + "'", str4, "L1633080423");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L1205104621" + "'", str6, "L1205104621");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1205104621" + "'", str20, "L1205104621");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1205104621" + "'", str21, "L1205104621");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L900600995" + "'", str31, "L900600995");
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(obj60);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("L922707703");
        label0.info = byteVector32;
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort((-1));
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putLong((long) (byte) 0);
        label0.info = byteVector46;
        java.lang.String str48 = label0.toString();
        java.lang.String str49 = label0.toString();
        java.lang.String str50 = label0.toString();
        java.lang.String str51 = label0.toString();
        org.mockito.asm.Label label52 = new org.mockito.asm.Label();
        java.lang.String str53 = label52.toString();
        java.lang.Object obj54 = label52.info;
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putShort((-1));
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putUTF8("L90138980");
        label52.info = byteVector63;
        org.mockito.asm.ByteVector byteVector65 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector69 = byteVector65.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putByte((int) (short) 1);
        label52.info = byteVector73;
        org.mockito.asm.ByteVector byteVector76 = byteVector73.putByte((int) (byte) 10);
        label0.info = byteVector73;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L737203132" + "'", str48, "L737203132");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L737203132" + "'", str49, "L737203132");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L737203132" + "'", str50, "L737203132");
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L737203132" + "'", str51, "L737203132");
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L504551804" + "'", str53, "L504551804");
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (short) 10);
        byte[] byteArray13 = null;
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByteArray(byteArray13, 100, (int) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector16.putUTF8("L1792393993");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("L374832530");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("L1613244174");
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putByte((int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = byteVector20.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putShort(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        org.mockito.asm.ByteVector byteVector20 = byteVector15.putShort(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt(10);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((-1));
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort(0);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong(1L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putShort((-1));
        byte[] byteArray48 = null;
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putByteArray(byteArray48, (int) '4', (int) '#');
        org.mockito.asm.ByteVector byteVector53 = byteVector45.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte(0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector62 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putShort((-1));
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector72 = byteVector66.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector73 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector77 = byteVector73.putShort((-1));
        org.mockito.asm.ByteVector byteVector79 = byteVector77.putUTF8("hi!");
        byte[] byteArray84 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector87 = byteVector77.putByteArray(byteArray84, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector66.putByteArray(byteArray84, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector93 = byteVector59.putByteArray(byteArray84, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector96 = byteVector53.putByteArray(byteArray84, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector99 = byteVector30.putByteArray(byteArray84, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray84), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(byteVector96);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1522243869");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        java.lang.String str3 = label0.toString();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        label4.info = byteVector11;
        java.lang.Object obj13 = label4.info;
        java.lang.String str14 = label4.toString();
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putShort((-1));
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putShort((int) (byte) 10);
        label4.info = byteVector21;
        java.lang.String str23 = label4.toString();
        label4.info = '4';
        java.lang.String str26 = label4.toString();
        java.lang.Object obj27 = label4.info;
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putShort((-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((-1));
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("L499234616");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((-1));
        label4.info = byteVector38;
        label0.info = byteVector38;
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putShort((-1));
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector59 = byteVector49.putByteArray(byteArray56, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector61 = byteVector49.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("L713879861");
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("L596369166");
        label0.info = "L596369166";
        java.lang.Object obj67 = label0.info;
        org.mockito.asm.ByteVector byteVector68 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector72 = byteVector68.putShort((-1));
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector80 = byteVector78.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector82 = byteVector78.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector84 = byteVector82.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector86 = byteVector84.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector88 = byteVector86.putByte((int) (byte) 100);
        label0.info = byteVector86;
        java.lang.Object obj90 = label0.info;
        java.lang.String str91 = label0.toString();
        label0.info = "L150933703";
        java.lang.Object obj94 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L1748220592" + "'", str3, "L1748220592");
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L311413200" + "'", str14, "L311413200");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L311413200" + "'", str23, "L311413200");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L311413200" + "'", str26, "L311413200");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray56), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + "L596369166" + "'", obj67, "L596369166");
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(obj90);
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "L1748220592" + "'", str91, "L1748220592");
        org.junit.Assert.assertEquals("'" + obj94 + "' != '" + "L150933703" + "'", obj94, "L150933703");
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putLong(0L);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putByteArray(byteArray11, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector4.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector4.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("L420708119");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt(10);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.String str20 = label0.toString();
        label0.info = 100L;
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(1L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) (short) 100);
        label0.info = (short) 100;
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putShort((-1));
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        label39.info = byteVector46;
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putShort((-1));
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putLong((long) 100);
        label39.info = byteVector54;
        java.lang.Object obj58 = label39.info;
        java.lang.String str59 = label39.toString();
        java.lang.Class<?> wildcardClass60 = label39.getClass();
        label0.info = label39;
        org.mockito.asm.Label label62 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putShort((-1));
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putUTF8("hi!");
        label62.info = byteVector69;
        org.mockito.asm.ByteVector byteVector71 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putShort((-1));
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector79 = byteVector77.putLong((long) 100);
        label62.info = byteVector77;
        java.lang.String str81 = label62.toString();
        java.lang.Object obj82 = label62.info;
        org.mockito.asm.ByteVector byteVector84 = new org.mockito.asm.ByteVector(1);
        label62.info = byteVector84;
        java.lang.String str86 = label62.toString();
        java.lang.Object obj87 = label62.info;
        label0.info = label62;
        label62.info = "L2039554953";
        java.lang.String str91 = label62.toString();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L530838240" + "'", str20, "L530838240");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(obj58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "L637597600" + "'", str59, "L637597600");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
// flaky:         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "L910836825" + "'", str81, "L910836825");
        org.junit.Assert.assertNotNull(obj82);
// flaky:         org.junit.Assert.assertEquals("'" + str86 + "' != '" + "L910836825" + "'", str86, "L910836825");
        org.junit.Assert.assertNotNull(obj87);
// flaky:         org.junit.Assert.assertEquals("'" + str91 + "' != '" + "L910836825" + "'", str91, "L910836825");
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector8.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        java.lang.String str12 = label0.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        label13.info = byteVector20;
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putShort((-1));
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong((long) 100);
        label13.info = byteVector28;
        java.lang.Object obj32 = label13.info;
        java.lang.Object obj33 = label13.info;
        java.lang.Object obj34 = label13.info;
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("L922707703");
        label13.info = byteVector45;
        label0.info = label13;
        java.lang.Object obj48 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int49 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1843343283" + "'", str10, "L1843343283");
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1843343283" + "'", str12, "L1843343283");
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(obj48);
// flaky:         org.junit.Assert.assertEquals(obj48.toString(), "L489693346");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "L489693346");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "L489693346");
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("L911011818");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt(1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(100);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt((int) (short) 0);
        java.lang.Class<?> wildcardClass31 = byteVector28.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("L56937410");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong(100L);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong(10L);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("L462167409");
        org.mockito.asm.ByteVector byteVector18 = byteVector8.putUTF8("L830598971");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt(0);
        label0.info = byteVector7;
        java.lang.String str9 = label0.toString();
        label0.info = 100.0d;
        java.lang.String str12 = label0.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        label13.info = byteVector20;
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putShort((-1));
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong((long) 100);
        label13.info = byteVector28;
        java.lang.Object obj32 = label13.info;
        java.lang.Object obj33 = label13.info;
        java.lang.Object obj34 = label13.info;
        java.lang.String str35 = label13.toString();
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putInt(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector36.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass47 = byteVector46.getClass();
        label13.info = byteVector46;
        java.lang.String str49 = label13.toString();
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putByte(0);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong(1L);
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putUTF8("L187574180");
        org.mockito.asm.ByteVector byteVector62 = byteVector56.putInt((int) (byte) 1);
        label13.info = byteVector56;
        label0.info = label13;
        // The following exception was thrown during execution in test generation
        try {
            int int65 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L1465964202" + "'", str9, "L1465964202");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1465964202" + "'", str12, "L1465964202");
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(obj34);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L1687418042" + "'", str35, "L1687418042");
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(wildcardClass47);
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L1687418042" + "'", str49, "L1687418042");
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putUTF8("L672499662");
        org.mockito.asm.ByteVector byteVector18 = byteVector8.putUTF8("L1742246527");
        org.mockito.asm.ByteVector byteVector20 = byteVector8.putByte(10);
        org.mockito.asm.ByteVector byteVector22 = byteVector8.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector8.putInt((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(1L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (short) 100);
        label0.info = byteVector25;
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) '4');
        label0.info = byteVector31;
        java.lang.String str33 = label0.toString();
        java.lang.Object obj34 = label0.info;
        java.lang.Object obj35 = label0.info;
        java.lang.Object obj36 = label0.info;
        java.lang.Object obj37 = label0.info;
        java.lang.Object obj38 = label0.info;
        java.lang.Object obj39 = null;
        label0.info = obj39;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1878253251" + "'", str10, "L1878253251");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L1878253251" + "'", str33, "L1878253251");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(1L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (short) 100);
        label0.info = byteVector25;
        org.mockito.asm.ByteVector byteVector28 = byteVector25.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector32 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("L1627115408");
        java.lang.Class<?> wildcardClass39 = byteVector38.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1903624360" + "'", str10, "L1903624360");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.String str14 = label0.toString();
        java.lang.String str15 = label0.toString();
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((-1));
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt(1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("L1443005229");
        label0.info = byteVector30;
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putUTF8("L1154477694");
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putShort(100);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putShort((int) (byte) 1);
        label0.info = (byte) 1;
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putShort((-1));
        org.mockito.asm.ByteVector byteVector51 = byteVector45.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putUTF8("L974375816");
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putShort(0);
        label0.info = byteVector59;
        java.lang.String str65 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L746488327" + "'", str1, "L746488327");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L746488327" + "'", str14, "L746488327");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L746488327" + "'", str15, "L746488327");
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "L746488327" + "'", str65, "L746488327");
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        java.lang.String str12 = label0.toString();
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L764707234" + "'", str10, "L764707234");
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L764707234" + "'", str12, "L764707234");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        java.lang.Object obj4 = label0.info;
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.String str7 = label0.toString();
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) (byte) 1);
        label8.info = (byte) 1;
        label0.info = label8;
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector32 = byteVector22.putByteArray(byteArray29, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector34 = byteVector22.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector22.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) '#');
        label8.info = byteVector38;
        java.lang.String str40 = label8.toString();
        java.lang.String str41 = label8.toString();
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putShort((-1));
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector63 = byteVector53.putByteArray(byteArray60, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector66 = byteVector48.putByteArray(byteArray60, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector68 = byteVector48.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector72 = byteVector68.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector74 = byteVector68.putByte((int) (short) -1);
        label8.info = byteVector74;
        java.lang.Object obj76 = label8.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L760118871" + "'", str1, "L760118871");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 0 + "'", obj4, (short) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L760118871" + "'", str5, "L760118871");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "L760118871" + "'", str7, "L760118871");
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L85143881" + "'", str40, "L85143881");
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "L85143881" + "'", str41, "L85143881");
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        label0.info = "hi!";
        java.lang.String str15 = label0.toString();
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByte(100);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector27.putByteArray(byteArray34, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector40 = byteVector22.putByteArray(byteArray34, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector22.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putShort((int) (byte) 100);
        label0.info = byteVector42;
        org.mockito.asm.ByteVector byteVector47 = byteVector42.putUTF8("L352039819");
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putByte(1);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putShort(10);
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putLong((long) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1172948310" + "'", str10, "L1172948310");
        org.junit.Assert.assertNotNull(byteVector13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1172948310" + "'", str15, "L1172948310");
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        label0.info = "hi!";
        java.lang.Object obj15 = label0.info;
        java.lang.Object obj16 = label0.info;
        label0.info = "";
        org.mockito.asm.Label label19 = new org.mockito.asm.Label();
        java.lang.String str20 = label19.toString();
        java.lang.Object obj21 = label19.info;
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putShort((-1));
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putUTF8("L90138980");
        label19.info = byteVector30;
        java.lang.Object obj32 = label19.info;
        java.lang.Object obj33 = label19.info;
        java.lang.Object obj34 = null;
        label19.info = obj34;
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putShort((-1));
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putLong(10L);
        label19.info = byteVector44;
        org.mockito.asm.ByteVector byteVector47 = byteVector44.putLong(100L);
        label0.info = byteVector47;
        java.lang.Object obj49 = label0.info;
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector((int) '4');
        label0.info = byteVector51;
        java.lang.Object obj53 = label0.info;
        label0.info = "L1494449468";
        java.lang.String str56 = label0.toString();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2073796418" + "'", str10, "L2073796418");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1489571861" + "'", str20, "L1489571861");
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj53);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L2073796418" + "'", str56, "L2073796418");
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(1L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("L1348991463");
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = null;
        label0.info = obj14;
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((-1));
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong(0L);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putUTF8("L644109221");
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putUTF8("L1337376893");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putShort(10);
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("L339741256");
        label0.info = "L339741256";
        java.lang.String str42 = label0.toString();
        java.lang.String str43 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1028127810" + "'", str1, "L1028127810");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L1028127810" + "'", str42, "L1028127810");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L1028127810" + "'", str43, "L1028127810");
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.String str20 = label0.toString();
        label0.info = 100L;
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        label0.info = byteVector31;
        org.mockito.asm.ByteVector byteVector34 = byteVector31.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("L1404822831");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort(10);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong(10L);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong((long) ' ');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L228393623" + "'", str20, "L228393623");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L763528048");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("L56937410");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("L307328077");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt(0);
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector10 = byteVector7.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector25 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putShort((-1));
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putShort((-1));
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector50 = byteVector40.putByteArray(byteArray47, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector53 = byteVector29.putByteArray(byteArray47, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector22.putByteArray(byteArray47, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector59 = byteVector18.putByteArray(byteArray47, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putShort((-1));
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putInt(100);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("L1491016481");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((-1));
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector21 = byteVector11.putByteArray(byteArray18, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector6.putByteArray(byteArray18, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector6.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("L20760599");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putInt(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector43 = byteVector35.putInt(100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putByte(100);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putShort((-1));
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector69 = byteVector59.putByteArray(byteArray66, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector72 = byteVector52.putByteArray(byteArray66, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector75 = byteVector47.putByteArray(byteArray66, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector78 = byteVector34.putByteArray(byteArray66, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray66), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.String str13 = label0.toString();
        label0.info = "L368366164";
        java.lang.Object obj16 = label0.info;
        java.lang.Object obj17 = label0.info;
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong(0L);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("L479210684");
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putUTF8("L603888960");
        org.mockito.asm.ByteVector byteVector30 = byteVector22.putUTF8("L431642042");
        label0.info = byteVector22;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L363499257" + "'", str1, "L363499257");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L363499257" + "'", str13, "L363499257");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "L368366164" + "'", obj16, "L368366164");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "L368366164" + "'", obj17, "L368366164");
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        label0.info = "hi!";
        java.lang.Object obj15 = label0.info;
        java.lang.Object obj16 = label0.info;
        label0.info = "";
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        java.lang.String str23 = label0.toString();
        java.lang.Object obj24 = label0.info;
        java.lang.String str25 = label0.toString();
        java.lang.String str26 = label0.toString();
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putUTF8("");
        org.mockito.asm.ByteVector byteVector35 = byteVector27.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte(100);
        java.lang.Class<?> wildcardClass38 = byteVector35.getClass();
        label0.info = wildcardClass38;
        java.lang.String str40 = label0.toString();
        label0.info = "L1789146978";
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("L922707703");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(1);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putShort(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putShort(0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putShort((-1));
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putShort(10);
        org.mockito.asm.ByteVector byteVector65 = byteVector59.putLong(0L);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putUTF8("L851268722");
        label0.info = "L851268722";
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L106404221" + "'", str10, "L106404221");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L106404221" + "'", str22, "L106404221");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L106404221" + "'", str23, "L106404221");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "" + "'", obj24, "");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L106404221" + "'", str25, "L106404221");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L106404221" + "'", str26, "L106404221");
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(wildcardClass38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L106404221" + "'", str40, "L106404221");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("L379798012");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("L190384593");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("L384913749");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("L1021787808");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putUTF8("L2131056467");
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) (short) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        java.lang.String str3 = label0.toString();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        label4.info = byteVector11;
        java.lang.Object obj13 = label4.info;
        java.lang.String str14 = label4.toString();
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putShort((-1));
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putShort((int) (byte) 10);
        label4.info = byteVector21;
        java.lang.String str23 = label4.toString();
        label4.info = '4';
        java.lang.String str26 = label4.toString();
        java.lang.Object obj27 = label4.info;
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putShort((-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((-1));
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("L499234616");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((-1));
        label4.info = byteVector38;
        label0.info = byteVector38;
        java.lang.Object obj45 = label0.info;
        java.lang.Object obj46 = label0.info;
        java.lang.String str47 = label0.toString();
        java.lang.String str48 = label0.toString();
        org.mockito.asm.Label label49 = new org.mockito.asm.Label();
        java.lang.String str50 = label49.toString();
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putInt(0);
        org.mockito.asm.ByteVector byteVector57 = byteVector51.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        label49.info = byteVector59;
        java.lang.Object obj61 = label49.info;
        org.mockito.asm.ByteVector byteVector62 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector66 = byteVector62.putShort((-1));
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putLong(0L);
        label49.info = byteVector76;
        org.mockito.asm.Label label78 = new org.mockito.asm.Label();
        label78.info = ' ';
        org.mockito.asm.ByteVector byteVector81 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector83 = byteVector81.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector85 = byteVector81.putInt(0);
        label78.info = byteVector85;
        org.mockito.asm.ByteVector byteVector88 = byteVector85.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector90 = byteVector88.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector92 = byteVector88.putShort(1);
        label49.info = byteVector92;
        org.mockito.asm.ByteVector byteVector95 = byteVector92.putShort((-1));
        label0.info = byteVector95;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L473284720" + "'", str3, "L473284720");
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L121609585" + "'", str14, "L121609585");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L121609585" + "'", str23, "L121609585");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L121609585" + "'", str26, "L121609585");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L473284720" + "'", str47, "L473284720");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L473284720" + "'", str48, "L473284720");
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L766166410" + "'", str50, "L766166410");
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector92);
        org.junit.Assert.assertNotNull(byteVector95);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) (short) 10);
        byte[] byteArray11 = null;
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putByteArray(byteArray11, (int) (byte) 1, 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("L1122100293");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putUTF8("L1884866992");
        java.lang.Class<?> wildcardClass27 = byteVector26.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.Object obj10 = label0.info;
        java.lang.Object obj11 = label0.info;
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) 100);
        label0.info = byteVector22;
        label0.info = "L42697657";
        java.lang.String str28 = label0.toString();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.String str30 = label29.toString();
        label29.info = (short) 0;
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((-1));
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong((long) 100);
        label29.info = byteVector39;
        java.lang.Object obj43 = label29.info;
        label0.info = obj43;
        java.lang.String str45 = label0.toString();
        java.lang.Object obj46 = label0.info;
        org.mockito.asm.Label label47 = new org.mockito.asm.Label();
        java.lang.String str48 = label47.toString();
        java.lang.String str49 = label47.toString();
        java.lang.Object obj50 = label47.info;
        java.lang.String str51 = label47.toString();
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putShort((-1));
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong((long) (byte) -1);
        label47.info = byteVector60;
        label0.info = byteVector60;
        java.lang.String str65 = label0.toString();
        java.lang.String str66 = label0.toString();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1139121662" + "'", str28, "L1139121662");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L560247795" + "'", str30, "L560247795");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(obj43);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "L1139121662" + "'", str45, "L1139121662");
        org.junit.Assert.assertNotNull(obj46);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L2065197465" + "'", str48, "L2065197465");
// flaky:         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "L2065197465" + "'", str49, "L2065197465");
        org.junit.Assert.assertNull(obj50);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L2065197465" + "'", str51, "L2065197465");
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "L1139121662" + "'", str65, "L1139121662");
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "L1139121662" + "'", str66, "L1139121662");
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector12.putShort(1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((-1));
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt(10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("L917752574");
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putUTF8("L219136701");
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector28 = byteVector18.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector18.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector32 = byteVector18.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((-1));
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("L535796510");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((-1));
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector21 = byteVector11.putByteArray(byteArray18, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector6.putByteArray(byteArray18, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector6.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((-1));
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putLong(10L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("L1311753909");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putByte(1);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt(100);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("L1315225980");
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("L1760527479");
        org.mockito.asm.ByteVector byteVector54 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector60 = byteVector54.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putShort((-1));
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putUTF8("hi!");
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector77 = byteVector67.putByteArray(byteArray74, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector80 = byteVector60.putByteArray(byteArray74, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector83 = byteVector51.putByteArray(byteArray74, 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector86 = byteVector26.putByteArray(byteArray74, 0, 1);
        org.mockito.asm.ByteVector byteVector88 = byteVector86.putLong(100L);
        org.mockito.asm.ByteVector byteVector90 = byteVector88.putLong((long) (-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray74), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector90);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong(1L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("L1851898008");
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt(0);
        java.lang.Class<?> wildcardClass27 = byteVector24.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt(0);
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector10 = byteVector7.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putUTF8("L695564791");
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putShort((int) '4');
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L740354407");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        label0.info = byteVector10;
        java.lang.Object obj12 = label0.info;
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((-1));
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong(0L);
        label0.info = byteVector27;
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        label29.info = ' ';
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        label29.info = byteVector36;
        org.mockito.asm.ByteVector byteVector39 = byteVector36.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putShort(1);
        label0.info = byteVector43;
        java.lang.String str45 = label0.toString();
        java.lang.Object obj46 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int47 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1333304608" + "'", str1, "L1333304608");
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "L1333304608" + "'", str45, "L1333304608");
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putInt(1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass34 = byteVector33.getClass();
        label0.info = byteVector33;
        java.lang.String str36 = label0.toString();
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong(1L);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putUTF8("L187574180");
        org.mockito.asm.ByteVector byteVector49 = byteVector43.putInt((int) (byte) 1);
        label0.info = byteVector43;
        java.lang.String str51 = label0.toString();
        java.lang.Object obj52 = label0.info;
        java.lang.Object obj53 = label0.info;
        java.lang.Object obj54 = label0.info;
        java.lang.String str55 = label0.toString();
        java.lang.String str56 = label0.toString();
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putShort((-1));
        org.mockito.asm.ByteVector byteVector63 = byteVector57.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putInt(100);
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putUTF8("L374832530");
        org.mockito.asm.ByteVector byteVector71 = byteVector67.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putLong((long) ' ');
        label0.info = byteVector75;
        java.lang.Object obj77 = label0.info;
        java.lang.String str78 = label0.toString();
        label0.info = "L1243058925";
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L100927776" + "'", str22, "L100927776");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(wildcardClass34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L100927776" + "'", str36, "L100927776");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L100927776" + "'", str51, "L100927776");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L100927776" + "'", str55, "L100927776");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L100927776" + "'", str56, "L100927776");
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(obj77);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "L100927776" + "'", str78, "L100927776");
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong(10L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1216780350");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        label0.info = "hi!";
        java.lang.Object obj15 = label0.info;
        java.lang.Object obj16 = label0.info;
        label0.info = "";
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        java.lang.String str23 = label0.toString();
        java.lang.String str24 = label0.toString();
        org.mockito.asm.Label label25 = new org.mockito.asm.Label();
        label0.info = label25;
        java.lang.Object obj27 = label25.info;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = label25.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2051377467" + "'", str10, "L2051377467");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L2051377467" + "'", str22, "L2051377467");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L2051377467" + "'", str23, "L2051377467");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L2051377467" + "'", str24, "L2051377467");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("L546388731");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L465592951");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) ' ');
        java.lang.Class<?> wildcardClass15 = byteVector12.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.String str11 = label0.toString();
        label0.info = "L433962344";
        // The following exception was thrown during execution in test generation
        try {
            int int14 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1982361611" + "'", str10, "L1982361611");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1982361611" + "'", str11, "L1982361611");
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("L917836053");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte(100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putShort(1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt(100);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putInt((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort(100);
        java.lang.Class<?> wildcardClass9 = byteVector6.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = label0.info;
        java.lang.Object obj16 = label0.info;
        java.lang.Object obj17 = label0.info;
        label0.info = "L600544710";
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L846950565" + "'", str1, "L846950565");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putUTF8("L1103339481");
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L634764826");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putLong((long) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.String str20 = label0.toString();
        label0.info = 100L;
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte(100);
        label0.info = byteVector27;
        java.lang.Object obj31 = label0.info;
        org.mockito.asm.Label label32 = new org.mockito.asm.Label();
        java.lang.String str33 = label32.toString();
        java.lang.String str34 = label32.toString();
        java.lang.Object obj35 = label32.info;
        java.lang.Object obj36 = label32.info;
        java.lang.String str37 = label32.toString();
        java.lang.Object obj38 = label32.info;
        java.lang.Object obj39 = label32.info;
        label0.info = label32;
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putShort((-1));
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong(0L);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putUTF8("L1311753909");
        org.mockito.asm.ByteVector byteVector61 = byteVector55.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector63 = byteVector55.putShort((int) (short) 1);
        label32.info = byteVector63;
        label32.info = "L1870073094";
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1498682179" + "'", str20, "L1498682179");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L507958801" + "'", str33, "L507958801");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L507958801" + "'", str34, "L507958801");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L507958801" + "'", str37, "L507958801");
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) ' ');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("L185112078");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = label0.info;
        java.lang.Object obj16 = label0.info;
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong(1L);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putUTF8("L187574180");
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putByte((int) (short) 1);
        label0.info = byteVector23;
        java.lang.Object obj31 = null;
        label0.info = obj31;
        java.lang.String str33 = label0.toString();
        java.lang.String str34 = label0.toString();
        label0.info = "L1189865787";
        // The following exception was thrown during execution in test generation
        try {
            int int37 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L558600975" + "'", str1, "L558600975");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L558600975" + "'", str33, "L558600975");
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L558600975" + "'", str34, "L558600975");
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 1);
        label0.info = (byte) 1;
        java.lang.String str9 = label0.toString();
        java.lang.String str10 = label0.toString();
        label0.info = "L2053525597";
        java.lang.Object obj13 = label0.info;
        java.lang.String str14 = label0.toString();
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        label15.info = ' ';
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(0);
        label15.info = byteVector22;
        java.lang.String str24 = label15.toString();
        java.lang.Object obj25 = label15.info;
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putByte(100);
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((-1));
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector47 = byteVector37.putByteArray(byteArray44, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector50 = byteVector32.putByteArray(byteArray44, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector52 = byteVector32.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putLong((-1L));
        label15.info = byteVector56;
        org.mockito.asm.ByteVector byteVector59 = byteVector56.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putByte(1);
        java.lang.Class<?> wildcardClass62 = byteVector61.getClass();
        label0.info = wildcardClass62;
        java.lang.Object obj64 = label0.info;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L974733032" + "'", str9, "L974733032");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L974733032" + "'", str10, "L974733032");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "L2053525597" + "'", obj13, "L2053525597");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L974733032" + "'", str14, "L974733032");
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1413085314" + "'", str24, "L1413085314");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray44), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertEquals(obj64.toString(), "class org.mockito.asm.ByteVector");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj64), "class org.mockito.asm.ByteVector");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj64), "class org.mockito.asm.ByteVector");
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = label0.info;
        java.lang.String str16 = label0.toString();
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort(100);
        label0.info = byteVector33;
        java.lang.String str35 = label0.toString();
        java.lang.Object obj36 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L927814586" + "'", str1, "L927814586");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L927814586" + "'", str16, "L927814586");
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "L927814586" + "'", str35, "L927814586");
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.String str2 = label0.toString();
        java.lang.Object obj3 = label0.info;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.Label label5 = new org.mockito.asm.Label();
        java.lang.String str6 = label5.toString();
        java.lang.Object obj7 = label5.info;
        org.mockito.asm.ByteVector byteVector8 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("L90138980");
        label5.info = byteVector16;
        java.lang.Object obj18 = label5.info;
        java.lang.Object obj19 = label5.info;
        java.lang.String str20 = label5.toString();
        java.lang.String str21 = label5.toString();
        org.mockito.asm.Label label22 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("");
        label22.info = byteVector29;
        java.lang.String str31 = label22.toString();
        label5.info = str31;
        label0.info = label5;
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putByte(100);
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putShort((-1));
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector55 = byteVector45.putByteArray(byteArray52, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector58 = byteVector40.putByteArray(byteArray52, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector40.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putShort((int) (byte) 100);
        label5.info = byteVector60;
        org.mockito.asm.ByteVector byteVector65 = byteVector60.putLong(10L);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector69 = byteVector65.putLong(1L);
        org.mockito.asm.ByteVector byteVector71 = byteVector65.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putShort((int) (short) -1);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1538502918" + "'", str1, "L1538502918");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1538502918" + "'", str2, "L1538502918");
        org.junit.Assert.assertNull(obj3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1538502918" + "'", str4, "L1538502918");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L303091762" + "'", str6, "L303091762");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L303091762" + "'", str20, "L303091762");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L303091762" + "'", str21, "L303091762");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1189392899" + "'", str31, "L1189392899");
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray52), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) 'a');
        label0.info = byteVector8;
        java.lang.Object obj16 = label0.info;
        java.lang.String str17 = label0.toString();
        org.mockito.asm.Label label18 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((-1));
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        label18.info = byteVector25;
        java.lang.Object obj27 = label18.info;
        java.lang.String str28 = label18.toString();
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort((-1));
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putShort((int) (byte) 10);
        label18.info = byteVector35;
        java.lang.String str37 = label18.toString();
        label18.info = '4';
        java.lang.String str40 = label18.toString();
        java.lang.Object obj41 = label18.info;
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putShort((-1));
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt((-1));
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("L499234616");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putByte((-1));
        label18.info = byteVector52;
        org.mockito.asm.ByteVector byteVector59 = byteVector52.putInt((int) (byte) -1);
        label0.info = byteVector59;
        java.lang.String str61 = label0.toString();
        java.lang.Object obj62 = label0.info;
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putShort((-1));
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector71 = byteVector67.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector73 = byteVector67.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector75 = byteVector67.putShort(10);
        org.mockito.asm.ByteVector byteVector77 = byteVector67.putUTF8("L632514058");
        java.lang.Class<?> wildcardClass78 = byteVector77.getClass();
        label0.info = byteVector77;
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + ' ' + "'", obj3, ' ');
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1436975107" + "'", str17, "L1436975107");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(obj27);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1904625566" + "'", str28, "L1904625566");
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1904625566" + "'", str37, "L1904625566");
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L1904625566" + "'", str40, "L1904625566");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + '4' + "'", obj41, '4');
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "L1436975107" + "'", str61, "L1436975107");
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) (byte) 1);
        label0.info = (byte) 1;
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        label9.info = byteVector16;
        java.lang.Object obj18 = label9.info;
        java.lang.String str19 = label9.toString();
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putShort((int) (byte) 10);
        label9.info = byteVector26;
        java.lang.String str28 = label9.toString();
        java.lang.String str29 = label9.toString();
        label0.info = label9;
        java.lang.String str31 = label0.toString();
        java.lang.String str32 = label0.toString();
        java.lang.Object obj33 = label0.info;
        java.lang.Object obj34 = label0.info;
        java.lang.Object obj35 = label0.info;
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putShort((-1));
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong(0L);
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putUTF8("L644109221");
        org.mockito.asm.ByteVector byteVector54 = byteVector48.putUTF8("L1337376893");
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putShort(0);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putUTF8("L46931455");
        org.mockito.asm.ByteVector byteVector62 = byteVector56.putUTF8("L1412540007");
        org.mockito.asm.ByteVector byteVector64 = byteVector56.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putUTF8("L1612577973");
        org.mockito.asm.ByteVector byteVector70 = byteVector64.putInt(0);
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt(1);
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("L1663660720");
        label0.info = byteVector72;
        java.lang.String str76 = label0.toString();
        java.lang.Object obj77 = label0.info;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(obj18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1595199996" + "'", str19, "L1595199996");
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1595199996" + "'", str28, "L1595199996");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1595199996" + "'", str29, "L1595199996");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "L1262807215" + "'", str31, "L1262807215");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1262807215" + "'", str32, "L1262807215");
        org.junit.Assert.assertNotNull(obj33);
// flaky:         org.junit.Assert.assertEquals(obj33.toString(), "L1595199996");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "L1595199996");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "L1595199996");
        org.junit.Assert.assertNotNull(obj34);
// flaky:         org.junit.Assert.assertEquals(obj34.toString(), "L1595199996");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "L1595199996");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "L1595199996");
        org.junit.Assert.assertNotNull(obj35);
// flaky:         org.junit.Assert.assertEquals(obj35.toString(), "L1595199996");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "L1595199996");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "L1595199996");
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
// flaky:         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "L1262807215" + "'", str76, "L1262807215");
        org.junit.Assert.assertNotNull(obj77);
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putUTF8("L493815740");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(10);
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort((-1));
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt(1);
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector49.putByte(100);
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putShort((-1));
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector70 = byteVector60.putByteArray(byteArray67, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector73 = byteVector55.putByteArray(byteArray67, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector76 = byteVector48.putByteArray(byteArray67, (int) (byte) 1, 1);
        org.mockito.asm.ByteVector byteVector79 = byteVector29.putByteArray(byteArray67, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector18.putByteArray(byteArray67, (int) (byte) 0, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector84 = byteVector82.putUTF8("L138496101");
        org.mockito.asm.ByteVector byteVector86 = byteVector84.putByte((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray67), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector86);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.String str15 = label0.toString();
        java.lang.String str16 = label0.toString();
        label0.info = "L1404822831";
        java.lang.String str19 = label0.toString();
        java.lang.Object obj20 = label0.info;
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("L922707703");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) (byte) 1);
        label0.info = byteVector33;
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putShort((-1));
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        label0.info = byteVector39;
        label0.info = "L1629281037";
        java.lang.Object obj45 = label0.info;
        label0.info = "L1479099639";
        java.lang.Object obj48 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L192035101" + "'", str1, "L192035101");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L192035101" + "'", str15, "L192035101");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L192035101" + "'", str16, "L192035101");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L192035101" + "'", str19, "L192035101");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "L1404822831" + "'", obj20, "L1404822831");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "L1629281037" + "'", obj45, "L1629281037");
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "L1479099639" + "'", obj48, "L1479099639");
    }

    @Test
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong(0L);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(1L);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) '4');
        label0.info = byteVector13;
        org.mockito.asm.Label label15 = new org.mockito.asm.Label();
        java.lang.String str16 = label15.toString();
        label15.info = (short) 0;
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((-1));
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putLong((long) 100);
        label15.info = byteVector25;
        java.lang.Object obj29 = label15.info;
        java.lang.Object obj30 = label15.info;
        label0.info = label15;
        java.lang.String str32 = label15.toString();
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putUTF8("");
        org.mockito.asm.ByteVector byteVector41 = byteVector33.putLong(10L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("L1216780350");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt(100);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putShort(10);
        label15.info = byteVector47;
        org.mockito.asm.ByteVector byteVector50 = byteVector47.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putByte(1);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L279284502" + "'", str1, "L279284502");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L279284502" + "'", str4, "L279284502");
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1544981036" + "'", str16, "L1544981036");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(obj30);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L1544981036" + "'", str32, "L1544981036");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort(0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte((int) (short) -1);
        byte[] byteArray17 = null;
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putByteArray(byteArray17, 10, 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.String str2 = label0.toString();
        java.lang.Object obj3 = label0.info;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (byte) -1);
        label0.info = byteVector13;
        java.lang.String str17 = label0.toString();
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(1);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector36 = byteVector30.putUTF8("L321534629");
        label0.info = byteVector36;
        java.lang.Object obj38 = label0.info;
        java.lang.Object obj39 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1137975806" + "'", str1, "L1137975806");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1137975806" + "'", str2, "L1137975806");
        org.junit.Assert.assertNull(obj3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1137975806" + "'", str4, "L1137975806");
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1137975806" + "'", str17, "L1137975806");
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 100);
        label0.info = byteVector10;
        java.lang.String str14 = label0.toString();
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putShort((-1));
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("L159729243");
        label0.info = "L159729243";
        java.lang.String str33 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L207568316" + "'", str1, "L207568316");
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L207568316" + "'", str14, "L207568316");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "L207568316" + "'", str33, "L207568316");
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        label0.info = "L311279047";
        java.lang.String str14 = label0.toString();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1695609362" + "'", str10, "L1695609362");
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1695609362" + "'", str14, "L1695609362");
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("L1952313164");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putByte(1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L770765039");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong((long) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.String str20 = label0.toString();
        label0.info = 100L;
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        label0.info = byteVector31;
        org.mockito.asm.ByteVector byteVector34 = byteVector31.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("L1404822831");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) (short) 100);
        java.lang.Class<?> wildcardClass41 = byteVector38.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1345027818" + "'", str20, "L1345027818");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        java.lang.Object obj4 = label0.info;
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.Object obj7 = label0.info;
        java.lang.Object obj8 = label0.info;
        label0.info = "L422954361";
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putInt((int) (short) 10);
        byte[] byteArray22 = null;
        org.mockito.asm.ByteVector byteVector25 = byteVector15.putByteArray(byteArray22, (int) (byte) 1, 100);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt(1);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("L191399149");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt(0);
        label0.info = byteVector29;
        java.lang.Object obj33 = label0.info;
        java.lang.String str34 = label0.toString();
        java.lang.Object obj35 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1476503627" + "'", str1, "L1476503627");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 0 + "'", obj4, (short) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1476503627" + "'", str5, "L1476503627");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 0 + "'", obj7, (short) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(obj33);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "L1476503627" + "'", str34, "L1476503627");
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong(0L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(1L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (short) 100);
        label0.info = byteVector25;
        org.mockito.asm.ByteVector byteVector28 = byteVector25.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("L1775134899");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector34 = byteVector28.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector36 = byteVector28.putShort((int) '4');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2125505194" + "'", str10, "L2125505194");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("L1686161726");
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong((-1L));
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt(0);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte((-1));
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putShort(1);
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putUTF8("L941510936");
        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 100 };
        org.mockito.asm.ByteVector byteVector65 = byteVector55.putByteArray(byteArray62, 0, 1);
        org.mockito.asm.ByteVector byteVector68 = byteVector42.putByteArray(byteArray62, (int) (byte) 0, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector35.putByteArray(byteArray62, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector74 = byteVector16.putByteArray(byteArray62, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[100, 100]");
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("L644109221");
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putUTF8("L1337376893");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("L46931455");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L1717731948");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong(100L);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.String str15 = label0.toString();
        java.lang.String str16 = label0.toString();
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        label17.info = byteVector24;
        java.lang.String str26 = label17.toString();
        label0.info = str26;
        java.lang.Object obj28 = label0.info;
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort((-1));
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong(1L);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putShort((-1));
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("L1150804603");
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putByte((int) '#');
        label0.info = byteVector53;
        org.mockito.asm.ByteVector byteVector56 = byteVector53.putShort(100);
        org.mockito.asm.ByteVector byteVector58 = byteVector53.putLong((long) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1731328107" + "'", str1, "L1731328107");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1731328107" + "'", str15, "L1731328107");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1731328107" + "'", str16, "L1731328107");
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1299079081" + "'", str26, "L1299079081");
// flaky:         org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "L1299079081" + "'", obj28, "L1299079081");
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putByte(0);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putShort(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector3.putUTF8("L253503946");
        org.mockito.asm.ByteVector byteVector13 = byteVector3.putUTF8("L530890065");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.String str2 = label0.toString();
        java.lang.Object obj3 = label0.info;
        java.lang.Object obj4 = label0.info;
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.Object obj7 = label0.info;
        java.lang.String str8 = label0.toString();
        org.mockito.asm.Label label9 = new org.mockito.asm.Label();
        label9.info = ' ';
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt(0);
        label9.info = byteVector16;
        org.mockito.asm.ByteVector byteVector19 = byteVector16.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort(1);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (byte) 1);
        label0.info = byteVector23;
        org.mockito.asm.ByteVector byteVector28 = byteVector23.putUTF8("L1912132955");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putByte((int) (short) -1);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L2088599555" + "'", str1, "L2088599555");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L2088599555" + "'", str2, "L2088599555");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L2088599555" + "'", str5, "L2088599555");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "L2088599555" + "'", str8, "L2088599555");
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByte((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = byteVector18.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(1L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (short) 100);
        label0.info = byteVector25;
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) '4');
        label0.info = byteVector31;
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((-1));
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("L187574180");
        label0.info = byteVector45;
        java.lang.Object obj47 = null;
        label0.info = obj47;
        java.lang.Object obj49 = label0.info;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L2024924689" + "'", str10, "L2024924689");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        org.mockito.asm.ByteVector byteVector20 = byteVector15.putShort(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong(100L);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putUTF8("L452260683");
        java.lang.Class<?> wildcardClass27 = byteVector26.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.String str20 = label0.toString();
        label0.info = 100L;
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        label0.info = byteVector31;
        org.mockito.asm.ByteVector byteVector34 = byteVector31.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("L1404822831");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putUTF8("L692548528");
        org.mockito.asm.ByteVector byteVector42 = byteVector34.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) (byte) 0);
        java.lang.Class<?> wildcardClass45 = byteVector44.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L910687516" + "'", str20, "L910687516");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass34 = byteVector33.getClass();
        label0.info = byteVector33;
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((-1));
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte((int) (short) 10);
        label0.info = (short) 10;
        java.lang.Object obj48 = label0.info;
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong((long) (short) 0);
        label0.info = byteVector55;
        org.mockito.asm.ByteVector byteVector58 = byteVector55.putInt(100);
        org.mockito.asm.ByteVector byteVector60 = byteVector55.putInt((-1));
        java.lang.Class<?> wildcardClass61 = byteVector55.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L523017529" + "'", str22, "L523017529");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("L1551169447");
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putInt(0);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector11 = byteVector3.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putShort(10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("L1283304869");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("L280639558");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        label0.info = byteVector10;
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(0);
        label0.info = byteVector20;
        java.lang.Object obj24 = label0.info;
        java.lang.String str25 = label0.toString();
        label0.info = "L872257691";
        java.lang.String str28 = label0.toString();
        java.lang.String str29 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L609798573" + "'", str1, "L609798573");
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L609798573" + "'", str25, "L609798573");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L609798573" + "'", str28, "L609798573");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L609798573" + "'", str29, "L609798573");
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.String str13 = label0.toString();
        label0.info = "L368366164";
        java.lang.String str16 = label0.toString();
        java.lang.String str17 = label0.toString();
        java.lang.String str18 = label0.toString();
        java.lang.String str19 = label0.toString();
        java.lang.String str20 = label0.toString();
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector25.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt(100);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putUTF8("L917649164");
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) (byte) 0);
        label0.info = byteVector43;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1865889250" + "'", str1, "L1865889250");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "L1865889250" + "'", str13, "L1865889250");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1865889250" + "'", str16, "L1865889250");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1865889250" + "'", str17, "L1865889250");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L1865889250" + "'", str18, "L1865889250");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1865889250" + "'", str19, "L1865889250");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1865889250" + "'", str20, "L1865889250");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L1512711453");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putInt(0);
        org.mockito.asm.ByteVector byteVector35 = byteVector29.putByte(100);
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putShort((-1));
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        byte[] byteArray47 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector50 = byteVector40.putByteArray(byteArray47, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector53 = byteVector35.putByteArray(byteArray47, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector56 = byteVector28.putByteArray(byteArray47, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray47), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt((-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort(1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        label0.info = byteVector17;
        java.lang.String str19 = label0.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        label20.info = byteVector27;
        java.lang.Object obj29 = label20.info;
        java.lang.String str30 = label20.toString();
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong(1L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte((int) (short) 100);
        label20.info = byteVector45;
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) '4');
        label20.info = byteVector51;
        java.lang.Object obj53 = label20.info;
        label0.info = label20;
        java.lang.String str55 = label0.toString();
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putShort((-1));
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector66 = byteVector60.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("L187574180");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector72 = byteVector66.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector74 = byteVector66.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putShort((int) (short) 10);
        label0.info = byteVector74;
        java.lang.String str78 = label0.toString();
        java.lang.Object obj79 = label0.info;
        org.mockito.asm.ByteVector byteVector80 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector82 = byteVector80.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector84 = byteVector80.putInt(0);
        org.mockito.asm.ByteVector byteVector86 = byteVector80.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector88 = byteVector86.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector86.putByte((int) ' ');
        org.mockito.asm.ByteVector byteVector92 = byteVector90.putByte((int) (byte) 100);
        label0.info = (byte) 100;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L422198798" + "'", str10, "L422198798");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L422198798" + "'", str19, "L422198798");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1498352370" + "'", str30, "L1498352370");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(obj53);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L422198798" + "'", str55, "L422198798");
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "L422198798" + "'", str78, "L422198798");
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector92);
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((-1));
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector21 = byteVector11.putByteArray(byteArray18, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector6.putByteArray(byteArray18, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector6.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putLong(10L);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putInt(10);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong((long) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((-1));
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector21 = byteVector11.putByteArray(byteArray18, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector6.putByteArray(byteArray18, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector6.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putByte(1);
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putByte(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putInt(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("hi!");
        label0.info = byteVector10;
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(0);
        label0.info = byteVector20;
        java.lang.Object obj24 = label0.info;
        java.lang.String str25 = label0.toString();
        label0.info = "L872257691";
        java.lang.String str28 = label0.toString();
        java.lang.Object obj29 = null;
        label0.info = obj29;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1206042176" + "'", str1, "L1206042176");
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(obj24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1206042176" + "'", str25, "L1206042176");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1206042176" + "'", str28, "L1206042176");
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L922707703");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong(100L);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt(10);
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putShort((-1));
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt(1);
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector53.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putShort((-1));
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("hi!");
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector74 = byteVector64.putByteArray(byteArray71, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector77 = byteVector59.putByteArray(byteArray71, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector52.putByteArray(byteArray71, (int) (byte) 1, 1);
        org.mockito.asm.ByteVector byteVector83 = byteVector33.putByteArray(byteArray71, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector86 = byteVector16.putByteArray(byteArray71, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((-1));
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        label12.info = byteVector19;
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) 100);
        label12.info = byteVector27;
        org.mockito.asm.ByteVector byteVector32 = byteVector27.putShort(1);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong(100L);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putUTF8("L1310345801");
        org.mockito.asm.ByteVector byteVector40 = byteVector32.putShort((int) (short) 1);
        label0.info = byteVector32;
        org.mockito.asm.ByteVector byteVector43 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector32.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector47 = byteVector32.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector49 = byteVector32.putUTF8("L843448330");
        org.mockito.asm.ByteVector byteVector51 = byteVector32.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L178636606" + "'", str10, "L178636606");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L763528048");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("L403739921");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("L1951404007");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) '#');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector7 = byteVector1.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("L1761666984");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(1L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (short) 100);
        label0.info = byteVector25;
        org.mockito.asm.ByteVector byteVector28 = byteVector25.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector25.putLong(0L);
        org.mockito.asm.ByteVector byteVector32 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector34 = byteVector25.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector36 = byteVector25.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1100268778" + "'", str10, "L1100268778");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.Object obj10 = label0.info;
        java.lang.Object obj11 = label0.info;
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) 100);
        label0.info = byteVector22;
        label0.info = "L42697657";
        java.lang.String str28 = label0.toString();
        org.mockito.asm.Label label29 = new org.mockito.asm.Label();
        java.lang.String str30 = label29.toString();
        label29.info = (short) 0;
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((-1));
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong((long) 100);
        label29.info = byteVector39;
        java.lang.Object obj43 = label29.info;
        label0.info = obj43;
        java.lang.String str45 = label0.toString();
        org.mockito.asm.ByteVector byteVector46 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putShort((-1));
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putInt(1);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector66 = byteVector60.putUTF8("L2130541591");
        org.mockito.asm.ByteVector byteVector68 = byteVector60.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putUTF8("L368897806");
        label0.info = byteVector70;
        java.lang.Object obj72 = label0.info;
        org.mockito.asm.ByteVector byteVector74 = new org.mockito.asm.ByteVector((int) 'a');
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector78 = byteVector74.putUTF8("L1669961023");
        label0.info = byteVector74;
        java.lang.String str80 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int81 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L2034562022" + "'", str28, "L2034562022");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L441732617" + "'", str30, "L441732617");
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(obj43);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "L2034562022" + "'", str45, "L2034562022");
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(obj72);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "L2034562022" + "'", str80, "L2034562022");
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) '4');
        byte[] byteArray23 = null;
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByteArray(byteArray23, (int) (byte) -1, (int) '#');
        org.mockito.asm.ByteVector byteVector28 = byteVector22.putInt((-1));
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("L763147988");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) '4');
        label0.info = byteVector13;
        label0.info = "L499234616";
        java.lang.String str17 = label0.toString();
        java.lang.Object obj18 = label0.info;
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        org.mockito.asm.ByteVector byteVector25 = byteVector19.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putByte((int) (short) 0);
        label0.info = byteVector29;
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putUTF8("L915554511");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt(1);
        label0.info = byteVector43;
        java.lang.String str47 = label0.toString();
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putByte((-1));
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putShort(1);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putShort(10);
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putByte((-1));
        org.mockito.asm.ByteVector byteVector66 = byteVector60.putUTF8("L1423520051");
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putInt(0);
        label0.info = byteVector66;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L500662441" + "'", str1, "L500662441");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L500662441" + "'", str4, "L500662441");
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L500662441" + "'", str17, "L500662441");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "L499234616" + "'", obj18, "L499234616");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L500662441" + "'", str47, "L500662441");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        label0.info = byteVector17;
        java.lang.String str19 = label0.toString();
        label0.info = '4';
        java.lang.String str22 = label0.toString();
        java.lang.String str23 = label0.toString();
        java.lang.String str24 = label0.toString();
        java.lang.String str25 = label0.toString();
        java.lang.String str26 = label0.toString();
        java.lang.Object obj27 = label0.info;
        java.lang.String str28 = label0.toString();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1285332005" + "'", str10, "L1285332005");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1285332005" + "'", str19, "L1285332005");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1285332005" + "'", str22, "L1285332005");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1285332005" + "'", str23, "L1285332005");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L1285332005" + "'", str24, "L1285332005");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "L1285332005" + "'", str25, "L1285332005");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1285332005" + "'", str26, "L1285332005");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1285332005" + "'", str28, "L1285332005");
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt(0);
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector10 = byteVector7.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector20 = byteVector14.putUTF8("L1216780350");
        org.mockito.asm.ByteVector byteVector22 = byteVector14.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L519090348");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putUTF8("L1227452825");
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        byte[] byteArray3 = null;
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByteArray(byteArray3, (int) (byte) 1, (int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (byte) -1);
        byte[] byteArray11 = null;
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByteArray(byteArray11, 100, (int) (byte) 100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putShort((-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector32.putByteArray(byteArray39, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector45 = byteVector21.putByteArray(byteArray39, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector48 = byteVector16.putByteArray(byteArray39, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        java.lang.String str3 = label0.toString();
        org.mockito.asm.Label label4 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putShort((-1));
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        label4.info = byteVector11;
        java.lang.Object obj13 = label4.info;
        java.lang.String str14 = label4.toString();
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putShort((-1));
        org.mockito.asm.ByteVector byteVector21 = byteVector15.putShort((int) (byte) 10);
        label4.info = byteVector21;
        java.lang.String str23 = label4.toString();
        label4.info = '4';
        java.lang.String str26 = label4.toString();
        java.lang.Object obj27 = label4.info;
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putShort((-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((-1));
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("L499234616");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((-1));
        label4.info = byteVector38;
        label0.info = byteVector38;
        java.lang.Object obj45 = label0.info;
        java.lang.Object obj46 = label0.info;
        java.lang.String str47 = label0.toString();
        java.lang.Object obj48 = label0.info;
        java.lang.Object obj49 = label0.info;
        java.lang.Object obj50 = label0.info;
        org.mockito.asm.ByteVector byteVector52 = new org.mockito.asm.ByteVector((int) (short) 100);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("L940563630");
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt(1);
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt(0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putByte((int) (short) 1);
        label0.info = (short) 1;
        java.lang.String str64 = label0.toString();
        java.lang.String str65 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L2013411151" + "'", str3, "L2013411151");
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L1287347731" + "'", str14, "L1287347731");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "L1287347731" + "'", str23, "L1287347731");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1287347731" + "'", str26, "L1287347731");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + '4' + "'", obj27, '4');
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(obj46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "L2013411151" + "'", str47, "L2013411151");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "L2013411151" + "'", str64, "L2013411151");
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "L2013411151" + "'", str65, "L2013411151");
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte(10);
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putUTF8("L293531580");
        org.mockito.asm.ByteVector byteVector9 = byteVector3.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("L656174469");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putShort((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.String str20 = label0.toString();
        label0.info = 100L;
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(1L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putByte((int) (short) 100);
        label0.info = (short) 100;
        org.mockito.asm.Label label39 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector40 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putShort((-1));
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        label39.info = byteVector46;
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putShort((-1));
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putLong((long) 100);
        label39.info = byteVector54;
        java.lang.Object obj58 = label39.info;
        java.lang.String str59 = label39.toString();
        java.lang.Class<?> wildcardClass60 = label39.getClass();
        label0.info = label39;
        java.lang.Object obj62 = label0.info;
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putShort((-1));
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putLong(0L);
        org.mockito.asm.ByteVector byteVector79 = byteVector75.putUTF8("L644109221");
        org.mockito.asm.ByteVector byteVector81 = byteVector75.putByte(1);
        org.mockito.asm.ByteVector byteVector83 = byteVector81.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector85 = byteVector81.putByte((int) (short) 1);
        label0.info = byteVector85;
        java.lang.String str87 = label0.toString();
        java.lang.Object obj88 = label0.info;
        java.lang.String str89 = label0.toString();
        java.lang.String str90 = label0.toString();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L710428625" + "'", str20, "L710428625");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(obj58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "L1579494872" + "'", str59, "L1579494872");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(obj62);
// flaky:         org.junit.Assert.assertEquals(obj62.toString(), "L1579494872");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj62), "L1579494872");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj62), "L1579494872");
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector85);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "L710428625" + "'", str87, "L710428625");
        org.junit.Assert.assertNotNull(obj88);
// flaky:         org.junit.Assert.assertEquals("'" + str89 + "' != '" + "L710428625" + "'", str89, "L710428625");
// flaky:         org.junit.Assert.assertEquals("'" + str90 + "' != '" + "L710428625" + "'", str90, "L710428625");
    }

    @Test
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        java.lang.String str12 = label0.toString();
        java.lang.Object obj13 = null;
        label0.info = obj13;
        java.lang.String str15 = label0.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = ' ';
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        label16.info = byteVector23;
        org.mockito.asm.ByteVector byteVector26 = byteVector23.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putShort(1);
        label0.info = byteVector26;
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putInt(0);
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putShort((int) (short) 10);
        label0.info = byteVector32;
        org.mockito.asm.ByteVector byteVector41 = byteVector32.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("L385975951");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putUTF8("L1054037877");
        byte[] byteArray46 = null;
        org.mockito.asm.ByteVector byteVector49 = byteVector41.putByteArray(byteArray46, (int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L581362222" + "'", str10, "L581362222");
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L581362222" + "'", str12, "L581362222");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L581362222" + "'", str15, "L581362222");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector49);
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) (-1));
        label0.info = byteVector17;
        label0.info = "L1906504249";
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putInt(0);
        org.mockito.asm.ByteVector byteVector27 = byteVector21.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putShort((-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector42 = byteVector32.putByteArray(byteArray39, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector45 = byteVector27.putByteArray(byteArray39, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector27.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector27.putLong(0L);
        org.mockito.asm.ByteVector byteVector51 = byteVector27.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putByte(0);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putShort((-1));
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector70 = byteVector64.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector71 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putShort((-1));
        org.mockito.asm.ByteVector byteVector77 = byteVector75.putUTF8("hi!");
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector85 = byteVector75.putByteArray(byteArray82, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector88 = byteVector64.putByteArray(byteArray82, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector91 = byteVector57.putByteArray(byteArray82, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector94 = byteVector53.putByteArray(byteArray82, 0, 0);
        label0.info = 0;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray39), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray82), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector91);
        org.junit.Assert.assertNotNull(byteVector94);
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        label0.info = byteVector17;
        java.lang.Object obj19 = label0.info;
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putByte(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putShort((int) '#');
        label0.info = '#';
        java.lang.String str42 = label0.toString();
        java.lang.String str43 = label0.toString();
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector50 = byteVector44.putShort((int) ' ');
        label0.info = byteVector44;
        java.lang.Object obj52 = label0.info;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L575359715" + "'", str10, "L575359715");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L575359715" + "'", str42, "L575359715");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L575359715" + "'", str43, "L575359715");
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("L102640438");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt((int) '4');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.String str15 = label0.toString();
        java.lang.String str16 = label0.toString();
        org.mockito.asm.Label label17 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector18 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("");
        label17.info = byteVector24;
        java.lang.String str26 = label17.toString();
        label0.info = str26;
        java.lang.String str28 = label0.toString();
        java.lang.String str29 = label0.toString();
        java.lang.String str30 = label0.toString();
        org.mockito.asm.Label label31 = new org.mockito.asm.Label();
        label31.info = ' ';
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putInt(0);
        label31.info = byteVector38;
        org.mockito.asm.ByteVector byteVector41 = byteVector38.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putShort(1);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putShort((int) ' ');
        label0.info = byteVector51;
        java.lang.String str53 = label0.toString();
        java.lang.Object obj54 = label0.info;
        java.lang.Object obj55 = label0.info;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1657185579" + "'", str1, "L1657185579");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1657185579" + "'", str15, "L1657185579");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1657185579" + "'", str16, "L1657185579");
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1717255998" + "'", str26, "L1717255998");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "L1657185579" + "'", str28, "L1657185579");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "L1657185579" + "'", str29, "L1657185579");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1657185579" + "'", str30, "L1657185579");
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L1657185579" + "'", str53, "L1657185579");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector12.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector24 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putUTF8("L1126122622");
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putShort((-1));
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putShort((-1));
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector73 = byteVector63.putByteArray(byteArray70, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector76 = byteVector54.putByteArray(byteArray70, (int) (short) 0, 1);
        org.mockito.asm.ByteVector byteVector79 = byteVector41.putByteArray(byteArray70, 0, 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector24.putByteArray(byteArray70, 0, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector82.putUTF8("L323782457");
        java.lang.Class<?> wildcardClass85 = byteVector82.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((-1));
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort(10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((int) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector13 = byteVector7.putUTF8("");
        org.mockito.asm.ByteVector byteVector15 = byteVector7.putLong(10L);
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("L1216780350");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt(100);
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector23 = byteVector17.putLong((long) 'a');
        label0.info = byteVector23;
        org.mockito.asm.ByteVector byteVector26 = byteVector23.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector28 = byteVector23.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector23.putUTF8("L1631949141");
        org.mockito.asm.ByteVector byteVector32 = byteVector23.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("L280507630");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L347820463" + "'", str1, "L347820463");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L347820463" + "'", str4, "L347820463");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L347820463" + "'", str5, "L347820463");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "L347820463" + "'", str6, "L347820463");
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) 'a');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte(0);
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putByte(1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putUTF8("L644109221");
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putUTF8("L1337376893");
        org.mockito.asm.ByteVector byteVector20 = byteVector12.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong(0L);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putShort(1);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("L1764180548");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("L1671309659");
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putByte(100);
        org.mockito.asm.ByteVector byteVector64 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putShort((-1));
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putUTF8("hi!");
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector78 = byteVector68.putByteArray(byteArray75, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector81 = byteVector61.putByteArray(byteArray75, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector52.putByteArray(byteArray75, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector87 = byteVector45.putByteArray(byteArray75, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector90 = byteVector24.putByteArray(byteArray75, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector87);
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(10L);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putUTF8("L1505302579");
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putUTF8("L281063096");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("L1175079635");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        java.lang.Object obj4 = label0.info;
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        java.lang.Object obj7 = label0.info;
        java.lang.Object obj8 = label0.info;
        label0.info = "L422954361";
        java.lang.Object obj11 = label0.info;
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) ' ');
        label0.info = ' ';
        java.lang.String str20 = label0.toString();
        java.lang.String str21 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1068158107" + "'", str1, "L1068158107");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 0 + "'", obj4, (short) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1068158107" + "'", str5, "L1068158107");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (short) 0 + "'", obj7, (short) 0);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 0 + "'", obj8, (short) 0);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "L422954361" + "'", obj11, "L422954361");
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1068158107" + "'", str20, "L1068158107");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "L1068158107" + "'", str21, "L1068158107");
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.Label label1 = new org.mockito.asm.Label();
        label1.info = ' ';
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putInt(0);
        label1.info = byteVector8;
        java.lang.String str10 = label1.toString();
        java.lang.Object obj11 = label1.info;
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((-1));
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector33 = byteVector23.putByteArray(byteArray30, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector36 = byteVector18.putByteArray(byteArray30, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector18.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putLong((-1L));
        label1.info = byteVector42;
        org.mockito.asm.ByteVector byteVector45 = byteVector42.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putByte(1);
        java.lang.Class<?> wildcardClass48 = byteVector47.getClass();
        label0.info = wildcardClass48;
        java.lang.Object obj50 = label0.info;
        java.lang.Class<?> wildcardClass51 = obj50.getClass();
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L651022074" + "'", str10, "L651022074");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray30), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "class org.mockito.asm.ByteVector");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "class org.mockito.asm.ByteVector");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "class org.mockito.asm.ByteVector");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        label0.info = "hi!";
        java.lang.String str15 = label0.toString();
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector16.putByte(100);
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector37 = byteVector27.putByteArray(byteArray34, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector40 = byteVector22.putByteArray(byteArray34, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector22.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putShort((int) (byte) 100);
        label0.info = byteVector42;
        org.mockito.asm.ByteVector byteVector47 = byteVector42.putUTF8("L352039819");
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector53 = byteVector47.putUTF8("L1394066332");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1513828488" + "'", str10, "L1513828488");
        org.junit.Assert.assertNotNull(byteVector13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1513828488" + "'", str15, "L1513828488");
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt(100);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong(1L);
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        label23.info = ' ';
        org.mockito.asm.ByteVector byteVector26 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt(0);
        label23.info = byteVector30;
        org.mockito.asm.ByteVector byteVector33 = byteVector30.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort(1);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector((int) '4');
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte(0);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putShort((-1));
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector58 = byteVector52.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putShort((-1));
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector73 = byteVector63.putByteArray(byteArray70, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector76 = byteVector52.putByteArray(byteArray70, 0, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector79 = byteVector45.putByteArray(byteArray70, (int) (short) 0, 0);
        org.mockito.asm.ByteVector byteVector82 = byteVector41.putByteArray(byteArray70, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector85 = byteVector22.putByteArray(byteArray70, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray70), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector82);
    }

    @Test
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) 'a');
        label0.info = byteVector8;
        java.lang.Object obj16 = label0.info;
        java.lang.Object obj17 = label0.info;
        java.lang.Object obj18 = label0.info;
        java.lang.Object obj19 = label0.info;
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        label20.info = byteVector27;
        java.lang.Object obj29 = label20.info;
        java.lang.String str30 = label20.toString();
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong(1L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte((int) (short) 100);
        label20.info = byteVector45;
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) '4');
        label20.info = byteVector51;
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putShort((-1));
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector67 = byteVector57.putByteArray(byteArray64, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector69 = byteVector57.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector57.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("L788907338");
        label20.info = "L788907338";
        label0.info = label20;
        // The following exception was thrown during execution in test generation
        try {
            int int76 = label20.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + ' ' + "'", obj3, ' ');
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1954700791" + "'", str30, "L1954700791");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray64), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L763528048");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("L22561352");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = byteVector16.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("L922707703");
        label0.info = byteVector32;
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort((-1));
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putLong((long) (byte) 0);
        label0.info = byteVector46;
        label0.info = "L92034654";
        java.lang.String str50 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int51 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L241789956" + "'", str50, "L241789956");
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = label0.info;
        java.lang.String str16 = label0.toString();
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort(100);
        label0.info = byteVector33;
        java.lang.Object obj35 = label0.info;
        java.lang.String str36 = label0.toString();
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putShort((-1));
        org.mockito.asm.ByteVector byteVector43 = byteVector37.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt(100);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("L374832530");
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector53 = byteVector47.putInt(10);
        org.mockito.asm.ByteVector byteVector55 = byteVector47.putInt((int) ' ');
        label0.info = byteVector47;
        java.lang.Class<?> wildcardClass57 = byteVector47.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1267986490" + "'", str1, "L1267986490");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1267986490" + "'", str16, "L1267986490");
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(obj35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1267986490" + "'", str36, "L1267986490");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putByte(1);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector10.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(10L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1311753909");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putUTF8("L602115599");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("L604398027");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.String str15 = label0.toString();
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((-1));
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) (byte) -1);
        label0.info = (byte) -1;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        label30.info = ' ';
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt(0);
        label30.info = byteVector37;
        org.mockito.asm.ByteVector byteVector40 = byteVector37.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector44 = byteVector40.putShort(1);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putLong((long) '#');
        label0.info = '#';
        java.lang.String str48 = label0.toString();
        label0.info = "L380242981";
        java.lang.Object obj51 = label0.info;
        java.lang.Class<?> wildcardClass52 = label0.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L2008448284" + "'", str1, "L2008448284");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L2008448284" + "'", str15, "L2008448284");
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L2008448284" + "'", str48, "L2008448284");
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "L380242981" + "'", obj51, "L380242981");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.String str20 = label0.toString();
        label0.info = 100L;
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        label0.info = byteVector31;
        org.mockito.asm.ByteVector byteVector34 = byteVector31.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector31.putInt(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong(0L);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putShort((-1));
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putInt((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putShort((-1));
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putUTF8("hi!");
        byte[] byteArray69 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector72 = byteVector62.putByteArray(byteArray69, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector75 = byteVector53.putByteArray(byteArray69, (int) (short) 0, 1);
        org.mockito.asm.ByteVector byteVector78 = byteVector36.putByteArray(byteArray69, (int) (short) 1, (int) (byte) 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector36.putLong((long) '#');
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L1849259850" + "'", str20, "L1849259850");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray69), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (short) 10);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) (short) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte((int) (short) -1);
        byte[] byteArray11 = null;
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByteArray(byteArray11, (int) (short) -1, (int) '4');
        byte[] byteArray15 = null;
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putByteArray(byteArray15, (int) (byte) 1, (int) '4');
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((-1));
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putUTF8("L644109221");
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putUTF8("L1337376893");
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putShort(0);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector42 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putInt(0);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putByte(100);
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putShort((-1));
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector63 = byteVector53.putByteArray(byteArray60, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector66 = byteVector48.putByteArray(byteArray60, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector69 = byteVector39.putByteArray(byteArray60, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector72 = byteVector14.putByteArray(byteArray60, (int) (byte) 1, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector74 = byteVector14.putByte((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray60), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = null;
        label0.info = obj15;
        java.lang.Object obj17 = label0.info;
        java.lang.String str18 = label0.toString();
        java.lang.String str19 = label0.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        label20.info = byteVector27;
        java.lang.Object obj29 = label20.info;
        java.lang.String str30 = label20.toString();
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong(1L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte((int) (short) 100);
        label20.info = byteVector45;
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) '4');
        label20.info = byteVector51;
        java.lang.String str53 = label20.toString();
        java.lang.String str54 = label20.toString();
        java.lang.Object obj55 = label20.info;
        java.lang.String str56 = label20.toString();
        java.lang.Object obj57 = label20.info;
        label0.info = label20;
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector59.putShort((-1));
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector71 = byteVector67.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putByte((int) (short) 0);
        label20.info = byteVector75;
        org.mockito.asm.ByteVector byteVector78 = byteVector75.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector80 = byteVector75.putUTF8("L785233520");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L478961974" + "'", str1, "L478961974");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(obj17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "L478961974" + "'", str18, "L478961974");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L478961974" + "'", str19, "L478961974");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L161316181" + "'", str30, "L161316181");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "L161316181" + "'", str53, "L161316181");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L161316181" + "'", str54, "L161316181");
        org.junit.Assert.assertNotNull(obj55);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L161316181" + "'", str56, "L161316181");
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        org.mockito.asm.Label label7 = new org.mockito.asm.Label();
        label7.info = ' ';
        org.mockito.asm.ByteVector byteVector10 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt(0);
        label7.info = byteVector14;
        org.mockito.asm.ByteVector byteVector17 = byteVector14.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putInt((int) 'a');
        label0.info = byteVector19;
        java.lang.Object obj23 = label0.info;
        java.lang.Object obj24 = label0.info;
        java.lang.Object obj25 = label0.info;
        org.mockito.asm.Label label26 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putShort((-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        label26.info = byteVector33;
        java.lang.Object obj35 = label26.info;
        java.lang.String str36 = label26.toString();
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        label26.info = "hi!";
        java.lang.Object obj41 = label26.info;
        java.lang.Object obj42 = label26.info;
        label26.info = "";
        java.lang.Object obj45 = label26.info;
        java.lang.String str46 = label26.toString();
        label0.info = label26;
        org.mockito.asm.ByteVector byteVector48 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putShort((-1));
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong(0L);
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt(10);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putUTF8("L917752574");
        org.mockito.asm.ByteVector byteVector72 = byteVector66.putUTF8("L219136701");
        org.mockito.asm.ByteVector byteVector74 = byteVector66.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector76 = byteVector66.putLong((long) ' ');
        label0.info = byteVector76;
        java.lang.String str78 = label0.toString();
        java.lang.Object obj79 = label0.info;
        java.lang.String str80 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L2141522904" + "'", str1, "L2141522904");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L2141522904" + "'", str4, "L2141522904");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L2141522904" + "'", str5, "L2141522904");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 0 + "'", obj6, (short) 0);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(obj35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1650669421" + "'", str36, "L1650669421");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "hi!" + "'", obj41, "hi!");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "hi!" + "'", obj42, "hi!");
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + "" + "'", obj45, "");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "L1650669421" + "'", str46, "L1650669421");
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "L2141522904" + "'", str78, "L2141522904");
        org.junit.Assert.assertNotNull(obj79);
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "L2141522904" + "'", str80, "L2141522904");
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt(1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putUTF8("L102640438");
        java.lang.Class<?> wildcardClass37 = byteVector32.getClass();
        label0.info = byteVector32;
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) (byte) 100);
        label0.info = (byte) 100;
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putShort((-1));
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector63 = byteVector57.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putShort(0);
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putUTF8("L911011818");
        org.mockito.asm.ByteVector byteVector69 = byteVector63.putShort((int) (byte) 1);
        label0.info = (byte) 1;
        java.lang.String str71 = label0.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1648112811" + "'", str1, "L1648112811");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
// flaky:         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "L1648112811" + "'", str71, "L1648112811");
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("L379798012");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("L190384593");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("L1767476288");
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putLong(1L);
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putByte((int) (short) 100);
        label0.info = byteVector25;
        org.mockito.asm.ByteVector byteVector28 = byteVector25.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("L1775134899");
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1123257485" + "'", str10, "L1123257485");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong(0L);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) '4');
        java.lang.Class<?> wildcardClass25 = byteVector24.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector((int) 'a');
        java.lang.Class<?> wildcardClass6 = byteVector5.getClass();
        label0.info = wildcardClass6;
        org.mockito.asm.Label label8 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        label8.info = byteVector15;
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) 100);
        label8.info = byteVector23;
        java.lang.Object obj27 = label8.info;
        java.lang.Object obj28 = label8.info;
        java.lang.Object obj29 = label8.info;
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("L922707703");
        label8.info = byteVector40;
        java.lang.Class<?> wildcardClass42 = byteVector40.getClass();
        label0.info = byteVector40;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putShort((-1));
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        label44.info = byteVector51;
        java.lang.Object obj53 = label44.info;
        java.lang.String str54 = label44.toString();
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putShort((-1));
        org.mockito.asm.ByteVector byteVector61 = byteVector55.putShort((int) (byte) 10);
        label44.info = byteVector61;
        java.lang.Object obj63 = label44.info;
        java.lang.Object obj64 = label44.info;
        java.lang.String str65 = label44.toString();
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putShort((-1));
        org.mockito.asm.ByteVector byteVector72 = byteVector66.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putLong((long) ' ');
        label44.info = byteVector74;
        org.mockito.asm.ByteVector byteVector78 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector80 = byteVector78.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector82 = byteVector78.putShort((-1));
        org.mockito.asm.ByteVector byteVector84 = byteVector82.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector86 = byteVector82.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector88 = byteVector86.putByte(10);
        org.mockito.asm.ByteVector byteVector90 = byteVector86.putLong(100L);
        label44.info = byteVector86;
        java.lang.Object obj92 = label44.info;
        label0.info = label44;
        java.lang.String str94 = label0.toString();
        java.lang.String str95 = label0.toString();
        java.lang.String str96 = label0.toString();
        label0.info = "L918404191";
        java.lang.Class<?> wildcardClass99 = label0.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L447534341" + "'", str1, "L447534341");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(obj53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L2069682360" + "'", str54, "L2069682360");
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj64);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "L2069682360" + "'", str65, "L2069682360");
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(obj92);
// flaky:         org.junit.Assert.assertEquals("'" + str94 + "' != '" + "L447534341" + "'", str94, "L447534341");
// flaky:         org.junit.Assert.assertEquals("'" + str95 + "' != '" + "L447534341" + "'", str95, "L447534341");
// flaky:         org.junit.Assert.assertEquals("'" + str96 + "' != '" + "L447534341" + "'", str96, "L447534341");
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("");
        label0.info = byteVector7;
        java.lang.String str9 = label0.toString();
        java.lang.String str10 = label0.toString();
        java.lang.String str11 = label0.toString();
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        label12.info = ' ';
        org.mockito.asm.ByteVector byteVector15 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putInt(0);
        label12.info = byteVector19;
        org.mockito.asm.ByteVector byteVector22 = byteVector19.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((-1L));
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt((int) '4');
        label0.info = byteVector24;
        java.lang.String str30 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L21711989" + "'", str9, "L21711989");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L21711989" + "'", str10, "L21711989");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L21711989" + "'", str11, "L21711989");
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L21711989" + "'", str30, "L21711989");
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        org.mockito.asm.ByteVector byteVector20 = byteVector15.putShort(1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putLong(100L);
        org.mockito.asm.ByteVector byteVector26 = byteVector20.putUTF8("L1310345801");
        org.mockito.asm.ByteVector byteVector28 = byteVector20.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("L1673143499");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("L826526895");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putByte((-1));
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("L751016234");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("L40895705");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putUTF8("L327667548");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("L803363640");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector6.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong(10L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1216780350");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort(1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.String str15 = label0.toString();
        java.lang.Object obj16 = label0.info;
        java.lang.Object obj17 = null;
        label0.info = obj17;
        java.lang.Object obj19 = label0.info;
        java.lang.Class<?> wildcardClass20 = label0.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L986920615" + "'", str1, "L986920615");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L986920615" + "'", str15, "L986920615");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("L230057508");
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putByte(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L184022116");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((-1L));
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("L1910202461");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putByte(100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        org.mockito.asm.ByteVector byteVector14 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt(1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putUTF8("L102640438");
        java.lang.Class<?> wildcardClass37 = byteVector32.getClass();
        label0.info = byteVector32;
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putInt(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector39.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) (byte) 100);
        label0.info = (byte) 100;
        java.lang.Object obj53 = label0.info;
        java.lang.Class<?> wildcardClass54 = obj53.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L755951829" + "'", str1, "L755951829");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + (byte) 100 + "'", obj53, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 0);
        byte[] byteArray17 = null;
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putByteArray(byteArray17, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector((int) 'a');
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putByte(1);
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putByte((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector9 = byteVector5.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putByte(10);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        java.lang.Object obj3 = label0.info;
        org.mockito.asm.ByteVector byteVector4 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putShort((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) 'a');
        label0.info = byteVector8;
        org.mockito.asm.ByteVector byteVector16 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((-1));
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt(1);
        label0.info = 1;
        org.mockito.asm.Label label30 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        label30.info = byteVector37;
        org.mockito.asm.ByteVector byteVector39 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putShort((-1));
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putLong((long) 100);
        label30.info = byteVector45;
        org.mockito.asm.ByteVector byteVector50 = byteVector45.putShort(100);
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putUTF8("L966497915");
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector58 = byteVector50.putLong((long) (byte) 10);
        label0.info = byteVector58;
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putShort((-1));
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector72 = byteVector66.putUTF8("L2043604017");
        label0.info = byteVector72;
        org.mockito.asm.ByteVector byteVector74 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector78 = byteVector74.putShort((-1));
        org.mockito.asm.ByteVector byteVector80 = byteVector78.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector82 = byteVector80.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector84 = byteVector82.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector86 = byteVector84.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector88 = byteVector86.putLong(0L);
        org.mockito.asm.ByteVector byteVector90 = byteVector88.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector92 = byteVector88.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector94 = byteVector92.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector96 = byteVector92.putShort(100);
        org.mockito.asm.ByteVector byteVector98 = byteVector92.putShort((int) ' ');
        label0.info = ' ';
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + ' ' + "'", obj3, ' ');
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector92);
        org.junit.Assert.assertNotNull(byteVector94);
        org.junit.Assert.assertNotNull(byteVector96);
        org.junit.Assert.assertNotNull(byteVector98);
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt(10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt(100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        label0.info = byteVector17;
        java.lang.String str19 = label0.toString();
        label0.info = '4';
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putShort((-1));
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putUTF8("");
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putLong((long) (-1));
        label0.info = (-1);
        label0.info = "L219136701";
        label0.info = "L1021882862";
        java.lang.String str40 = label0.toString();
        java.lang.Object obj41 = label0.info;
        java.lang.Object obj42 = label0.info;
        java.lang.String str43 = label0.toString();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1187806444" + "'", str10, "L1187806444");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1187806444" + "'", str19, "L1187806444");
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "L1187806444" + "'", str40, "L1187806444");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "L1021882862" + "'", obj41, "L1021882862");
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "L1021882862" + "'", obj42, "L1021882862");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L1187806444" + "'", str43, "L1187806444");
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass34 = byteVector33.getClass();
        label0.info = byteVector33;
        java.lang.String str36 = label0.toString();
        java.lang.Object obj37 = label0.info;
        org.mockito.asm.Label label38 = new org.mockito.asm.Label();
        label38.info = ' ';
        org.mockito.asm.ByteVector byteVector41 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector45 = byteVector41.putInt(0);
        label38.info = byteVector45;
        org.mockito.asm.ByteVector byteVector48 = byteVector45.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putShort(1);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector56 = byteVector52.putInt((int) (short) 1);
        label0.info = byteVector52;
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putShort((-1));
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putInt(1);
        org.mockito.asm.ByteVector byteVector72 = byteVector68.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector80 = byteVector76.putByte(10);
        org.mockito.asm.ByteVector byteVector82 = byteVector76.putByte(0);
        label0.info = byteVector82;
        org.mockito.asm.ByteVector byteVector85 = byteVector82.putInt((-1));
        org.mockito.asm.ByteVector byteVector87 = byteVector82.putLong(0L);
        org.mockito.asm.ByteVector byteVector89 = byteVector82.putLong(100L);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L2092268391" + "'", str22, "L2092268391");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(wildcardClass34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L2092268391" + "'", str36, "L2092268391");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector89);
    }

    @Test
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(10L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1311753909");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("L935722962");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putByte((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("L1236325485");
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((-1));
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putLong(100L);
        org.mockito.asm.ByteVector byteVector30 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putShort((-1));
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putShort(100);
        org.mockito.asm.ByteVector byteVector48 = byteVector42.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector50 = byteVector42.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector52 = byteVector42.putShort(1);
        org.mockito.asm.ByteVector byteVector53 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector57 = byteVector53.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putByte(100);
        org.mockito.asm.ByteVector byteVector60 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putShort((-1));
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("hi!");
        byte[] byteArray71 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector74 = byteVector64.putByteArray(byteArray71, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector77 = byteVector57.putByteArray(byteArray71, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector80 = byteVector42.putByteArray(byteArray71, (int) (short) 0, 1);
        org.mockito.asm.ByteVector byteVector83 = byteVector23.putByteArray(byteArray71, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector86 = byteVector16.putByteArray(byteArray71, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray71), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector83);
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = null;
        label0.info = obj15;
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putLong(10L);
        label0.info = byteVector25;
        org.mockito.asm.ByteVector byteVector28 = byteVector25.putLong(100L);
        byte[] byteArray29 = null;
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putByteArray(byteArray29, (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = byteVector32.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L906475376" + "'", str1, "L906475376");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putUTF8("L2094203655");
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putShort((-1));
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector21 = byteVector11.putByteArray(byteArray18, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector24 = byteVector6.putByteArray(byteArray18, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector6.putUTF8("L729713457");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector32 = byteVector26.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector34 = byteVector26.putUTF8("L850146792");
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putLong((long) 0);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putShort((int) '#');
        java.lang.Class<?> wildcardClass41 = byteVector40.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        label0.info = byteVector17;
        java.lang.String str19 = label0.toString();
        label0.info = '4';
        java.lang.String str22 = label0.toString();
        java.lang.Object obj23 = label0.info;
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(10);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong(100L);
        label0.info = byteVector36;
        org.mockito.asm.ByteVector byteVector39 = byteVector36.putLong(10L);
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector39.putUTF8("L1826732279");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1538338143" + "'", str10, "L1538338143");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1538338143" + "'", str19, "L1538338143");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1538338143" + "'", str22, "L1538338143");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
    }

    @Test
    public void test20684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20684");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        byte[] byteArray3 = null;
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByteArray(byteArray3, (int) (byte) 1, (int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putInt(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20685");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) '#');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putLong((long) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putLong((long) (byte) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putUTF8("L269330132");
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putUTF8("L1299119563");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test20686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20686");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1884637482");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putByte(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20687");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        byte[] byteArray3 = null;
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByteArray(byteArray3, (int) (byte) 1, (int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector2.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector2.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector2.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector2.putInt((int) '#');
        org.mockito.asm.ByteVector byteVector16 = byteVector2.putShort(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector2.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putInt(0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test20688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20688");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.Object obj10 = label0.info;
        java.lang.String str11 = label0.toString();
        org.mockito.asm.ByteVector byteVector12 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort((-1));
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt(1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putLong((long) (short) 1);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("L379798012");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putUTF8("L190384593");
        label0.info = byteVector34;
        org.mockito.asm.ByteVector byteVector37 = byteVector34.putUTF8("L1049379360");
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putShort((-1));
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putLong(0L);
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector56 = byteVector50.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector58 = byteVector50.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector60 = byteVector50.putShort(0);
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector63 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putInt(0);
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector70 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector76 = byteVector72.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putByte((-1));
        org.mockito.asm.ByteVector byteVector80 = byteVector76.putShort(1);
        org.mockito.asm.ByteVector byteVector82 = byteVector80.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector84 = byteVector80.putUTF8("L941510936");
        byte[] byteArray87 = new byte[] { (byte) 100, (byte) 100 };
        org.mockito.asm.ByteVector byteVector90 = byteVector80.putByteArray(byteArray87, 0, 1);
        org.mockito.asm.ByteVector byteVector93 = byteVector67.putByteArray(byteArray87, (int) (byte) 0, 0);
        org.mockito.asm.ByteVector byteVector96 = byteVector62.putByteArray(byteArray87, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector99 = byteVector37.putByteArray(byteArray87, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "L1427567845" + "'", str11, "L1427567845");
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray87), "[100, 100]");
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(byteVector93);
        org.junit.Assert.assertNotNull(byteVector96);
    }

    @Test
    public void test20689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20689");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.String str15 = label0.toString();
        java.lang.String str16 = label0.toString();
        label0.info = "L1404822831";
        java.lang.Object obj19 = label0.info;
        org.mockito.asm.ByteVector byteVector20 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putShort((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putLong(0L);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putUTF8("L644109221");
        org.mockito.asm.ByteVector byteVector38 = byteVector32.putUTF8("L1337376893");
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putShort(0);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putInt((int) (short) 100);
        label0.info = byteVector40;
        org.mockito.asm.Label label44 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector45 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector49 = byteVector45.putShort((-1));
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        label44.info = byteVector51;
        java.lang.Object obj53 = label44.info;
        java.lang.String str54 = label44.toString();
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putShort((-1));
        org.mockito.asm.ByteVector byteVector61 = byteVector55.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putLong(1L);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putByte((int) (short) 100);
        label44.info = byteVector69;
        org.mockito.asm.ByteVector byteVector71 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector75 = byteVector73.putInt((int) '4');
        label44.info = byteVector75;
        java.lang.String str77 = label44.toString();
        java.lang.String str78 = label44.toString();
        java.lang.Object obj79 = label44.info;
        java.lang.String str80 = label44.toString();
        label0.info = label44;
        java.lang.Object obj82 = label0.info;
        java.lang.Object obj83 = label0.info;
        label0.info = "L1441965937";
        java.lang.Class<?> wildcardClass86 = label0.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1757172012" + "'", str1, "L1757172012");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1757172012" + "'", str15, "L1757172012");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L1757172012" + "'", str16, "L1757172012");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "L1404822831" + "'", obj19, "L1404822831");
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(obj53);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L1765200333" + "'", str54, "L1765200333");
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "L1765200333" + "'", str77, "L1765200333");
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "L1765200333" + "'", str78, "L1765200333");
        org.junit.Assert.assertNotNull(obj79);
// flaky:         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "L1765200333" + "'", str80, "L1765200333");
        org.junit.Assert.assertNotNull(obj82);
// flaky:         org.junit.Assert.assertEquals(obj82.toString(), "L1765200333");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj82), "L1765200333");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj82), "L1765200333");
        org.junit.Assert.assertNotNull(obj83);
// flaky:         org.junit.Assert.assertEquals(obj83.toString(), "L1765200333");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "L1765200333");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "L1765200333");
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test20690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20690");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass34 = byteVector33.getClass();
        label0.info = byteVector33;
        org.mockito.asm.ByteVector byteVector36 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putByte((-1));
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putByte((int) (short) 10);
        label0.info = (short) 10;
        java.lang.Object obj48 = label0.info;
        org.mockito.asm.ByteVector byteVector49 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putShort((-1));
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putLong(0L);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putInt(10);
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector71 = byteVector67.putUTF8("L917752574");
        org.mockito.asm.ByteVector byteVector73 = byteVector67.putUTF8("L219136701");
        org.mockito.asm.ByteVector byteVector75 = byteVector67.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector77 = byteVector67.putLong((long) ' ');
        label0.info = byteVector67;
        java.lang.Class<?> wildcardClass79 = byteVector67.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1478743496" + "'", str22, "L1478743496");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + (short) 10 + "'", obj48, (short) 10);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test20691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20691");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("L1022999258");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putInt(100);
        org.mockito.asm.ByteVector byteVector24 = byteVector20.putInt((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = byteVector24.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test20692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20692");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putInt(0);
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (byte) -1);
        java.lang.Class<?> wildcardClass34 = byteVector33.getClass();
        label0.info = byteVector33;
        java.lang.String str36 = label0.toString();
        org.mockito.asm.ByteVector byteVector37 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte(0);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putLong(1L);
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putUTF8("L187574180");
        org.mockito.asm.ByteVector byteVector49 = byteVector43.putInt((int) (byte) 1);
        label0.info = byteVector43;
        java.lang.String str51 = label0.toString();
        java.lang.Object obj52 = label0.info;
        java.lang.Object obj53 = label0.info;
        org.mockito.asm.Label label54 = new org.mockito.asm.Label();
        java.lang.String str55 = label54.toString();
        label54.info = (short) 0;
        java.lang.String str58 = label54.toString();
        org.mockito.asm.ByteVector byteVector59 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putInt(10);
        org.mockito.asm.ByteVector byteVector67 = byteVector63.putLong((long) '4');
        label54.info = byteVector67;
        label0.info = label54;
        java.lang.String str70 = label0.toString();
        org.mockito.asm.ByteVector byteVector71 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector73 = byteVector71.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector75 = byteVector71.putShort((-1));
        org.mockito.asm.ByteVector byteVector77 = byteVector71.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector79 = byteVector77.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector81 = byteVector79.putInt(100);
        org.mockito.asm.ByteVector byteVector83 = byteVector79.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector85 = byteVector79.putLong((long) (byte) 10);
        org.mockito.asm.ByteVector byteVector87 = byteVector85.putInt(10);
        org.mockito.asm.ByteVector byteVector89 = byteVector87.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector91 = byteVector89.putShort((int) (byte) 100);
        label0.info = byteVector91;
        label0.info = "L1699044015";
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1812746628" + "'", str22, "L1812746628");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(wildcardClass34);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "L1812746628" + "'", str36, "L1812746628");
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
// flaky:         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "L1812746628" + "'", str51, "L1812746628");
        org.junit.Assert.assertNotNull(obj52);
        org.junit.Assert.assertNotNull(obj53);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L29229024" + "'", str55, "L29229024");
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "L29229024" + "'", str58, "L29229024");
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "L1812746628" + "'", str70, "L1812746628");
        org.junit.Assert.assertNotNull(byteVector73);
        org.junit.Assert.assertNotNull(byteVector75);
        org.junit.Assert.assertNotNull(byteVector77);
        org.junit.Assert.assertNotNull(byteVector79);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector83);
        org.junit.Assert.assertNotNull(byteVector85);
        org.junit.Assert.assertNotNull(byteVector87);
        org.junit.Assert.assertNotNull(byteVector89);
        org.junit.Assert.assertNotNull(byteVector91);
    }

    @Test
    public void test20693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20693");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.String str9 = label0.toString();
        label0.info = "L732392118";
        java.lang.String str12 = label0.toString();
        org.mockito.asm.Label label13 = new org.mockito.asm.Label();
        java.lang.String str14 = label13.toString();
        label13.info = (short) 0;
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putLong((long) 100);
        label13.info = byteVector23;
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putShort((-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putInt((int) (short) 10);
        label13.info = (short) 10;
        java.lang.Object obj39 = label13.info;
        label0.info = label13;
        org.mockito.asm.Label label41 = new org.mockito.asm.Label();
        java.lang.String str42 = label41.toString();
        java.lang.Object obj43 = label41.info;
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort((-1));
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector52 = byteVector48.putUTF8("L90138980");
        label41.info = byteVector52;
        java.lang.Object obj54 = label41.info;
        java.lang.String str55 = label41.toString();
        java.lang.String str56 = label41.toString();
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putShort((-1));
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector65 = byteVector63.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector67 = byteVector65.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector69 = byteVector67.putInt(1);
        org.mockito.asm.ByteVector byteVector71 = byteVector69.putUTF8("L1443005229");
        label41.info = byteVector71;
        java.lang.Object obj73 = label41.info;
        java.lang.Object obj74 = label41.info;
        java.lang.Object obj75 = label41.info;
        java.lang.Object obj76 = label41.info;
        label0.info = label41;
        java.lang.String str78 = label0.toString();
        java.lang.Object obj79 = label0.info;
        java.lang.Object obj80 = null;
        label0.info = obj80;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "L482453343" + "'", str9, "L482453343");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L482453343" + "'", str12, "L482453343");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "L299146920" + "'", str14, "L299146920");
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + (short) 10 + "'", obj39, (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "L1338443770" + "'", str42, "L1338443770");
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(obj54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L1338443770" + "'", str55, "L1338443770");
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "L1338443770" + "'", str56, "L1338443770");
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector67);
        org.junit.Assert.assertNotNull(byteVector69);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(obj76);
// flaky:         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "L482453343" + "'", str78, "L482453343");
        org.junit.Assert.assertNotNull(obj79);
// flaky:         org.junit.Assert.assertEquals(obj79.toString(), "L1338443770");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "L1338443770");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "L1338443770");
    }

    @Test
    public void test20694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20694");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L922707703");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putInt(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector16 = byteVector8.putLong((long) (short) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putShort((int) '#');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
    }

    @Test
    public void test20695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20695");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.String str2 = label0.toString();
        java.lang.Object obj3 = label0.info;
        java.lang.Object obj4 = label0.info;
        java.lang.String str5 = label0.toString();
        java.lang.Object obj6 = label0.info;
        org.mockito.asm.ByteVector byteVector7 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putInt(0);
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("L542175343");
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putByte(1);
        org.mockito.asm.ByteVector byteVector19 = byteVector15.putShort((int) (byte) 0);
        label0.info = byteVector19;
        org.mockito.asm.ByteVector byteVector22 = byteVector19.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("L1354202105");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1788893765" + "'", str1, "L1788893765");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "L1788893765" + "'", str2, "L1788893765");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L1788893765" + "'", str5, "L1788893765");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test20696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20696");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt(10);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putUTF8("L917752574");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putInt(10);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putInt(10);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("L171193193");
        org.mockito.asm.ByteVector byteVector34 = byteVector30.putUTF8("L1764837379");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
    }

    @Test
    public void test20697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20697");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        org.mockito.asm.ByteVector byteVector20 = byteVector15.putShort(100);
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong(0L);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putInt((int) (short) 1);
        java.lang.Class<?> wildcardClass31 = byteVector26.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test20698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20698");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        java.lang.String str12 = label0.toString();
        java.lang.Object obj13 = null;
        label0.info = obj13;
        java.lang.String str15 = label0.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        label16.info = ' ';
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putInt(0);
        label16.info = byteVector23;
        org.mockito.asm.ByteVector byteVector26 = byteVector23.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector30 = byteVector26.putShort(1);
        label0.info = byteVector26;
        java.lang.Object obj32 = label0.info;
        org.mockito.asm.ByteVector byteVector33 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort((-1));
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt(1);
        org.mockito.asm.ByteVector byteVector47 = byteVector45.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putByte((int) '4');
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putUTF8("L1318068522");
        org.mockito.asm.ByteVector byteVector53 = byteVector47.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector55 = byteVector47.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector57 = byteVector47.putUTF8("L216946776");
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putInt((int) ' ');
        label0.info = byteVector57;
        java.lang.String str61 = label0.toString();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1148719675" + "'", str10, "L1148719675");
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1148719675" + "'", str12, "L1148719675");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1148719675" + "'", str15, "L1148719675");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "L1148719675" + "'", str61, "L1148719675");
    }

    @Test
    public void test20699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20699");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        label0.info = byteVector17;
        java.lang.String str19 = label0.toString();
        label0.info = '4';
        java.lang.String str22 = label0.toString();
        java.lang.Object obj23 = label0.info;
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putByte(0);
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putByte(10);
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putLong(100L);
        label0.info = byteVector36;
        org.mockito.asm.ByteVector byteVector39 = byteVector36.putLong(10L);
        org.mockito.asm.ByteVector byteVector41 = byteVector36.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort((-1));
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector54 = byteVector52.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putInt(1);
        org.mockito.asm.ByteVector byteVector57 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector59 = byteVector57.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector61 = byteVector57.putInt(0);
        org.mockito.asm.ByteVector byteVector63 = byteVector57.putByte(100);
        org.mockito.asm.ByteVector byteVector64 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putShort((-1));
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putUTF8("hi!");
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector78 = byteVector68.putByteArray(byteArray75, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector81 = byteVector63.putByteArray(byteArray75, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector54.putByteArray(byteArray75, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.ByteVector byteVector87 = byteVector43.putByteArray(byteArray75, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1633213849" + "'", str10, "L1633213849");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1633213849" + "'", str19, "L1633213849");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1633213849" + "'", str22, "L1633213849");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + '4' + "'", obj23, '4');
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray75), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector81);
        org.junit.Assert.assertNotNull(byteVector84);
    }

    @Test
    public void test20700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20700");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putByte((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putUTF8("L1082024160");
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putLong((long) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
    }

    @Test
    public void test20701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20701");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (short) 10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putUTF8("L438829987");
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putByte(1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt(1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) (short) 100);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
    }

    @Test
    public void test20702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20702");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte(100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte(0);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putByte(10);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test20703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20703");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putUTF8("L1101244843");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
    }

    @Test
    public void test20704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20704");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putLong(10L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1216780350");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt(100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putLong((long) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putInt(0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(1);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector22 = byteVector20.putByte(100);
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putShort((int) (short) 100);
        java.lang.Class<?> wildcardClass25 = byteVector24.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test20705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20705");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putLong((long) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putInt((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = byteVector14.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20706");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putLong(10L);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt(0);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putUTF8("L187647091");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test20707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20707");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(10L);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1311753909");
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("L260370228");
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt(1);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("L803614317");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20708");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        org.mockito.asm.ByteVector byteVector2 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putShort((-1));
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putLong(10L);
        label0.info = 10L;
        org.mockito.asm.Label label12 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector13 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector17 = byteVector13.putShort((-1));
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        label12.info = byteVector19;
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putLong((long) 100);
        label12.info = byteVector27;
        java.lang.Object obj31 = label12.info;
        java.lang.String str32 = label12.toString();
        label12.info = 100L;
        org.mockito.asm.ByteVector byteVector35 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector39 = byteVector35.putShort((-1));
        org.mockito.asm.ByteVector byteVector41 = byteVector35.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector43 = byteVector35.putUTF8("hi!");
        label12.info = byteVector43;
        label0.info = label12;
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putUTF8("L1551169447");
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt(0);
        org.mockito.asm.ByteVector byteVector53 = byteVector49.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector55 = byteVector53.putLong((long) 1);
        label12.info = byteVector53;
        java.lang.String str57 = label12.toString();
        org.mockito.asm.ByteVector byteVector58 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putShort((-1));
        org.mockito.asm.ByteVector byteVector64 = byteVector62.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector72 = byteVector68.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("L993883100");
        label12.info = byteVector74;
        java.lang.Object obj76 = label12.info;
        java.lang.String str77 = label12.toString();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L2139878783" + "'", str1, "L2139878783");
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(obj31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "L25787798" + "'", str32, "L25787798");
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
// flaky:         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "L25787798" + "'", str57, "L25787798");
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(obj76);
// flaky:         org.junit.Assert.assertEquals("'" + str77 + "' != '" + "L25787798" + "'", str77, "L25787798");
    }

    @Test
    public void test20709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20709");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        java.lang.Object obj2 = label0.info;
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putShort((-1));
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = byteVector7.putUTF8("L90138980");
        label0.info = byteVector11;
        java.lang.Object obj13 = label0.info;
        java.lang.Object obj14 = label0.info;
        java.lang.Object obj15 = label0.info;
        java.lang.String str16 = label0.toString();
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putShort(100);
        label0.info = byteVector33;
        org.mockito.asm.ByteVector byteVector36 = byteVector33.putLong((long) (short) 10);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putByte(0);
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putShort((int) (short) 0);
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putInt((int) (short) 100);
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putLong((long) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L186844953" + "'", str1, "L186844953");
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "L186844953" + "'", str16, "L186844953");
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
    }

    @Test
    public void test20710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20710");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putInt(0);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putInt(100);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putByte((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putByte(100);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putLong((long) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
    }

    @Test
    public void test20711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20711");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        org.mockito.asm.ByteVector byteVector22 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector24 = byteVector22.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector26 = byteVector22.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector32 = byteVector30.putUTF8("L922707703");
        label0.info = byteVector32;
        org.mockito.asm.ByteVector byteVector34 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector36 = byteVector34.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector38 = byteVector34.putShort((-1));
        org.mockito.asm.ByteVector byteVector40 = byteVector34.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector42 = byteVector40.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector44 = byteVector42.putByte((int) (short) -1);
        org.mockito.asm.ByteVector byteVector46 = byteVector42.putLong((long) (byte) 0);
        label0.info = byteVector46;
        java.lang.String str48 = label0.toString();
        java.lang.Object obj49 = label0.info;
        java.lang.String str50 = label0.toString();
        java.lang.Class<?> wildcardClass51 = label0.getClass();
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "L2143997436" + "'", str48, "L2143997436");
        org.junit.Assert.assertNotNull(obj49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "L2143997436" + "'", str50, "L2143997436");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test20712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20712");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort(10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putInt(1);
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putInt(0);
        org.mockito.asm.ByteVector byteVector30 = byteVector24.putByte(100);
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putUTF8("hi!");
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector45 = byteVector35.putByteArray(byteArray42, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector48 = byteVector30.putByteArray(byteArray42, 1, (int) (short) 0);
        org.mockito.asm.ByteVector byteVector51 = byteVector21.putByteArray(byteArray42, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector54 = byteVector10.putByteArray(byteArray42, 0, 0);
        java.lang.Class<?> wildcardClass55 = byteVector10.getClass();
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray42), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test20713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20713");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong(0L);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putInt((-1));
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("L763528048");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte(0);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putInt((-1));
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putLong((long) (short) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
    }

    @Test
    public void test20714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20714");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.String str1 = label0.toString();
        label0.info = (short) 0;
        java.lang.String str4 = label0.toString();
        org.mockito.asm.ByteVector byteVector5 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector9 = byteVector7.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putInt(10);
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putLong((long) '4');
        label0.info = byteVector13;
        label0.info = "L499234616";
        java.lang.String str17 = label0.toString();
        java.lang.Object obj18 = label0.info;
        org.mockito.asm.ByteVector byteVector19 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector21 = byteVector19.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector23 = byteVector19.putShort((-1));
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putLong(0L);
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putLong((long) 1);
        java.lang.Class<?> wildcardClass40 = byteVector39.getClass();
        label0.info = wildcardClass40;
        java.lang.Object obj42 = label0.info;
        java.lang.String str43 = label0.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int44 = label0.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "L1002503370" + "'", str1, "L1002503370");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L1002503370" + "'", str4, "L1002503370");
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector9);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "L1002503370" + "'", str17, "L1002503370");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "L499234616" + "'", obj18, "L499234616");
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "class org.mockito.asm.ByteVector");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "class org.mockito.asm.ByteVector");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "class org.mockito.asm.ByteVector");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "L1002503370" + "'", str43, "L1002503370");
    }

    @Test
    public void test20715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20715");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putShort(0);
        org.mockito.asm.ByteVector byteVector14 = byteVector8.putInt(10);
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) '4');
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putUTF8("L1697506410");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putInt((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20716");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("hi!");
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putByteArray(byteArray11, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector4.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("L713879861");
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putUTF8("L596369166");
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putShort((-1));
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putUTF8("L1313315203");
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putShort(1);
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putByte(0);
        org.mockito.asm.ByteVector byteVector32 = byteVector28.putLong((long) (byte) 10);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector32);
    }

    @Test
    public void test20717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20717");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putByte(0);
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putLong(1L);
        org.mockito.asm.ByteVector byteVector10 = byteVector4.putShort((int) (short) -1);
        org.mockito.asm.ByteVector byteVector12 = byteVector4.putUTF8("L1923921447");
        org.mockito.asm.ByteVector byteVector14 = byteVector4.putUTF8("L1922910541");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
    }

    @Test
    public void test20718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20718");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector12 = byteVector6.putByte((int) 'a');
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putByte(100);
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putLong((long) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20719");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        label0.info = "hi!";
        java.lang.Object obj15 = label0.info;
        java.lang.Object obj16 = label0.info;
        label0.info = "";
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector37 = byteVector35.putLong(0L);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putByte((int) '#');
        org.mockito.asm.ByteVector byteVector41 = byteVector37.putInt((int) (short) 1);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putLong((long) 1);
        label0.info = byteVector43;
        org.mockito.asm.Label label45 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector46 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector50 = byteVector46.putShort((-1));
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("");
        label45.info = byteVector52;
        java.lang.String str54 = label45.toString();
        java.lang.String str55 = label45.toString();
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putLong((long) 10);
        org.mockito.asm.ByteVector byteVector64 = byteVector60.putLong((long) 'a');
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("L230057508");
        label45.info = byteVector66;
        java.lang.Object obj70 = label45.info;
        label0.info = label45;
        org.mockito.asm.ByteVector byteVector72 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector76 = byteVector72.putShort((-1));
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector80 = byteVector76.putUTF8("L90138980");
        org.mockito.asm.ByteVector byteVector82 = byteVector76.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector84 = byteVector82.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector86 = byteVector84.putInt(10);
        org.mockito.asm.ByteVector byteVector88 = byteVector84.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector90 = byteVector84.putInt(100);
        label45.info = byteVector90;
        java.lang.Object obj92 = label45.info;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1978705874" + "'", str10, "L1978705874");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "" + "'", obj21, "");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1978705874" + "'", str22, "L1978705874");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector52);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "L148196824" + "'", str54, "L148196824");
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "L148196824" + "'", str55, "L148196824");
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector64);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertNotNull(byteVector86);
        org.junit.Assert.assertNotNull(byteVector88);
        org.junit.Assert.assertNotNull(byteVector90);
        org.junit.Assert.assertNotNull(obj92);
    }

    @Test
    public void test20720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20720");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        org.mockito.asm.ByteVector byteVector11 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector13 = byteVector11.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector15 = byteVector11.putShort((-1));
        org.mockito.asm.ByteVector byteVector17 = byteVector11.putShort((int) (byte) 10);
        label0.info = byteVector17;
        java.lang.String str19 = label0.toString();
        org.mockito.asm.Label label20 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("hi!");
        label20.info = byteVector27;
        java.lang.Object obj29 = label20.info;
        java.lang.String str30 = label20.toString();
        org.mockito.asm.ByteVector byteVector31 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector33 = byteVector31.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector35 = byteVector31.putShort((-1));
        org.mockito.asm.ByteVector byteVector37 = byteVector31.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector39 = byteVector37.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector41 = byteVector39.putLong(1L);
        org.mockito.asm.ByteVector byteVector43 = byteVector41.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putByte((int) (short) 100);
        label20.info = byteVector45;
        org.mockito.asm.ByteVector byteVector47 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector51 = byteVector49.putInt((int) '4');
        label20.info = byteVector51;
        java.lang.Object obj53 = label20.info;
        label0.info = label20;
        org.mockito.asm.Label label55 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector56 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector58 = byteVector56.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector60 = byteVector56.putShort((-1));
        org.mockito.asm.ByteVector byteVector62 = byteVector60.putUTF8("hi!");
        label55.info = byteVector62;
        org.mockito.asm.ByteVector byteVector64 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector66 = byteVector64.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector68 = byteVector64.putShort((-1));
        org.mockito.asm.ByteVector byteVector70 = byteVector68.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putLong((long) 100);
        label55.info = byteVector70;
        java.lang.Object obj74 = label55.info;
        java.lang.Object obj75 = label55.info;
        java.lang.Object obj76 = label55.info;
        label0.info = label55;
        java.lang.Object obj78 = label55.info;
        java.lang.String str79 = label55.toString();
        java.lang.Object obj80 = label55.info;
        // The following exception was thrown during execution in test generation
        try {
            int int81 = label55.getOffset();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Label offset position has not been resolved yet");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1191572854" + "'", str10, "L1191572854");
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "L1191572854" + "'", str19, "L1191572854");
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(obj29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "L1719388363" + "'", str30, "L1719388363");
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(byteVector66);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNotNull(obj78);
// flaky:         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "L1410141728" + "'", str79, "L1410141728");
        org.junit.Assert.assertNotNull(obj80);
    }

    @Test
    public void test20721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20721");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        label0.info = ' ';
        org.mockito.asm.ByteVector byteVector3 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector5 = byteVector3.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector7 = byteVector3.putInt(0);
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector10 = byteVector7.putUTF8("L778582462");
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putLong(0L);
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putUTF8("L1562088166");
        org.mockito.asm.ByteVector byteVector16 = byteVector14.putShort((int) (byte) -1);
        org.mockito.asm.ByteVector byteVector18 = byteVector14.putShort(1);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
    }

    @Test
    public void test20722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20722");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        java.lang.Object obj9 = label0.info;
        java.lang.String str10 = label0.toString();
        java.lang.Object obj11 = label0.info;
        java.lang.String str12 = label0.toString();
        java.lang.Object obj13 = null;
        label0.info = obj13;
        java.lang.String str15 = label0.toString();
        org.mockito.asm.Label label16 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector17 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector19 = byteVector17.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector21 = byteVector17.putShort((-1));
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        label16.info = byteVector23;
        java.lang.Object obj25 = label16.info;
        java.lang.String str26 = label16.toString();
        org.mockito.asm.ByteVector byteVector27 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector29 = byteVector27.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector31 = byteVector27.putShort((-1));
        org.mockito.asm.ByteVector byteVector33 = byteVector27.putShort((int) (byte) 10);
        label16.info = byteVector33;
        java.lang.Object obj35 = label16.info;
        java.lang.Object obj36 = label16.info;
        java.lang.String str37 = label16.toString();
        org.mockito.asm.ByteVector byteVector38 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector42 = byteVector38.putShort((-1));
        org.mockito.asm.ByteVector byteVector44 = byteVector38.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putShort((int) (byte) 100);
        org.mockito.asm.ByteVector byteVector48 = byteVector46.putLong((long) ' ');
        label16.info = byteVector46;
        org.mockito.asm.ByteVector byteVector50 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector52 = byteVector50.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector54 = byteVector50.putShort((-1));
        org.mockito.asm.ByteVector byteVector56 = byteVector54.putLong((long) '4');
        org.mockito.asm.ByteVector byteVector58 = byteVector54.putShort((int) (byte) 0);
        org.mockito.asm.ByteVector byteVector60 = byteVector58.putByte(10);
        org.mockito.asm.ByteVector byteVector62 = byteVector58.putLong(100L);
        label16.info = byteVector58;
        java.lang.Object obj64 = label16.info;
        label0.info = label16;
        org.mockito.asm.ByteVector byteVector66 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector68 = byteVector66.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector70 = byteVector66.putShort((-1));
        org.mockito.asm.ByteVector byteVector72 = byteVector70.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector74 = byteVector72.putInt((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putUTF8("L1663430528");
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector80 = byteVector76.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector82 = byteVector80.putUTF8("L917836053");
        org.mockito.asm.ByteVector byteVector84 = byteVector80.putLong((long) (short) -1);
        label0.info = (short) -1;
        java.lang.Object obj86 = label0.info;
        java.lang.String str87 = label0.toString();
        label0.info = "L470560884";
        java.lang.Object obj90 = label0.info;
        label0.info = "L795512646";
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "L1151134886" + "'", str10, "L1151134886");
        org.junit.Assert.assertNotNull(obj11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "L1151134886" + "'", str12, "L1151134886");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "L1151134886" + "'", str15, "L1151134886");
        org.junit.Assert.assertNotNull(byteVector19);
        org.junit.Assert.assertNotNull(byteVector21);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(obj25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "L1026745889" + "'", str26, "L1026745889");
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(obj36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "L1026745889" + "'", str37, "L1026745889");
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(byteVector42);
        org.junit.Assert.assertNotNull(byteVector44);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector52);
        org.junit.Assert.assertNotNull(byteVector54);
        org.junit.Assert.assertNotNull(byteVector56);
        org.junit.Assert.assertNotNull(byteVector58);
        org.junit.Assert.assertNotNull(byteVector60);
        org.junit.Assert.assertNotNull(byteVector62);
        org.junit.Assert.assertNotNull(obj64);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector70);
        org.junit.Assert.assertNotNull(byteVector72);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
        org.junit.Assert.assertNotNull(byteVector80);
        org.junit.Assert.assertNotNull(byteVector82);
        org.junit.Assert.assertNotNull(byteVector84);
        org.junit.Assert.assertEquals("'" + obj86 + "' != '" + (short) -1 + "'", obj86, (short) -1);
// flaky:         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "L1151134886" + "'", str87, "L1151134886");
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + "L470560884" + "'", obj90, "L470560884");
    }

    @Test
    public void test20723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20723");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector6 = byteVector0.putShort((int) ' ');
        org.mockito.asm.ByteVector byteVector8 = byteVector0.putByte(10);
        org.mockito.asm.ByteVector byteVector10 = byteVector0.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putInt((int) (short) -1);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte(10);
        org.mockito.asm.ByteVector byteVector18 = byteVector10.putInt(10);
        org.mockito.asm.ByteVector byteVector20 = byteVector10.putInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
    }

    @Test
    public void test20724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20724");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putLong((long) (short) -1);
        org.mockito.asm.ByteVector byteVector4 = byteVector2.putInt((int) '4');
        org.mockito.asm.ByteVector byteVector6 = byteVector2.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector8 = byteVector6.putByte((-1));
        org.mockito.asm.ByteVector byteVector10 = byteVector6.putShort(1);
        org.mockito.asm.ByteVector byteVector12 = byteVector10.putByte((int) (short) 100);
        org.mockito.asm.ByteVector byteVector14 = byteVector10.putUTF8("L88262203");
        org.mockito.asm.ByteVector byteVector16 = byteVector10.putByte(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector16.putUTF8("L157527163");
        org.mockito.asm.ByteVector byteVector20 = byteVector16.putShort((int) '#');
        org.mockito.asm.ByteVector byteVector21 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector23 = byteVector21.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector25 = byteVector21.putShort((-1));
        org.mockito.asm.ByteVector byteVector27 = byteVector25.putUTF8("");
        org.mockito.asm.ByteVector byteVector29 = byteVector25.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector31 = byteVector29.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector33 = byteVector29.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector35 = byteVector33.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector37 = byteVector33.putShort(100);
        org.mockito.asm.ByteVector byteVector39 = byteVector33.putShort((int) 'a');
        org.mockito.asm.ByteVector byteVector41 = byteVector33.putLong((long) (byte) 100);
        org.mockito.asm.ByteVector byteVector43 = byteVector33.putShort(1);
        org.mockito.asm.ByteVector byteVector44 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector46 = byteVector44.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector48 = byteVector44.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector50 = byteVector48.putByte(100);
        org.mockito.asm.ByteVector byteVector51 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector53 = byteVector51.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector55 = byteVector51.putShort((-1));
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        org.mockito.asm.ByteVector byteVector65 = byteVector55.putByteArray(byteArray62, 0, (int) (short) 1);
        org.mockito.asm.ByteVector byteVector68 = byteVector48.putByteArray(byteArray62, (int) (byte) 1, 0);
        org.mockito.asm.ByteVector byteVector71 = byteVector33.putByteArray(byteArray62, (int) (short) 0, 1);
        org.mockito.asm.ByteVector byteVector74 = byteVector20.putByteArray(byteArray62, (int) (short) 1, (int) (byte) 1);
        org.mockito.asm.ByteVector byteVector76 = byteVector74.putByte((int) (short) 1);
        org.mockito.asm.ByteVector byteVector78 = byteVector76.putUTF8("L834893843");
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector23);
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector33);
        org.junit.Assert.assertNotNull(byteVector35);
        org.junit.Assert.assertNotNull(byteVector37);
        org.junit.Assert.assertNotNull(byteVector39);
        org.junit.Assert.assertNotNull(byteVector41);
        org.junit.Assert.assertNotNull(byteVector43);
        org.junit.Assert.assertNotNull(byteVector46);
        org.junit.Assert.assertNotNull(byteVector48);
        org.junit.Assert.assertNotNull(byteVector50);
        org.junit.Assert.assertNotNull(byteVector53);
        org.junit.Assert.assertNotNull(byteVector55);
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray62), "[1, 0, 100, -1]");
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(byteVector68);
        org.junit.Assert.assertNotNull(byteVector71);
        org.junit.Assert.assertNotNull(byteVector74);
        org.junit.Assert.assertNotNull(byteVector76);
        org.junit.Assert.assertNotNull(byteVector78);
    }

    @Test
    public void test20725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20725");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.String str20 = label0.toString();
        label0.info = 100L;
        org.mockito.asm.ByteVector byteVector23 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector25 = byteVector23.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector27 = byteVector23.putShort((-1));
        org.mockito.asm.ByteVector byteVector29 = byteVector23.putShort((int) (byte) 10);
        org.mockito.asm.ByteVector byteVector31 = byteVector23.putUTF8("hi!");
        label0.info = byteVector31;
        org.mockito.asm.ByteVector byteVector34 = byteVector31.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector36 = byteVector31.putInt(100);
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector40 = byteVector36.putUTF8("L1236199348");
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "L216897317" + "'", str20, "L216897317");
        org.junit.Assert.assertNotNull(byteVector25);
        org.junit.Assert.assertNotNull(byteVector27);
        org.junit.Assert.assertNotNull(byteVector29);
        org.junit.Assert.assertNotNull(byteVector31);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
    }

    @Test
    public void test20726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20726");
        org.mockito.asm.ByteVector byteVector0 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector2 = byteVector0.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector4 = byteVector0.putShort((-1));
        org.mockito.asm.ByteVector byteVector6 = byteVector4.putUTF8("");
        org.mockito.asm.ByteVector byteVector8 = byteVector4.putUTF8("L386554824");
        org.mockito.asm.ByteVector byteVector10 = byteVector8.putShort((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector12 = byteVector8.putLong((long) (-1));
        org.mockito.asm.ByteVector byteVector14 = byteVector12.putLong((long) (byte) 1);
        org.mockito.asm.ByteVector byteVector16 = byteVector12.putShort(100);
        org.mockito.asm.ByteVector byteVector18 = byteVector12.putInt(0);
        org.mockito.asm.ByteVector byteVector20 = byteVector18.putByte((int) (short) 10);
        org.mockito.asm.ByteVector byteVector22 = byteVector18.putByte((int) (short) 0);
        org.mockito.asm.ByteVector byteVector24 = byteVector18.putInt(10);
        org.mockito.asm.ByteVector byteVector26 = byteVector18.putInt((-1));
        org.mockito.asm.ByteVector byteVector28 = byteVector26.putByte((int) ' ');
        org.junit.Assert.assertNotNull(byteVector2);
        org.junit.Assert.assertNotNull(byteVector4);
        org.junit.Assert.assertNotNull(byteVector6);
        org.junit.Assert.assertNotNull(byteVector8);
        org.junit.Assert.assertNotNull(byteVector10);
        org.junit.Assert.assertNotNull(byteVector12);
        org.junit.Assert.assertNotNull(byteVector14);
        org.junit.Assert.assertNotNull(byteVector16);
        org.junit.Assert.assertNotNull(byteVector18);
        org.junit.Assert.assertNotNull(byteVector20);
        org.junit.Assert.assertNotNull(byteVector22);
        org.junit.Assert.assertNotNull(byteVector24);
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
    }

    @Test
    public void test20727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20727");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector1 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector3 = byteVector1.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector5 = byteVector1.putShort((-1));
        org.mockito.asm.ByteVector byteVector7 = byteVector5.putUTF8("hi!");
        label0.info = byteVector7;
        org.mockito.asm.ByteVector byteVector9 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector11 = byteVector9.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector13 = byteVector9.putShort((-1));
        org.mockito.asm.ByteVector byteVector15 = byteVector13.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector17 = byteVector15.putLong((long) 100);
        label0.info = byteVector15;
        java.lang.Object obj19 = label0.info;
        java.lang.Object obj20 = label0.info;
        java.lang.Object obj21 = label0.info;
        java.lang.String str22 = label0.toString();
        org.mockito.asm.Label label23 = new org.mockito.asm.Label();
        org.mockito.asm.ByteVector byteVector24 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector26 = byteVector24.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector28 = byteVector24.putShort((-1));
        org.mockito.asm.ByteVector byteVector30 = byteVector28.putUTF8("hi!");
        label23.info = byteVector30;
        org.mockito.asm.ByteVector byteVector32 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector34 = byteVector32.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector36 = byteVector32.putShort((-1));
        org.mockito.asm.ByteVector byteVector38 = byteVector36.putInt((int) 'a');
        org.mockito.asm.ByteVector byteVector40 = byteVector38.putLong((long) 100);
        label23.info = byteVector38;
        java.lang.Object obj42 = label23.info;
        org.mockito.asm.ByteVector byteVector43 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector45 = byteVector43.putInt((int) ' ');
        org.mockito.asm.ByteVector byteVector47 = byteVector43.putShort((int) (short) 1);
        org.mockito.asm.ByteVector byteVector49 = byteVector47.putInt((int) (byte) 1);
        org.mockito.asm.ByteVector byteVector51 = byteVector47.putLong((long) (-1));
        label23.info = (-1);
        label0.info = label23;
        java.lang.Object obj54 = label0.info;
        org.mockito.asm.ByteVector byteVector55 = new org.mockito.asm.ByteVector();
        org.mockito.asm.ByteVector byteVector57 = byteVector55.putUTF8("hi!");
        org.mockito.asm.ByteVector byteVector59 = byteVector55.putLong((long) (byte) 0);
        org.mockito.asm.ByteVector byteVector61 = byteVector59.putByte(0);
        org.mockito.asm.ByteVector byteVector63 = byteVector61.putByte(100);
        org.mockito.asm.ByteVector byteVector65 = byteVector61.putUTF8("L855288385");
        label0.info = byteVector65;
        java.lang.Object obj67 = label0.info;
        java.lang.Object obj68 = label0.info;
        org.junit.Assert.assertNotNull(byteVector3);
        org.junit.Assert.assertNotNull(byteVector5);
        org.junit.Assert.assertNotNull(byteVector7);
        org.junit.Assert.assertNotNull(byteVector11);
        org.junit.Assert.assertNotNull(byteVector13);
        org.junit.Assert.assertNotNull(byteVector15);
        org.junit.Assert.assertNotNull(byteVector17);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "L1164200647" + "'", str22, "L1164200647");
        org.junit.Assert.assertNotNull(byteVector26);
        org.junit.Assert.assertNotNull(byteVector28);
        org.junit.Assert.assertNotNull(byteVector30);
        org.junit.Assert.assertNotNull(byteVector34);
        org.junit.Assert.assertNotNull(byteVector36);
        org.junit.Assert.assertNotNull(byteVector38);
        org.junit.Assert.assertNotNull(byteVector40);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertNotNull(byteVector45);
        org.junit.Assert.assertNotNull(byteVector47);
        org.junit.Assert.assertNotNull(byteVector49);
        org.junit.Assert.assertNotNull(byteVector51);
        org.junit.Assert.assertNotNull(obj54);
// flaky:         org.junit.Assert.assertEquals(obj54.toString(), "L757306460");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "L757306460");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "L757306460");
        org.junit.Assert.assertNotNull(byteVector57);
        org.junit.Assert.assertNotNull(byteVector59);
        org.junit.Assert.assertNotNull(byteVector61);
        org.junit.Assert.assertNotNull(byteVector63);
        org.junit.Assert.assertNotNull(byteVector65);
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertNotNull(obj68);
    }
}
